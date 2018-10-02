package com.africanjesus.fortnitepal.repositories.dataloaders;

import com.africanjesus.fortnitepal.model.Style;
import com.africanjesus.fortnitepal.model.StyleSet;
import com.africanjesus.fortnitepal.services.StyleSetServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class StyleSetDataLoader implements CommandLineRunner {

    private final Logger logger = LoggerFactory.getLogger(ChallengeSetDataLoader.class);

    private StyleSetServiceImpl styleSetServiceImpl;

    public StyleSetDataLoader() {
    }

    @Autowired
    public StyleSetDataLoader(StyleSetServiceImpl styleSetServiceImpl) {
        this.styleSetServiceImpl = styleSetServiceImpl;
    }

    @Override
    public void run(String... args) throws Exception {

        logger.info("Started Loading Style Set Data");
        StyleSet styleSet;
        List<Style> style;

        //Carbide Style
        styleSet = new StyleSet();
        styleSet.setStyleSetName("Carbide Style");
        style = new ArrayList<>();
        style.add(new Style("Carbide Chest","http://localhost:8080/images/challenge/carbide-chest.png"));
        style.add(new Style("Carbide Legs","http://localhost:8080/images/challenge/carbide-legs.png"));
        style.add(new Style("Carbide Arms","http://localhost:8080/images/challenge/carbide-arms.png"));
        style.add(new Style("Carbide Head","http://localhost:8080/images/challenge/carbide-head.png"));
        style.add(new Style("Carbide Accents","http://localhost:8080/images/challenge/carbide-chest-2.png"));
        style.add(new Style("Carbide Accents (BLUE)","http://localhost:8080/images/challenge/carbide-blue.png"));
        style.add(new Style("Carbide Accents (YELLOW)","http://localhost:8080/images/challenge/carbide-yellow.png"));
        style.add(new Style("Carbide Accents (GREEN)","http://localhost:8080/images/challenge/carbide-green.png"));
        style.add(new Style("Carbide Accents (PINK)","http://localhost:8080/images/challenge/carbide-pink.png"));
        styleSet.setStages(style);
        styleSetServiceImpl.save(styleSet);

        //Drift Style
        styleSet = new StyleSet();
        styleSet.setStyleSetName("Drift Style");
        style = new ArrayList<>();
        style.add(new Style("Base","http://localhost:8080/images/challenge/drift-base.png"));
        style.add(new Style("Stage 1","http://localhost:8080/images/challenge/drift-stage-1.png"));
        style.add(new Style("Stage 2","http://localhost:8080/images/challenge/drift-stage-2.png"));
        style.add(new Style("Stage 3","http://localhost:8080/images/challenge/drift-stage-3.png"));
        style.add(new Style("Stage 4","http://localhost:8080/images/challenge/drift-stage-4.png"));
        style.add(new Style("Stage 5","http://localhost:8080/images/challenge/drift-stage-5.png"));
        styleSet.setStages(style);
        styleSetServiceImpl.save(styleSet);

        //Ragnarok Style
        styleSet = new StyleSet();
        styleSet.setStyleSetName("Ragnarok Style");
        style = new ArrayList<>();
        style.add(new Style("Base","http://localhost:8080/images/challenge/ragnarok-base.png"));
        style.add(new Style("Stage 1","http://localhost:8080/images/challenge/ragnarok-stage-1.png"));
        style.add(new Style("Stage 2","http://localhost:8080/images/challenge/ragnarok-stage-2.png"));
        style.add(new Style("Stage 3","http://localhost:8080/images/challenge/ragnarok-stage-3.png"));
        style.add(new Style("Stage 4","http://localhost:8080/images/challenge/ragnarok-stage-4.png"));
        style.add(new Style("Stage 5","http://localhost:8080/images/challenge/ragnarok-stage-5.png"));
        styleSet.setStages(style);
        styleSetServiceImpl.save(styleSet);

        //Omega Style
        styleSet = new StyleSet();
        styleSet.setStyleSetName("Omega Style");
        style = new ArrayList<>();
        style.add(new Style("Omega Chest","http://localhost:8080/images/challenge/omega-chest.png"));
        style.add(new Style("Omega Legs","http://localhost:8080/images/challenge/omega-legs.png"));
        style.add(new Style("Omega Arms","http://localhost:8080/images/challenge/omega-arms.png"));
        style.add(new Style("Omega Mask","http://localhost:8080/images/challenge/omega-mask.png"));
        style.add(new Style("Omega Accents (RED)","http://localhost:8080/images/challenge/omega-red.png"));
        style.add(new Style("Omega Accents (YELLOW)","http://localhost:8080/images/challenge/omega-yellow.png"));
        style.add(new Style("Omega Accents (PURPLE)","http://localhost:8080/images/challenge/omega-purple.png"));
        style.add(new Style("Omega Accents (ORANGE)","http://localhost:8080/images/challenge/omega-orange.png"));
        styleSet.setStages(style);
        styleSetServiceImpl.save(styleSet);

        //The Visitor Style
        styleSet = new StyleSet();
        styleSet.setStyleSetName("The Visitor Style");
        style = new ArrayList<>();
        style.add(new Style("Crosshair","http://localhost:8080/images/challenge/the-visitor-crosshair.png"));
        style.add(new Style("Visualizer","http://localhost:8080/images/challenge/the-visitor-visualizer.png"));
        style.add(new Style("Smiles","http://localhost:8080/images/challenge/the-visitor-smiles.png"));
        style.add(new Style("Mandible","http://localhost:8080/images/challenge/the-visitor-mandible.png"));
        styleSet.setStages(style);
        styleSetServiceImpl.save(styleSet);

        //Tomatohead Style
        styleSet = new StyleSet();
        styleSet.setStyleSetName("Tomatohead Style");
        style = new ArrayList<>();
        style.add(new Style("No Crown","http://localhost:8080/images/challenge/tomatohead.png"));
        style.add(new Style("Tomatohead Crown","http://localhost:8080/images/challenge/tomatohead-crown.png"));
        styleSet.setStages(style);
        styleSetServiceImpl.save(styleSet);

        //Wild Card Style
        styleSet = new StyleSet();
        styleSet.setStyleSetName("Wild Card Style");
        style = new ArrayList<>();
        style.add(new Style("Spade","http://localhost:8080/images/challenge/wild-card-spade.png"));
        style.add(new Style("Heart","http://localhost:8080/images/challenge/wild-card-heart.png"));
        style.add(new Style("Diamond","http://localhost:8080/images/challenge/wild-card-diamond.png"));
        style.add(new Style("Club","http://localhost:8080/images/challenge/wild-card-club.png"));
        styleSet.setStages(style);

        //Peekaboo Style
        styleSet = new StyleSet();
        styleSet.setStyleSetName("Peekaboo Style");
        style = new ArrayList<>();
        style.add(new Style("No Mask","http://localhost:8080/images/challenge/peekaboo-no-mask.png"));
        style.add(new Style("Mask","http://localhost:8080/images/challenge/peekaboo-mask.png"));
        styleSet.setStages(style);
        styleSetServiceImpl.save(styleSet);

        //Nite Nite Style
        styleSet = new StyleSet();
        styleSet.setStyleSetName("Nite Nite Style");
        style = new ArrayList<>();
        style.add(new Style("No Mask","http://localhost:8080/images/challenge/nite-nite-no-mask.png"));
        style.add(new Style("Mask","http://localhost:8080/images/challenge/nite-nite-mask.png"));
        styleSet.setStages(style);
        styleSetServiceImpl.save(styleSet);

        //Bonesy Style
        styleSet = new StyleSet();
        styleSet.setStyleSetName("Bonesy Style");
        style = new ArrayList<>();
        style.add(new Style("Bonesy","http://localhost:8080/images/pet/bonesy.png"));
        style.add(new Style("Bonesy Mocha","http://localhost:8080/images/pet/bonesy-mocha.png"));
        style.add(new Style("Bonesy White","http://localhost:8080/images/pet/bonesy-white.png"));
        styleSet.setStages(style);
        styleSetServiceImpl.save(styleSet);

        //Scales Style
        styleSet = new StyleSet();
        styleSet.setStyleSetName("Scales Style");
        style = new ArrayList<>();
        style.add(new Style("Scales","http://localhost:8080/images/pet/scales.png"));
        style.add(new Style("Scales Black","http://localhost:8080/images/pet/scales-black.png"));
        style.add(new Style("Scales Pink","http://localhost:8080/images/pet/scales-pink.png"));
        styleSet.setStages(style);
        styleSetServiceImpl.save(styleSet);

        //Dire Style
        styleSet = new StyleSet();
        styleSet.setStyleSetName("Dire Style");
        style = new ArrayList<>();
        style.add(new Style("Base","http://localhost:8080/images/challenge/dire-base.png"));
        style.add(new Style("Stage (Half-Wolf)","http://localhost:8080/images/challenge/dire-half-wolf.png"));
        style.add(new Style("Stage (Brown Werewolf)","http://localhost:8080/images/challenge/dire-brown-werewolf.png"));
        style.add(new Style("Stage (Grey Werewolf)","http://localhost:8080/images/challenge/dire-grey-werewolf.png"));
        style.add(new Style("Stage (White Werewolf)","http://localhost:8080/images/challenge/dire-white-werewolf.png"));
        style.add(new Style("Stage (Black Werewolf)","http://localhost:8080/images/challenge/dire-black-werewolf.png"));
        style.add(new Style("Color (RED)","http://localhost:8080/images/challenge/dire-color-red.png"));
        style.add(new Style("Color (BLUE)","http://localhost:8080/images/challenge/dire-color-blue.png"));
        style.add(new Style("Color (YELLOW)","http://localhost:8080/images/challenge/dire-color-yellow.png"));
        style.add(new Style("Color (BROWN)","http://localhost:8080/images/challenge/dire-color-brown.png"));
        styleSet.setStages(style);
        styleSetServiceImpl.save(styleSet);

        //Calamity Style
        styleSet = new StyleSet();
        styleSet.setStyleSetName("Calamity Style");
        style = new ArrayList<>();
        style.add(new Style("Base","http://localhost:8080/images/challenge/calamity-base.png"));
        style.add(new Style("Stage 1","http://localhost:8080/images/challenge/calamity-stage-1.png"));
        style.add(new Style("Stage 2","http://localhost:8080/images/challenge/calamity-stage-2.png"));
        style.add(new Style("Stage 3","http://localhost:8080/images/challenge/calamity-stage-3.png"));
        style.add(new Style("Stage 4","http://localhost:8080/images/challenge/calamity-stage-4.png"));
        style.add(new Style("Stage 5","http://localhost:8080/images/challenge/calamity-stage-5.png"));
        style.add(new Style("Color (WHITE)","http://localhost:8080/images/challenge/calamity-color-white.png"));
        style.add(new Style("Color (TEAL)","http://localhost:8080/images/challenge/calamity-color-teal.png"));
        style.add(new Style("Color (PURPLE)","http://localhost:8080/images/challenge/calamity-color-purple.png"));
        style.add(new Style("Color (BLACK)","http://localhost:8080/images/challenge/calamity-color-black.png"));
        styleSet.setStages(style);
        styleSetServiceImpl.save(styleSet);

        logger.info("Finished Loading Style Set Data");
    }
}
