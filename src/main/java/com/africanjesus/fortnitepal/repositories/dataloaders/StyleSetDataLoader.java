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

    private final Logger logger = LoggerFactory.getLogger(StyleSetDataLoader.class);
    private String url = "https://s3.us-east-2.amazonaws.com/fortnitepal/images/challenge";
    private StyleSetServiceImpl styleSetServiceImpl;
    private List<StyleSet> stylesInDB;

    @Autowired
    public StyleSetDataLoader(StyleSetServiceImpl styleSetServiceImpl) {
        this.styleSetServiceImpl = styleSetServiceImpl;
    }

    @Override
    public void run(String... args){
        logger.info("Started Loading Style Set Data");
        stylesInDB = styleSetServiceImpl.findAll();
        StyleSet styleSet;
        List<Style> style;

        //Carbide Style
        styleSet = new StyleSet();
        styleSet.setStyleSetName("Carbide Style");
        style = new ArrayList<>();
        style.add(new Style("Carbide Chest",url + "/carbide-chest.png"));
        style.add(new Style("Carbide Legs",url + "/carbide-legs.png"));
        style.add(new Style("Carbide Arms",url + "/carbide-arms.png"));
        style.add(new Style("Carbide Head",url + "/carbide-head.png"));
        style.add(new Style("Carbide Accents",url + "/carbide-chest-2.png"));
        style.add(new Style("Carbide Accents (BLUE)",url + "/carbide-blue.png"));
        style.add(new Style("Carbide Accents (YELLOW)",url + "/carbide-yellow.png"));
        style.add(new Style("Carbide Accents (GREEN)",url + "/carbide-green.png"));
        style.add(new Style("Carbide Accents (PINK)",url + "/carbide-pink.png"));
        styleSet.setStages(style);
        saveStyleSet(styleSet);

        //Drift Style
        styleSet = new StyleSet();
        styleSet.setStyleSetName("Drift Style");
        style = new ArrayList<>();
        style.add(new Style("Base",url + "/drift-base.png"));
        style.add(new Style("Stage 1",url + "/drift-stage-1.png"));
        style.add(new Style("Stage 2",url + "/drift-stage-2.png"));
        style.add(new Style("Stage 3",url + "/drift-stage-3.png"));
        style.add(new Style("Stage 4",url + "/drift-stage-4.png"));
        style.add(new Style("Stage 5",url + "/drift-stage-5.png"));
        styleSet.setStages(style);
        saveStyleSet(styleSet);

        //Ragnarok Style
        styleSet = new StyleSet();
        styleSet.setStyleSetName("Ragnarok Style");
        style = new ArrayList<>();
        style.add(new Style("Base",url + "/ragnarok-base.png"));
        style.add(new Style("Stage 1",url + "/ragnarok-stage-1.png"));
        style.add(new Style("Stage 2",url + "/ragnarok-stage-2.png"));
        style.add(new Style("Stage 3",url + "/ragnarok-stage-3.png"));
        style.add(new Style("Stage 4",url + "/ragnarok-stage-4.png"));
        style.add(new Style("Stage 5",url + "/ragnarok-stage-5.png"));
        styleSet.setStages(style);
        saveStyleSet(styleSet);

        //Omega Style
        styleSet = new StyleSet();
        styleSet.setStyleSetName("Omega Style");
        style = new ArrayList<>();
        style.add(new Style("Omega Chest",url + "/omega-chest.png"));
        style.add(new Style("Omega Legs",url + "/omega-legs.png"));
        style.add(new Style("Omega Arms",url + "/omega-arms.png"));
        style.add(new Style("Omega Mask",url + "/omega-mask.png"));
        style.add(new Style("Omega Accents (RED)",url + "/omega-red.png"));
        style.add(new Style("Omega Accents (YELLOW)",url + "/omega-yellow.png"));
        style.add(new Style("Omega Accents (PURPLE)",url + "/omega-purple.png"));
        style.add(new Style("Omega Accents (ORANGE)",url + "/omega-orange.png"));
        styleSet.setStages(style);
        saveStyleSet(styleSet);

        //The Visitor Style
        styleSet = new StyleSet();
        styleSet.setStyleSetName("The Visitor Style");
        style = new ArrayList<>();
        style.add(new Style("Crosshair",url + "/the-visitor-crosshair.png"));
        style.add(new Style("Visualizer",url + "/the-visitor-visualizer.png"));
        style.add(new Style("Smiles",url + "/the-visitor-smiles.png"));
        style.add(new Style("Mandible",url + "/the-visitor-mandible.png"));
        styleSet.setStages(style);
        saveStyleSet(styleSet);

        //Tomatohead Style
        styleSet = new StyleSet();
        styleSet.setStyleSetName("Tomatohead Style");
        style = new ArrayList<>();
        style.add(new Style("No Crown",url + "/tomatohead.png"));
        style.add(new Style("Tomatohead Crown",url + "/tomatohead-crown.png"));
        styleSet.setStages(style);
        saveStyleSet(styleSet);

        //Wild Card Style
        styleSet = new StyleSet();
        styleSet.setStyleSetName("Wild Card Style");
        style = new ArrayList<>();
        style.add(new Style("Spade",url + "/wild-card-spade.png"));
        style.add(new Style("Heart",url + "/wild-card-heart.png"));
        style.add(new Style("Diamond",url + "/wild-card-diamond.png"));
        style.add(new Style("Club",url + "/wild-card-club.png"));
        styleSet.setStages(style);
        saveStyleSet(styleSet);

        //Peekaboo Style
        styleSet = new StyleSet();
        styleSet.setStyleSetName("Peekaboo Style");
        style = new ArrayList<>();
        style.add(new Style("No Mask",url + "/peekaboo-no-mask.png"));
        style.add(new Style("Mask",url + "/peekaboo-mask.png"));
        styleSet.setStages(style);
        saveStyleSet(styleSet);

        //Nite Nite Style
        styleSet = new StyleSet();
        styleSet.setStyleSetName("Nite Nite Style");
        style = new ArrayList<>();
        style.add(new Style("No Mask",url + "/nite-nite-no-mask.png"));
        style.add(new Style("Mask",url + "/nite-nite-mask.png"));
        styleSet.setStages(style);
        saveStyleSet(styleSet);

        //Bonesy Style
        styleSet = new StyleSet();
        styleSet.setStyleSetName("Bonesy Style");
        style = new ArrayList<>();
        style.add(new Style("Bonesy",url + "/pet/bonesy.png"));
        style.add(new Style("Bonesy Mocha",url + "/pet/bonesy-mocha.png"));
        style.add(new Style("Bonesy White",url + "/pet/bonesy-white.png"));
        styleSet.setStages(style);
        saveStyleSet(styleSet);

        //Scales Style
        styleSet = new StyleSet();
        styleSet.setStyleSetName("Scales Style");
        style = new ArrayList<>();
        style.add(new Style("Scales",url + "/pet/scales.png"));
        style.add(new Style("Scales Black",url + "/pet/scales-black.png"));
        style.add(new Style("Scales Pink",url + "/pet/scales-pink.png"));
        styleSet.setStages(style);
        saveStyleSet(styleSet);

        //Remus Style
        styleSet = new StyleSet();
        styleSet.setStyleSetName("Remus Style");
        style = new ArrayList<>();
        style.add(new Style("Remus",url + "/pet/remus.png"));
        style.add(new Style("Remus Skull",url + "/pet/remus-skull.png"));
        style.add(new Style("Remus Ice",url + "/pet/remus-ice.png"));
        styleSet.setStages(style);
        saveStyleSet(styleSet);

        //Hamirez Style
        styleSet = new StyleSet();
        styleSet.setStyleSetName("Hamirez Style");
        style = new ArrayList<>();
        style.add(new Style("Hamirez",url + "/pet/hamirez.png"));
        style.add(new Style("Hamirez Pink","/pet/hamirez-pink.png"));
        style.add(new Style("Hamirez Brown","/images/pet/hamirez-brown.png"));
        styleSet.setStages(style);
        saveStyleSet(styleSet);

        //Skull Trooper Style
        styleSet = new StyleSet();
        styleSet.setStyleSetName("Skull Trooper Style");
        style = new ArrayList<>();
        style.add(new Style("Style (WHITE)",url + "/skull-trooper-color-white.png"));
        style.add(new Style("Style (GREEN GLOW)",url + "/skull-trooper-color-green-glow.png"));
        style.add(new Style("Style (PURPLE)",url + "/skull-trooper-color-purple.png"));
        styleSet.setStages(style);
        saveStyleSet(styleSet);

        //Skull Ranger Style
        styleSet = new StyleSet();
        styleSet.setStyleSetName("Skull Ranger Style");
        style = new ArrayList<>();
        style.add(new Style("Style (WHITE)",url + "/skull-ranger-color-white.png"));
        style.add(new Style("Style (GREEN GLOW)",url + "/skull-ranger-color-green-glow.png"));
        styleSet.setStages(style);
        saveStyleSet(styleSet);

        //Crypt Cruiser Style
        styleSet = new StyleSet();
        styleSet.setStyleSetName("Crypt Cruiser Style");
        style = new ArrayList<>();
        style.add(new Style("Color (BLUE)",url + "/crypt-cruiser-blue.png"));
        style.add(new Style("Color (GREEN)",url + "/crypt-cruiser-green.png"));
        styleSet.setStages(style);
        saveStyleSet(styleSet);

        //Dire Style
        styleSet = new StyleSet();
        styleSet.setStyleSetName("Dire Style");
        style = new ArrayList<>();
        style.add(new Style("Base",url + "/dire-base.png"));
        style.add(new Style("Stage (Half-Wolf)",url + "/dire-half-wolf.png"));
        style.add(new Style("Stage (Brown Werewolf)",url + "/dire-brown-werewolf.png"));
        style.add(new Style("Stage (Grey Werewolf)",url + "/dire-grey-werewolf.png"));
        style.add(new Style("Stage (White Werewolf)",url + "/dire-white-werewolf.png"));
        style.add(new Style("Stage (Black Werewolf)",url + "/dire-black-werewolf.png"));
        style.add(new Style("Color (RED)",url + "/dire-color-red.png"));
        style.add(new Style("Color (BLUE)",url + "/dire-color-blue.png"));
        style.add(new Style("Color (YELLOW)",url + "/dire-color-yellow.png"));
        style.add(new Style("Color (BROWN)",url + "/dire-color-brown.png"));
        styleSet.setStages(style);
        saveStyleSet(styleSet);

        //Calamity Style
        styleSet = new StyleSet();
        styleSet.setStyleSetName("Calamity Style");
        style = new ArrayList<>();
        style.add(new Style("Base",url + "/calamity-base.png"));
        style.add(new Style("Stage 1",url + "/calamity-stage-1.png"));
        style.add(new Style("Stage 2",url + "/calamity-stage-2.png"));
        style.add(new Style("Stage 3",url + "/calamity-stage-3.png"));
        style.add(new Style("Stage 4",url + "/calamity-stage-4.png"));
        style.add(new Style("Stage 5",url + "/calamity-stage-5.png"));
        style.add(new Style("Color (WHITE)",url + "/calamity-color-white.png"));
        style.add(new Style("Color (TEAL)",url + "/calamity-color-teal.png"));
        style.add(new Style("Color (PURPLE)",url + "/calamity-color-purple.png"));
        style.add(new Style("Color (BLACK)",url + "/calamity-color-black.png"));
        styleSet.setStages(style);
        saveStyleSet(styleSet);

        //Lynx Style
        styleSet = new StyleSet();
        styleSet.setStyleSetName("Lynx Style");
        style = new ArrayList<>();
        style.add(new Style("Base",url + "/lynx-base.png"));
        style.add(new Style("Stage 1",url + "/lynx-stage-1.png"));
        style.add(new Style("Stage 2",url + "/lynx-stage-2.png"));
        style.add(new Style("Stage 3",url + "/lynx-stage-3.png"));
        style.add(new Style("Stage 4",url + "/lynx-stage-4.png"));
        style.add(new Style("Color (DEFAULT)",url + "/lynx-color-default.png"));
        style.add(new Style("Color (RED)",url + "/lynx-color-red.png"));
        style.add(new Style("Color (BLUE)",url + "/lynx-color-blue.png"));
        style.add(new Style("Color (BLACK)",url + "/lynx-color-black.png"));
        styleSet.setStages(style);
        saveStyleSet(styleSet);

        //Nation Football League Team Style
        styleSet = new StyleSet();
        styleSet.setStyleSetName("Nation Football League Team Style");
        style = new ArrayList<>();
        style.add(new Style("Color (FORTNITE)",url + "/nfl-color-fortnite.png"));
        style.add(new Style("Color (ARIZONA CARDINALS)",url + "/nfl-color-arizona-cardinals.png"));
        style.add(new Style("Color (ATLANTA FALCONS)",url + "/nfl-color-atlanta-falcons.png"));
        style.add(new Style("Color (BALTIMORE RAVENS)",url + "/nfl-color-baltimore-ravens.png"));
        style.add(new Style("Color (BUFFALO BILLS)",url + "/nfl-color-buffalo-bills.png"));
        style.add(new Style("Color (CAROLINA PANTHERS)",url + "/nfl-color-carolina-panthers.png"));
        style.add(new Style("Color (CHICAGO BEARS)",url + "/nfl-color-chicago-bears.png"));
        style.add(new Style("Color (CINCINNATI BENGALS)",url + "/nfl-color-cincinnati-bengals.png"));
        style.add(new Style("Color (CLEVELAND BROWNS)",url + "/nfl-color-cleveland-browns.png"));
        style.add(new Style("Color (DALLAS COWBOYS)",url + "/nfl-color-dallas-cowboys.png"));
        style.add(new Style("Color (DENVER BRONCOS)",url + "/nfl-color-denver-broncos.png"));
        style.add(new Style("Color (DETROIT LIONS)",url + "/nfl-color-detroit-lions.png"));
        style.add(new Style("Color (GREEN BAY PACKERS)",url + "/nfl-color-green-bay-packers.png"));
        style.add(new Style("Color (HOUSTON TEXANS)",url + "/nfl-color-houston-texans.png"));
        style.add(new Style("Color (INDIANAPOLIS COLTS)",url + "/nfl-color-indianapolis-colts.png"));
        style.add(new Style("Color (JACKSONVILLE JAGUARS)",url + "/nfl-color-jacksonville-jaguars.png"));
        style.add(new Style("Color (KANSAS CITY CHIEFS)",url + "/nfl-color-kansas-city-chiefs.png"));
        style.add(new Style("Color (LOS ANGELES CHARGERS)",url + "/nfl-color-los-angeles-chargers.png"));
        style.add(new Style("Color (LOS ANGELES RAMS)",url + "/nfl-color-los-angeles-rams.png"));
        style.add(new Style("Color (MIAMI DOLPHINS)",url + "/nfl-color-miami-dolphins.png"));
        style.add(new Style("Color (MINNESOTA VIKINGS)",url + "/nfl-color-minnesota-vikings.png"));
        style.add(new Style("Color (NEW ENGLAND PATRIOTS)",url + "/nfl-color-new-englang-patriots.png"));
        style.add(new Style("Color (NEW ORLEANS SAINTS)",url + "/nfl-color-new-orleans-saints.png"));
        style.add(new Style("Color (NEW YORK GIANTS)",url + "/nfl-color-new-york-giants.png"));
        style.add(new Style("Color (NEW YORK JETS)",url + "/nfl-color-new-york-jets.png"));
        style.add(new Style("Color (OAKLAND RAIDERS)",url + "/nfl-color-oakland-raiders.png"));
        style.add(new Style("Color (PHILADELPHIA EAGLES)",url + "/nfl-color-phildaelphia-eagles.png"));
        style.add(new Style("Color (PITTSBURGH STEELERS)",url + "/nfl-color-pittsburgh-steelers.png"));
        style.add(new Style("Color (SAN FRANCISCO 49ERS)",url + "/nfl-color-san-franciso-49ers.png"));
        style.add(new Style("Color (SEATTLE SEAHAWKS)",url + "/nfl-color-seattle-seahawks.png"));
        style.add(new Style("Color (TAMPBA BAY BUCCANEERS)",url + "/nfl-color-tampba-bay-buccaneers.png"));
        style.add(new Style("Color (TENNESSEE TITANS)",url + "/nfl-color-tennesse-titans.png"));
        style.add(new Style("Color (WASHINGTON REDKINS)",url + "/nfl-color-washington-redskins.png"));
        styleSet.setStages(style);
        saveStyleSet(styleSet);

        //Zenith Style
        styleSet = new StyleSet();
        styleSet.setStyleSetName("Zenith Style");
        style = new ArrayList<>();
        style.add(new Style("Base",url + "/zenith-base.png"));
        style.add(new Style("Stage 1",url + "/zenith-stage-1.png"));
        style.add(new Style("Stage 2",url + "/zenith-stage-2.png"));
        style.add(new Style("Stage 3",url + "/zenith-stage-3.png"));
        style.add(new Style("Stage 4",url + "/zenith-stage-4.png"));
        style.add(new Style("Color (WHITE)",url + "/zenith-color-white.png"));
        style.add(new Style("Color (STRIPED)",url + "/zenith-color-striped.png"));
        style.add(new Style("Color (YELLOW)",url + "/zenith-color-yellow.png"));
        style.add(new Style("Color (BLACK)",url + "/zenith-color-black.png"));
        style.add(new Style("Visor (PURPLE)",url + "/zenith-visor-purple.png"));
        style.add(new Style("Visor (ORANGE)",url + "/zenith-visor-orange.png"));
        style.add(new Style("Visor (BLUE)",url + "/zenith-visor-blue.png"));
        style.add(new Style("Visor (GREEN)",url + "/zenith-visor-green.png"));
        styleSet.setStages(style);
        saveStyleSet(styleSet);

        //Sgt. Winter Style
        styleSet = new StyleSet();
        styleSet.setStyleSetName("Sgt. Winter Style");
        style = new ArrayList<>();
        style.add(new Style("Headgear (GOGGLES)",url + "/sgt-winter-headgear-goggles.png"));
        style.add(new Style("Headgear (BATTLE BUS BALLOON)",url + "/sgt-winter-headgear-battle-bus-balloon.png"));
        style.add(new Style("Headgear (REINDEER LLAMA)",url + "/sgt-winter-headgear-reindeer-llama.png"));
        styleSet.setStages(style);
        saveStyleSet(styleSet);

        //The Ice King Style
        styleSet = new StyleSet();
        styleSet.setStyleSetName("The Ice King Style");
        style = new ArrayList<>();
        style.add(new Style("Color (BLUE)",url + "/ice-king-color-blue.png"));
        style.add(new Style("Color (RED)",url + "/ice-king-color-red.png"));
        style.add(new Style("Color (SILVER)",url + "/ice-king-color-silver.png"));
        style.add(new Style("Color (GOLD",url + "/ice-king-color-gold.png"));
        styleSet.setStages(style);
        saveStyleSet(styleSet);

        logger.info("Finished Loading Style Set Data");
    }

    private void saveStyleSet(StyleSet set){
        if(!(hasDuplicate(set))){
            styleSetServiceImpl.save(set);
        }
    }
    private boolean hasDuplicate(StyleSet set){
        for(StyleSet s: stylesInDB){
            if(s.getStyleSetName().equals(set.getStyleSetName())){
                return true;
            }
        }
        return false;
    }

}
