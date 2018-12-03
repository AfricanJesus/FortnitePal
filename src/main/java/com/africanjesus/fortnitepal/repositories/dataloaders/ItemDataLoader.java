//package com.africanjesus.fortnitepal.repositories.dataloaders;
//
//import com.africanjesus.fortnitepal.ItemType;
//import com.africanjesus.fortnitepal.RarityType;
//import com.africanjesus.fortnitepal.ReleaseStatus;
//import com.africanjesus.fortnitepal.model.Item;
//import com.africanjesus.fortnitepal.model.Obtained;
//import com.africanjesus.fortnitepal.services.ItemServiceImpl;
//import com.opencsv.CSVReader;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.stereotype.Component;
//
//import java.io.File;
//import java.io.FileReader;
//import java.util.ArrayList;
//import java.util.List;
//
//@Component
//public class ItemDataLoader implements CommandLineRunner {
//
//    private final Logger logger = LoggerFactory.getLogger(ItemDataLoader.class);
//    private String url = "https://s3.us-east-2.amazonaws.com/fortnitepal/images";
//    private final ItemServiceImpl itemServiceImpl;
//
//    @Autowired
//    public ItemDataLoader(ItemServiceImpl itemServiceImpl) {
//        this.itemServiceImpl = itemServiceImpl;
//    }
//
//
//    @Override
//    public void run(String... args) throws Exception {
//        logger.info("Loading Item Data ");
//        String[] itemInfo;
//        Obtained obtained;
//        Item item;
//        List<String> images;
//        CSVReader reader = new CSVReader(new FileReader(new File("").getAbsolutePath() + "/src/main/resources/static/fortniteitems.csv"));
//        reader.readNext();
//        while((itemInfo = reader.readNext()) != null){
//            item = new Item();
//            obtained  = new Obtained();
//            for(int i = 0; i < 1; i++){
//                item.setName(itemInfo[0]);
//                item.setDesc(itemInfo[1]);
//                item.setRarityType(determineRarityTypeByString(itemInfo[2]));
//
//                images = new ArrayList<>();
//                if(itemInfo[15].equalsIgnoreCase("outfit")){
//                    if(!(itemInfo[3].equals("null"))) {
//                            images.add(url + "/outfit/" + itemInfo[3] + ".png");
//                    }
//                    if(!(itemInfo[4].equals("null"))){
//                        images.add(url + "/outfit/" + itemInfo[4] + "-full.png");
//                    }
//                    if(!(itemInfo[5].equals("null"))){
//                        images.add(url + "/outfit/" + itemInfo[5] + "-feature.png");
//                    }
//                }else if(itemInfo[15].equalsIgnoreCase("backbling")){
//                    images.add(url + "/backbling/" + itemInfo[3] + ".png");
//                }else if(itemInfo[15].equalsIgnoreCase("emoticon")){
//                    images.add(url + "/emoticon/" + itemInfo[3] + ".png");
//                }else if(itemInfo[15].equalsIgnoreCase("glider")){
//                    images.add(url + "/glider/" + itemInfo[3] + ".png");
//                }else if(itemInfo[15].equalsIgnoreCase("harvestingtool")){
//                    images.add(url + "/harvestingtool/" + itemInfo[3] + ".png");
//                }else if(itemInfo[15].equalsIgnoreCase("spray")){
//                    images.add(url + "/spray/" + itemInfo[3] + ".png");
//                }else if(itemInfo[15].equalsIgnoreCase("contrail")){
//                    images.add(url + "/contrail/" + itemInfo[3] + ".png");
//                }else if(itemInfo[15].equalsIgnoreCase("toy")){
//                    images.add(url + "/toy/" + itemInfo[3] + ".png");
//                }else if(itemInfo[15].equalsIgnoreCase("loadingscreen")){
//                    images.add(url + "/loadingscreen/" + itemInfo[3] + ".png");
//                }else if(itemInfo[15].equalsIgnoreCase("dance")){
//                    images.add(url + "/dance/" + itemInfo[3] + ".png");
//                }else if(itemInfo[15].equalsIgnoreCase("music")){
//                    images.add(url + "/music/" + itemInfo[3] + ".png");
//                }else if(itemInfo[15].equalsIgnoreCase("pet")){
//                    images.add(url + "/pet/" + itemInfo[3] + ".png");
//                }
//                item.setImages(images);
//
//                obtained.setSeason(Integer.parseInt(itemInfo[6]));
//                obtained.setTier(Integer.parseInt(itemInfo[7]));
//                obtained.setIncludedInName(itemInfo[8]);
//                obtained.setPromo(itemInfo[9]);
//                obtained.setVbuckPrice(Integer.parseInt(itemInfo[10]));
//                obtained.setPrice(Double.parseDouble(itemInfo[11]));
//                obtained.setChallenege(itemInfo[12]);
//                item.setObtained(obtained);
//
//                item.setStyleSet(itemInfo[13]);
//                item.setSet(itemInfo[14]);
//                item.setItemType(determineItemTypeByString(itemInfo[15]));
//                item.setStatus(ReleaseStatus.valueOf(itemInfo[16]));
//            }
//            itemServiceImpl.save(item);
//        }
//        logger.info("Finished Item Data ");
//
//    }
//    private RarityType determineRarityTypeByString(String typeString){
//
//        if(typeString.equalsIgnoreCase(RarityType.LEGENDARY.name())){
//            return RarityType.LEGENDARY;
//        }else if(typeString.equalsIgnoreCase(RarityType.EPIC.name())){
//            return RarityType.EPIC;
//        }else if(typeString.equalsIgnoreCase(RarityType.RARE.name())){
//            return RarityType.RARE;
//        }else if(typeString.equalsIgnoreCase(RarityType.COMMON.name())){
//            return RarityType.COMMON;
//        }else{
//            return RarityType.UNCOMMON;
//        }
//    }
//
//    private ItemType determineItemTypeByString(String typeString){
//        if(typeString.equalsIgnoreCase(ItemType.BACKBLING.name())){
//            return ItemType.BACKBLING;
//        }else if(typeString.equalsIgnoreCase(ItemType.CONTRAIL.name())){
//            return ItemType.CONTRAIL;
//        }else if(typeString.equalsIgnoreCase(ItemType.SPRAY.name())){
//            return ItemType.SPRAY;
//        }else if(typeString.equalsIgnoreCase(ItemType.OUTFIT.name())){
//            return ItemType.OUTFIT;
//        }else if(typeString.equalsIgnoreCase(ItemType.HARVESTINGTOOL.name())){
//            return ItemType.HARVESTINGTOOL;
//        }else if(typeString.equalsIgnoreCase(ItemType.DANCE.name())){
//            return ItemType.DANCE;
//        }else if(typeString.equalsIgnoreCase(ItemType.EMOTICON.name())){
//            return ItemType.EMOTICON;
//        }else if(typeString.equalsIgnoreCase(ItemType.LOADINGSCREEN.name())){
//            return ItemType.LOADINGSCREEN;
//        }else if(typeString.equalsIgnoreCase(ItemType.GLIDER.name())){
//            return ItemType.GLIDER;
//        }else if(typeString.equalsIgnoreCase(ItemType.MUSIC.name())){
//            return ItemType.MUSIC;
//        }else if(typeString.equalsIgnoreCase(ItemType.PET.name())){
//            return ItemType.PET;
//        }else{
//            return ItemType.TOY;
//        }
//    }
//
//}
