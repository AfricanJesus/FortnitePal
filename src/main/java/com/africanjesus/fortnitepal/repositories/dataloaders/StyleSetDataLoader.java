//package com.africanjesus.fortnitepal.repositories.dataloaders;
//
//import com.africanjesus.fortnitepal.model.Style;
//import com.africanjesus.fortnitepal.model.StyleSet;
//import com.africanjesus.fortnitepal.services.StyleSetServiceImpl;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.stereotype.Component;
//
//import java.util.ArrayList;
//import java.util.List;
//
//@Component
//public class StyleSetDataLoader implements CommandLineRunner {
//
//    private final Logger logger = LoggerFactory.getLogger(ChallengeSetDataLoader.class);
//    private String url = "https://s3.us-east-2.amazonaws.com/fortnitepal/images/challenge";
//    private StyleSetServiceImpl styleSetServiceImpl;
//
//    public StyleSetDataLoader() {
//    }
//
//    @Autowired
//    public StyleSetDataLoader(StyleSetServiceImpl styleSetServiceImpl) {
//        this.styleSetServiceImpl = styleSetServiceImpl;
//    }
//
//    @Override
//    public void run(String... args) throws Exception {
//
//        logger.info("Started Loading Style Set Data");
//        StyleSet styleSet;
//        List<Style> style;
//
//        //Carbide Style
//        styleSet = new StyleSet();
//        styleSet.setStyleSetName("Carbide Style");
//        style = new ArrayList<>();
//        style.add(new Style("Carbide Chest",url + "/carbide-chest.png"));
//        style.add(new Style("Carbide Legs",url + "/carbide-legs.png"));
//        style.add(new Style("Carbide Arms",url + "/carbide-arms.png"));
//        style.add(new Style("Carbide Head",url + "/carbide-head.png"));
//        style.add(new Style("Carbide Accents",url + "/carbide-chest-2.png"));
//        style.add(new Style("Carbide Accents (BLUE)",url + "/carbide-blue.png"));
//        style.add(new Style("Carbide Accents (YELLOW)",url + "/carbide-yellow.png"));
//        style.add(new Style("Carbide Accents (GREEN)",url + "/carbide-green.png"));
//        style.add(new Style("Carbide Accents (PINK)",url + "/carbide-pink.png"));
//        styleSet.setStages(style);
//        styleSetServiceImpl.save(styleSet);
//
//        //Drift Style
//        styleSet = new StyleSet();
//        styleSet.setStyleSetName("Drift Style");
//        style = new ArrayList<>();
//        style.add(new Style("Base",url + "/drift-base.png"));
//        style.add(new Style("Stage 1",url + "/drift-stage-1.png"));
//        style.add(new Style("Stage 2",url + "/drift-stage-2.png"));
//        style.add(new Style("Stage 3",url + "/drift-stage-3.png"));
//        style.add(new Style("Stage 4",url + "/drift-stage-4.png"));
//        style.add(new Style("Stage 5",url + "/drift-stage-5.png"));
//        styleSet.setStages(style);
//        styleSetServiceImpl.save(styleSet);
//
//        //Ragnarok Style
//        styleSet = new StyleSet();
//        styleSet.setStyleSetName("Ragnarok Style");
//        style = new ArrayList<>();
//        style.add(new Style("Base",url + "/ragnarok-base.png"));
//        style.add(new Style("Stage 1",url + "/ragnarok-stage-1.png"));
//        style.add(new Style("Stage 2",url + "/ragnarok-stage-2.png"));
//        style.add(new Style("Stage 3",url + "/ragnarok-stage-3.png"));
//        style.add(new Style("Stage 4",url + "/ragnarok-stage-4.png"));
//        style.add(new Style("Stage 5",url + "/ragnarok-stage-5.png"));
//        styleSet.setStages(style);
//        styleSetServiceImpl.save(styleSet);
//
//        //Omega Style
//        styleSet = new StyleSet();
//        styleSet.setStyleSetName("Omega Style");
//        style = new ArrayList<>();
//        style.add(new Style("Omega Chest",url + "/omega-chest.png"));
//        style.add(new Style("Omega Legs",url + "/omega-legs.png"));
//        style.add(new Style("Omega Arms",url + "/omega-arms.png"));
//        style.add(new Style("Omega Mask",url + "/omega-mask.png"));
//        style.add(new Style("Omega Accents (RED)",url + "/omega-red.png"));
//        style.add(new Style("Omega Accents (YELLOW)",url + "/omega-yellow.png"));
//        style.add(new Style("Omega Accents (PURPLE)",url + "/omega-purple.png"));
//        style.add(new Style("Omega Accents (ORANGE)",url + "/omega-orange.png"));
//        styleSet.setStages(style);
//        styleSetServiceImpl.save(styleSet);
//
//        //The Visitor Style
//        styleSet = new StyleSet();
//        styleSet.setStyleSetName("The Visitor Style");
//        style = new ArrayList<>();
//        style.add(new Style("Crosshair",url + "/the-visitor-crosshair.png"));
//        style.add(new Style("Visualizer",url + "/the-visitor-visualizer.png"));
//        style.add(new Style("Smiles",url + "/the-visitor-smiles.png"));
//        style.add(new Style("Mandible",url + "/the-visitor-mandible.png"));
//        styleSet.setStages(style);
//        styleSetServiceImpl.save(styleSet);
//
//        //Tomatohead Style
//        styleSet = new StyleSet();
//        styleSet.setStyleSetName("Tomatohead Style");
//        style = new ArrayList<>();
//        style.add(new Style("No Crown",url + "/tomatohead.png"));
//        style.add(new Style("Tomatohead Crown",url + "/tomatohead-crown.png"));
//        styleSet.setStages(style);
//        styleSetServiceImpl.save(styleSet);
//
//        //Wild Card Style
//        styleSet = new StyleSet();
//        styleSet.setStyleSetName("Wild Card Style");
//        style = new ArrayList<>();
//        style.add(new Style("Spade",url + "/wild-card-spade.png"));
//        style.add(new Style("Heart",url + "/wild-card-heart.png"));
//        style.add(new Style("Diamond",url + "/wild-card-diamond.png"));
//        style.add(new Style("Club",url + "/wild-card-club.png"));
//        styleSet.setStages(style);
//
//        //Peekaboo Style
//        styleSet = new StyleSet();
//        styleSet.setStyleSetName("Peekaboo Style");
//        style = new ArrayList<>();
//        style.add(new Style("No Mask",url + "/peekaboo-no-mask.png"));
//        style.add(new Style("Mask",url + "/peekaboo-mask.png"));
//        styleSet.setStages(style);
//        styleSetServiceImpl.save(styleSet);
//
//        //Nite Nite Style
//        styleSet = new StyleSet();
//        styleSet.setStyleSetName("Nite Nite Style");
//        style = new ArrayList<>();
//        style.add(new Style("No Mask",url + "/nite-nite-no-mask.png"));
//        style.add(new Style("Mask",url + "/nite-nite-mask.png"));
//        styleSet.setStages(style);
//        styleSetServiceImpl.save(styleSet);
//
//        //Bonesy Style
//        styleSet = new StyleSet();
//        styleSet.setStyleSetName("Bonesy Style");
//        style = new ArrayList<>();
//        style.add(new Style("Bonesy","http://localhost:8080/images/pet/bonesy.png"));
//        style.add(new Style("Bonesy Mocha","http://localhost:8080/images/pet/bonesy-mocha.png"));
//        style.add(new Style("Bonesy White","http://localhost:8080/images/pet/bonesy-white.png"));
//        styleSet.setStages(style);
//        styleSetServiceImpl.save(styleSet);
//
//        //Scales Style
//        styleSet = new StyleSet();
//        styleSet.setStyleSetName("Scales Style");
//        style = new ArrayList<>();
//        style.add(new Style("Scales","http://localhost:8080/images/pet/scales.png"));
//        style.add(new Style("Scales Black","http://localhost:8080/images/pet/scales-black.png"));
//        style.add(new Style("Scales Pink","http://localhost:8080/images/pet/scales-pink.png"));
//        styleSet.setStages(style);
//        styleSetServiceImpl.save(styleSet);
//
//        //Dire Style
//        styleSet = new StyleSet();
//        styleSet.setStyleSetName("Dire Style");
//        style = new ArrayList<>();
//        style.add(new Style("Base",url + "/dire-base.png"));
//        style.add(new Style("Stage (Half-Wolf)",url + "/dire-half-wolf.png"));
//        style.add(new Style("Stage (Brown Werewolf)",url + "/dire-brown-werewolf.png"));
//        style.add(new Style("Stage (Grey Werewolf)",url + "/dire-grey-werewolf.png"));
//        style.add(new Style("Stage (White Werewolf)",url + "/dire-white-werewolf.png"));
//        style.add(new Style("Stage (Black Werewolf)",url + "/dire-black-werewolf.png"));
//        style.add(new Style("Color (RED)",url + "/dire-color-red.png"));
//        style.add(new Style("Color (BLUE)",url + "/dire-color-blue.png"));
//        style.add(new Style("Color (YELLOW)",url + "/dire-color-yellow.png"));
//        style.add(new Style("Color (BROWN)",url + "/dire-color-brown.png"));
//        styleSet.setStages(style);
//        styleSetServiceImpl.save(styleSet);
//
//        //Calamity Style
//        styleSet = new StyleSet();
//        styleSet.setStyleSetName("Calamity Style");
//        style = new ArrayList<>();
//        style.add(new Style("Base",url + "/calamity-base.png"));
//        style.add(new Style("Stage 1",url + "/calamity-stage-1.png"));
//        style.add(new Style("Stage 2",url + "/calamity-stage-2.png"));
//        style.add(new Style("Stage 3",url + "/calamity-stage-3.png"));
//        style.add(new Style("Stage 4",url + "/calamity-stage-4.png"));
//        style.add(new Style("Stage 5",url + "/calamity-stage-5.png"));
//        style.add(new Style("Color (WHITE)",url + "/calamity-color-white.png"));
//        style.add(new Style("Color (TEAL)",url + "/calamity-color-teal.png"));
//        style.add(new Style("Color (PURPLE)",url + "/calamity-color-purple.png"));
//        style.add(new Style("Color (BLACK)",url + "/calamity-color-black.png"));
//        styleSet.setStages(style);
//        styleSetServiceImpl.save(styleSet);
//
//        logger.info("Finished Loading Style Set Data");
//    }
//}
