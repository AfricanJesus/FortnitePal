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
        style.add(new Style("Carbide Mask","http://localhost:8080/images/challenge/carbide-mask.png"));
        style.add(new Style("Carbide Accents","http://localhost:8080/images/challenge/carbide-chest-2.png"));
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
        styleSet.setStyleSetName("Omega Style Style");
        style = new ArrayList<>();
        style.add(new Style("Omega Chest","http://localhost:8080/images/challenge/omega-chest.png"));
        style.add(new Style("Omega Legs","http://localhost:8080/images/challenge/omega-legs.png"));
        style.add(new Style("Omega Arms","http://localhost:8080/images/challenge/omega-arms.png"));
        style.add(new Style("Omega Mask","http://localhost:8080/images/challenge/omega-mask.png"));
        style.add(new Style("Omega Accents","http://localhost:8080/images/challenge/omega-accent.png"));
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
        style.add(new Style("Tomatohead Crown","http://localhost:8080/images/challenge/tomatohead.png"));
        styleSet.setStages(style);
        styleSetServiceImpl.save(styleSet);

        logger.info("Finished Loading Style Set Data");
    }
}
