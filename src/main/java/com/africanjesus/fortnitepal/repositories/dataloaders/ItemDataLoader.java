package com.africanjesus.fortnitepal.repositories.dataloaders;

import com.africanjesus.fortnitepal.ItemType;
import com.africanjesus.fortnitepal.RarityType;
import com.africanjesus.fortnitepal.ReleaseStatus;
import com.africanjesus.fortnitepal.model.documents.Item;
import com.africanjesus.fortnitepal.model.documents.Obtained;
import com.africanjesus.fortnitepal.services.ItemServiceImpl;
import com.opencsv.CSVReader;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

@Component
public class ItemDataLoader implements CommandLineRunner {

    private final Logger logger = LoggerFactory.getLogger(ItemDataLoader.class);
    private String url = "https://s3.us-east-2.amazonaws.com/fortnitepal/images";
    private final ItemServiceImpl itemServiceImpl;
    private List<Item> itemsInDB;

    @Autowired
    public ItemDataLoader(ItemServiceImpl itemServiceImpl) {
        this.itemServiceImpl = itemServiceImpl;
    }
    //Test

    @Override
    public void run(String... args)  throws Exception{
        logger.info("Loading Item Data ");

        itemsInDB = itemServiceImpl.findAll();
        List<Item> itemsToBeSaved = new ArrayList<>();
        String[] itemInfo;
        Obtained obtained;
        Item item;
        List<String> images;

        //begin reading file
        CSVReader reader = new CSVReader(new FileReader(new File("").getAbsolutePath() + "/src/main/resources/static/fortniteitems.csv"));
        reader.readNext();
        while((itemInfo = reader.readNext()) != null){
            item = new Item();
            obtained  = new Obtained();
            for(int i = 0; i < 1; i++){
                item.setName(itemInfo[1]);
                item.setDesc(itemInfo[2]);
                item.setRarityType(determineRarityTypeByString(itemInfo[3]));

                images = new ArrayList<>();
                if(itemInfo[16].equalsIgnoreCase("outfit")){
                    if(!(itemInfo[4].equals("null"))) {
                        images.add(url + "/outfit/" + itemInfo[4] + ".png");
                    }
                    if(!(itemInfo[5].equals("null"))){
                        images.add(url + "/outfit/" + itemInfo[5] + "-full.png");
                    }
                    if(!(itemInfo[6].equals("null"))){
                        images.add(url + "/outfit/" + itemInfo[6] + "-feature.png");
                    }
                }else if(itemInfo[16].equalsIgnoreCase("backbling")){
                    images.add(url + "/backbling/" + itemInfo[4] + ".png");
                }else if(itemInfo[16].equalsIgnoreCase("emoticon")){
                    images.add(url + "/emoticon/" + itemInfo[4] + ".png");
                }else if(itemInfo[16].equalsIgnoreCase("glider")){
                    images.add(url + "/glider/" + itemInfo[4] + ".png");
                }else if(itemInfo[16].equalsIgnoreCase("harvestingtool")){
                    images.add(url + "/harvestingtool/" + itemInfo[4] + ".png");
                }else if(itemInfo[16].equalsIgnoreCase("spray")){
                    images.add(url + "/spray/" + itemInfo[4] + ".png");
                }else if(itemInfo[16].equalsIgnoreCase("contrail")){
                    images.add(url + "/contrail/" + itemInfo[4] + ".png");
                }else if(itemInfo[16].equalsIgnoreCase("toy")){
                    images.add(url + "/toy/" + itemInfo[4] + ".png");
                }else if(itemInfo[16].equalsIgnoreCase("loadingscreen")){
                    if(!(itemInfo[4].equals("null"))) {
                        images.add(url + "/loadingscreen/" + itemInfo[4] + ".png");
                    }
                    if(!(itemInfo[5].equals("null"))){
                        images.add(url + "/loadingscreen/" + itemInfo[5] + "-full.png");
                    }
                }else if(itemInfo[16].equalsIgnoreCase("dance")){
                    images.add(url + "/dance/" + itemInfo[4] + ".png");
                }else if(itemInfo[16].equalsIgnoreCase("music")){
                    images.add(url + "/music/" + itemInfo[4] + ".png");
                }else if(itemInfo[16].equalsIgnoreCase("pet")){
                    images.add(url + "/pet/" + itemInfo[4] + ".png");
                }else if(itemInfo[16].equalsIgnoreCase("wrap")){
                    images.add(url + "/wrap/" + itemInfo[4] + ".png");
                }
                item.setImages(images);

                obtained.setSeason(Integer.parseInt(itemInfo[7]));
                obtained.setTier(Integer.parseInt(itemInfo[8]));
                obtained.setIncludedInName(itemInfo[9]);
                obtained.setPromo(itemInfo[10]);
                obtained.setVbuckPrice(Integer.parseInt(itemInfo[11]));
                obtained.setPrice(Double.parseDouble(itemInfo[12]));
                obtained.setChallenege(itemInfo[13]);
                item.setObtained(obtained);

                item.setStyleSet(itemInfo[14]);
                item.setSet(itemInfo[15]);
                item.setItemType(determineItemTypeByString(itemInfo[16]));
                item.setStatus(ReleaseStatus.valueOf(itemInfo[17]));
            }
            saveItem(item);
            System.out.println(item.getId());
        }
        reader.close();
        logger.info("Finished Item Data ");
    }

    private void saveItem(Item item){
        Item duplitcate = getDuplicate(item);
        if(duplitcate == null){
            itemServiceImpl.save(item);
        }else {
            item.set_id(duplitcate.get_id());
            item.setId(duplitcate.getId());
            itemServiceImpl.save(item);
        }
    }
    private Item getDuplicate(Item item){
        for(Item i: itemsInDB){
            if(((i.getName().equals(item.getName())) && (i.getItemType().equals(item.getItemType())) )){
                return i;
            }
        }
        return null;
    }

    private RarityType determineRarityTypeByString(String typeString){

        if(typeString.equalsIgnoreCase(RarityType.LEGENDARY.name())){
            return RarityType.LEGENDARY;
        }else if(typeString.equalsIgnoreCase(RarityType.EPIC.name())){
            return RarityType.EPIC;
        }else if(typeString.equalsIgnoreCase(RarityType.RARE.name())){
            return RarityType.RARE;
        }else if(typeString.equalsIgnoreCase(RarityType.COMMON.name())){
            return RarityType.COMMON;
        }else{
            return RarityType.UNCOMMON;
        }
    }

    private ItemType determineItemTypeByString(String typeString){
        if(typeString.equalsIgnoreCase(ItemType.BACKBLING.name())){
            return ItemType.BACKBLING;
        }else if(typeString.equalsIgnoreCase(ItemType.CONTRAIL.name())){
            return ItemType.CONTRAIL;
        }else if(typeString.equalsIgnoreCase(ItemType.SPRAY.name())){
            return ItemType.SPRAY;
        }else if(typeString.equalsIgnoreCase(ItemType.OUTFIT.name())){
            return ItemType.OUTFIT;
        }else if(typeString.equalsIgnoreCase(ItemType.HARVESTINGTOOL.name())){
            return ItemType.HARVESTINGTOOL;
        }else if(typeString.equalsIgnoreCase(ItemType.DANCE.name())){
            return ItemType.DANCE;
        }else if(typeString.equalsIgnoreCase(ItemType.EMOTICON.name())){
            return ItemType.EMOTICON;
        }else if(typeString.equalsIgnoreCase(ItemType.LOADINGSCREEN.name())){
            return ItemType.LOADINGSCREEN;
        }else if(typeString.equalsIgnoreCase(ItemType.GLIDER.name())){
            return ItemType.GLIDER;
        }else if(typeString.equalsIgnoreCase(ItemType.MUSIC.name())){
            return ItemType.MUSIC;
        }else if(typeString.equalsIgnoreCase(ItemType.PET.name())){
            return ItemType.PET;
        }else if(typeString.equalsIgnoreCase(ItemType.WRAP.name())){
            return ItemType.WRAP;
        }else{
            return ItemType.TOY;
        }
    }

}
