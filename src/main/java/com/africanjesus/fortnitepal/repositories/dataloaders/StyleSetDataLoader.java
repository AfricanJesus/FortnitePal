package com.africanjesus.fortnitepal.repositories.dataloaders;

import com.africanjesus.fortnitepal.model.documents.Style;
import com.africanjesus.fortnitepal.model.documents.StyleSet;
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
    private String url = "https://s3.us-east-2.amazonaws.com/fortnitepal/images";
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
        style.add(new Style("Carbide Chest",url + "/challenge/carbide-chest.png"));
        style.add(new Style("Carbide Legs",url + "/challenge/carbide-legs.png"));
        style.add(new Style("Carbide Arms",url + "/challenge/carbide-arms.png"));
        style.add(new Style("Carbide Head",url + "/challenge/carbide-head.png"));
        style.add(new Style("Carbide Accents",url + "/challenge/carbide-chest-2.png"));
        style.add(new Style("Carbide Accents (BLUE)",url + "/challenge/carbide-blue.png"));
        style.add(new Style("Carbide Accents (YELLOW)",url + "/challenge/carbide-yellow.png"));
        style.add(new Style("Carbide Accents (GREEN)",url + "/challenge/carbide-green.png"));
        style.add(new Style("Carbide Accents (PINK)",url + "/challenge/carbide-pink.png"));
        styleSet.setStages(style);
        saveStyleSet(styleSet);

        //Drift Style
        styleSet = new StyleSet();
        styleSet.setStyleSetName("Drift Style");
        style = new ArrayList<>();
        style.add(new Style("Base",url + "/challenge/drift-base.png"));
        style.add(new Style("Stage 1",url + "/challenge/drift-stage-1.png"));
        style.add(new Style("Stage 2",url + "/challenge/drift-stage-2.png"));
        style.add(new Style("Stage 3",url + "/challenge/drift-stage-3.png"));
        style.add(new Style("Stage 4",url + "/challenge/drift-stage-4.png"));
        style.add(new Style("Stage 5",url + "/challenge/drift-stage-5.png"));
        styleSet.setStages(style);
        saveStyleSet(styleSet);

        //Ragnarok Style
        styleSet = new StyleSet();
        styleSet.setStyleSetName("Ragnarok Style");
        style = new ArrayList<>();
        style.add(new Style("Base",url + "/challengeragnarok-base.png"));
        style.add(new Style("Stage 1",url + "/challenge/ragnarok-stage-1.png"));
        style.add(new Style("Stage 2",url + "/challenge/ragnarok-stage-2.png"));
        style.add(new Style("Stage 3",url + "/challenge/ragnarok-stage-3.png"));
        style.add(new Style("Stage 4",url + "/challenge/ragnarok-stage-4.png"));
        style.add(new Style("Stage 5",url + "/challenge/ragnarok-stage-5.png"));
        styleSet.setStages(style);
        saveStyleSet(styleSet);

        //Omega Style
        styleSet = new StyleSet();
        styleSet.setStyleSetName("Omega Style");
        style = new ArrayList<>();
        style.add(new Style("Omega Chest",url + "/challenge/omega-chest.png"));
        style.add(new Style("Omega Legs",url + "/challenge/omega-legs.png"));
        style.add(new Style("Omega Arms",url + "/challenge/omega-arms.png"));
        style.add(new Style("Omega Mask",url + "/challenge/omega-mask.png"));
        style.add(new Style("Omega Accents (RED)",url + "/challenge/omega-red.png"));
        style.add(new Style("Omega Accents (YELLOW)",url + "/challenge/omega-yellow.png"));
        style.add(new Style("Omega Accents (PURPLE)",url + "/challenge/omega-purple.png"));
        style.add(new Style("Omega Accents (ORANGE)",url + "/challenge/omega-orange.png"));
        styleSet.setStages(style);
        saveStyleSet(styleSet);

        //The Visitor Style
        styleSet = new StyleSet();
        styleSet.setStyleSetName("The Visitor Style");
        style = new ArrayList<>();
        style.add(new Style("Crosshair",url + "/challenge/the-visitor-crosshair.png"));
        style.add(new Style("Visualizer",url + "/challenge/the-visitor-visualizer.png"));
        style.add(new Style("Smiles",url + "/challenge/the-visitor-smiles.png"));
        style.add(new Style("Mandible",url + "/challenge/the-visitor-mandible.png"));
        styleSet.setStages(style);
        saveStyleSet(styleSet);

        //Scratchmark Style
        styleSet = new StyleSet();
        styleSet.setStyleSetName("Scratchmark Style");
        style = new ArrayList<>();
        style.add(new Style("Color (DEFAULT)",url + "/challenge/scratchmark-default.png"));
        style.add(new Style("Color (RED)",url + "/challenge/scratchmark-red.png"));
        style.add(new Style("Color (BLUE)",url + "/challenge/scratchmark-blue.png"));
        style.add(new Style("Color (WHITE)",url + "/challenge/scratchmark-white.png"));
        styleSet.setStages(style);
        saveStyleSet(styleSet);

        //Ice Sceptre Style
        styleSet = new StyleSet();
        styleSet.setStyleSetName("Ice Sceptre Style");
        style = new ArrayList<>();
        style.add(new Style("Color (BLACK)",url + "/challenge/ice-sceptre-black.png"));
        style.add(new Style("Color (BLUE)",url + "/challenge/ice-sceptre-blue.png"));
        style.add(new Style("Color (GOLD)",url + "/challenge/ice-sceptre-gold.png"));
        style.add(new Style("Color (SILVER)",url + "/challenge/ice-sceptre-silver.png"));
        styleSet.setStages(style);
        saveStyleSet(styleSet);

        //Ice Mantle Style
        styleSet = new StyleSet();
        styleSet.setStyleSetName("Ice Mantle Style");
        style = new ArrayList<>();
        style.add(new Style("Color (BLACK)",url + "/challenge/ice-mantle-black.png"));
        style.add(new Style("Color (BLUE)",url + "/challenge/ice-mantle-blue.png"));
        style.add(new Style("Color (GOLD)",url + "/challenge/ice-mantle-gold.png"));
        style.add(new Style("Color (SILVER)",url + "/challenge/ice-mantle-silver.png"));
        styleSet.setStages(style);
        saveStyleSet(styleSet);

        //Musha Style
        styleSet = new StyleSet();
        styleSet.setStyleSetName("Musha Style");
        style = new ArrayList<>();
        style.add(new Style("Stage 1",url + "/challenge/musha-stage-1.png"));
        style.add(new Style("Stage 2",url + "/challenge/musha-stage-2.png"));
        style.add(new Style("Stage 3",url + "/challenge/musha-stage-3.png"));
        styleSet.setStages(style);
        saveStyleSet(styleSet);

        //Hime Style
        styleSet = new StyleSet();
        styleSet.setStyleSetName("Hime Style");
        style = new ArrayList<>();
        style.add(new Style("Stage 1",url + "/challenge/hime-stage-1.png"));
        style.add(new Style("Stage 2",url + "/challenge/hime-stage-2.png"));
        style.add(new Style("Stage 3",url + "/challenge/hime-stage-3.png"));
        styleSet.setStages(style);
        saveStyleSet(styleSet);

        //Ghost Portal Style
        styleSet = new StyleSet();
        styleSet.setStyleSetName("Ghost Portal Style");
        style = new ArrayList<>();
        style.add(new Style("Color (BLUE)",url + "/challenge/ghost-portal-color-blue.png"));
        style.add(new Style("Color (GREEN)",url + "/challenge/ghost-portal-color-green.png"));
        style.add(new Style("Color (PURPLE)",url + "/challenge/ghost-portal-color-purple.png"));
        styleSet.setStages(style);
        saveStyleSet(styleSet);

        //Tomatohead Style
        styleSet = new StyleSet();
        styleSet.setStyleSetName("Tomatohead Style");
        style = new ArrayList<>();
        style.add(new Style("No Crown",url + "/challenge/tomatohead.png"));
        style.add(new Style("Tomatohead Crown",url + "/challenge/tomatohead-crown.png"));
        styleSet.setStages(style);
        saveStyleSet(styleSet);

        //Wild Card Style
        styleSet = new StyleSet();
        styleSet.setStyleSetName("Wild Card Style");
        style = new ArrayList<>();
        style.add(new Style("Spade",url + "/challenge/wild-card-spade.png"));
        style.add(new Style("Heart",url + "/challenge/wild-card-heart.png"));
        style.add(new Style("Diamond",url + "/challenge/wild-card-diamond.png"));
        style.add(new Style("Club",url + "/challenge/wild-card-club.png"));
        styleSet.setStages(style);
        saveStyleSet(styleSet);

        //Peekaboo Style
        styleSet = new StyleSet();
        styleSet.setStyleSetName("Peekaboo Style");
        style = new ArrayList<>();
        style.add(new Style("No Mask",url + "/challenge/peekaboo-no-mask.png"));
        style.add(new Style("Mask",url + "/challenge/peekaboo-mask.png"));
        styleSet.setStages(style);
        saveStyleSet(styleSet);

        //Nite Nite Style
        styleSet = new StyleSet();
        styleSet.setStyleSetName("Nite Nite Style");
        style = new ArrayList<>();
        style.add(new Style("No Mask",url + "/challenge/nite-nite-no-mask.png"));
        style.add(new Style("Mask",url + "/challenge/nite-nite-mask.png"));
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
        style.add(new Style("Hamirez Pink",url + "/pet/hamirez-pink.png"));
        style.add(new Style("Hamirez Brown",url + "/pet/hamirez-brown.png"));
        styleSet.setStages(style);
        saveStyleSet(styleSet);

        //Skull Trooper Style
        styleSet = new StyleSet();
        styleSet.setStyleSetName("Skull Trooper Style");
        style = new ArrayList<>();
        style.add(new Style("Style (WHITE)",url + "/challenge/skull-trooper-color-white.png"));
        style.add(new Style("Style (GREEN GLOW)",url + "/challenge/skull-trooper-color-green-glow.png"));
        style.add(new Style("Style (PURPLE)",url + "/challenge/skull-trooper-color-purple.png"));
        styleSet.setStages(style);
        saveStyleSet(styleSet);

        //Skull Ranger Style
        styleSet = new StyleSet();
        styleSet.setStyleSetName("Skull Ranger Style");
        style = new ArrayList<>();
        style.add(new Style("Style (WHITE)",url + "/challenge/skull-ranger-color-white.png"));
        style.add(new Style("Style (GREEN GLOW)",url + "/challenge/skull-ranger-color-green-glow.png"));
        styleSet.setStages(style);
        saveStyleSet(styleSet);

        //Ginger Gunner Style
        styleSet = new StyleSet();
        styleSet.setStyleSetName("Ginger Gunner");
        style = new ArrayList<>();
        style.add(new Style("Style (DEFAULT)",url + "/challenge/ginger-gunner-default.png"));
        style.add(new Style("Style (SMILE)",url + "/challenge/ginger-gunner-smile.png"));
        style.add(new Style("Style (BURNT FROWN)",url + "/challenge/ginger-gunner-burnt-frown.png"));
        style.add(new Style("Style (BURNT SMILE)",url + "/challenge/ginger-gunner-burnt-smile.png"));
        styleSet.setStages(style);
        saveStyleSet(styleSet);

        //Merry Marauder Style
        styleSet = new StyleSet();
        styleSet.setStyleSetName("Merry Marauder");
        style = new ArrayList<>();
        style.add(new Style("Style (DEFAULT)",url + "/challenge/merry-marauder-default.png"));
        style.add(new Style("Style (SMILE)",url + "/challenge/merry-marauder-smile.png"));
        style.add(new Style("Style (BURNT FROWN)",url + "/challenge/merry-marauder-burnt-frown.png"));
        style.add(new Style("Style (BURNT SMILE)",url + "/challenge/merry-marauder-burnt-smile.png"));
        styleSet.setStages(style);
        saveStyleSet(styleSet);

        //Crypt Cruiser Style
        styleSet = new StyleSet();
        styleSet.setStyleSetName("Crypt Cruiser Style");
        style = new ArrayList<>();
        style.add(new Style("Color (BLUE)",url + "/challenge/crypt-cruiser-blue.png"));
        style.add(new Style("Color (GREEN)",url + "/challenge/crypt-cruiser-green.png"));
        styleSet.setStages(style);
        saveStyleSet(styleSet);

        //Dire Style
        styleSet = new StyleSet();
        styleSet.setStyleSetName("Dire Style");
        style = new ArrayList<>();
        style.add(new Style("Base",url + "/challenge/dire-base.png"));
        style.add(new Style("Stage (Half-Wolf)",url + "/challenge/dire-half-wolf.png"));
        style.add(new Style("Stage (Brown Werewolf)",url + "/challenge/dire-brown-werewolf.png"));
        style.add(new Style("Stage (Grey Werewolf)",url + "/challenge/dire-grey-werewolf.png"));
        style.add(new Style("Stage (White Werewolf)",url + "/challenge/dire-white-werewolf.png"));
        style.add(new Style("Stage (Black Werewolf)",url + "/challenge/dire-black-werewolf.png"));
        style.add(new Style("Color (RED)",url + "/challenge/dire-color-red.png"));
        style.add(new Style("Color (BLUE)",url + "/challenge/dire-color-blue.png"));
        style.add(new Style("Color (YELLOW)",url + "/challenge/dire-color-yellow.png"));
        style.add(new Style("Color (BROWN)",url + "/challenge/dire-color-brown.png"));
        styleSet.setStages(style);
        saveStyleSet(styleSet);

        //Calamity Style
        styleSet = new StyleSet();
        styleSet.setStyleSetName("Calamity Style");
        style = new ArrayList<>();
        style.add(new Style("Base",url + "/challenge/calamity-base.png"));
        style.add(new Style("Stage 1",url + "/challenge/calamity-stage-1.png"));
        style.add(new Style("Stage 2",url + "/challenge/calamity-stage-2.png"));
        style.add(new Style("Stage 3",url + "/challenge/calamity-stage-3.png"));
        style.add(new Style("Stage 4",url + "/challenge/calamity-stage-4.png"));
        style.add(new Style("Stage 5",url + "/challenge/calamity-stage-5.png"));
        style.add(new Style("Color (WHITE)",url + "/challenge/challenge/calamity-color-white.png"));
        style.add(new Style("Color (TEAL)",url + "/challenge/calamity-color-teal.png"));
        style.add(new Style("Color (PURPLE)",url + "/challenge/calamity-color-purple.png"));
        style.add(new Style("Color (BLACK)",url + "/challenge/calamity-color-black.png"));
        styleSet.setStages(style);
        saveStyleSet(styleSet);

        //Lynx Style
        styleSet = new StyleSet();
        styleSet.setStyleSetName("Lynx Style");
        style = new ArrayList<>();
        style.add(new Style("Stage 1",url + "/challenge/lynx-stage-1.png"));
        style.add(new Style("Stage 2",url + "/challenge/lynx-stage-2.png"));
        style.add(new Style("Stage 3",url + "/challenge/lynx-stage-3.png"));
        style.add(new Style("Stage 4",url + "/challenge/lynx-stage-4.png"));
        style.add(new Style("Color (DEFAULT)",url + "/challenge/lynx-color-default.png"));
        style.add(new Style("Color (RED)",url + "/challenge/lynx-color-red.png"));
        style.add(new Style("Color (BLUE)",url + "/challenge/lynx-color-blue.png"));
        style.add(new Style("Color (BLACK)",url + "/challenge/lynx-color-black.png"));
        styleSet.setStages(style);
        saveStyleSet(styleSet);

        //Nation Football League Team Style
        styleSet = new StyleSet();
        styleSet.setStyleSetName("Nation Football League Team Style");
        style = new ArrayList<>();
        style.add(new Style("Color (FORTNITE)",url + "/challenge/nfl-color-fortnite.png"));
        style.add(new Style("Color (ARIZONA CARDINALS)",url + "/challenge/nfl-color-arizona-cardinals.png"));
        style.add(new Style("Color (ATLANTA FALCONS)",url + "/challenge/nfl-color-atlanta-falcons.png"));
        style.add(new Style("Color (BALTIMORE RAVENS)",url + "/challenge/nfl-color-baltimore-ravens.png"));
        style.add(new Style("Color (BUFFALO BILLS)",url + "/challenge/nfl-color-buffalo-bills.png"));
        style.add(new Style("Color (CAROLINA PANTHERS)",url + "/challenge/nfl-color-carolina-panthers.png"));
        style.add(new Style("Color (CHICAGO BEARS)",url + "/challenge/nfl-color-chicago-bears.png"));
        style.add(new Style("Color (CINCINNATI BENGALS)",url + "/challenge/nfl-color-cincinnati-bengals.png"));
        style.add(new Style("Color (CLEVELAND BROWNS)",url + "/challenge/nfl-color-cleveland-browns.png"));
        style.add(new Style("Color (DALLAS COWBOYS)",url + "/challenge/nfl-color-dallas-cowboys.png"));
        style.add(new Style("Color (DENVER BRONCOS)",url + "/challenge/nfl-color-denver-broncos.png"));
        style.add(new Style("Color (DETROIT LIONS)",url + "/challenge/nfl-color-detroit-lions.png"));
        style.add(new Style("Color (GREEN BAY PACKERS)",url + "/challenge/nfl-color-green-bay-packers.png"));
        style.add(new Style("Color (HOUSTON TEXANS)",url + "/challenge/nfl-color-houston-texans.png"));
        style.add(new Style("Color (INDIANAPOLIS COLTS)",url + "/challenge/nfl-color-indianapolis-colts.png"));
        style.add(new Style("Color (JACKSONVILLE JAGUARS)",url + "/challenge/nfl-color-jacksonville-jaguars.png"));
        style.add(new Style("Color (KANSAS CITY CHIEFS)",url + "/challenge/nfl-color-kansas-city-chiefs.png"));
        style.add(new Style("Color (LOS ANGELES CHARGERS)",url + "/challenge/nfl-color-los-angeles-chargers.png"));
        style.add(new Style("Color (LOS ANGELES RAMS)",url + "/challenge/nfl-color-los-angeles-rams.png"));
        style.add(new Style("Color (MIAMI DOLPHINS)",url + "/challenge/nfl-color-miami-dolphins.png"));
        style.add(new Style("Color (MINNESOTA VIKINGS)",url + "/challenge/nfl-color-minnesota-vikings.png"));
        style.add(new Style("Color (NEW ENGLAND PATRIOTS)",url + "/challenge/nfl-color-new-englang-patriots.png"));
        style.add(new Style("Color (NEW ORLEANS SAINTS)",url + "/challenge/nfl-color-new-orleans-saints.png"));
        style.add(new Style("Color (NEW YORK GIANTS)",url + "/challenge/nfl-color-new-york-giants.png"));
        style.add(new Style("Color (NEW YORK JETS)",url + "/challenge/nfl-color-new-york-jets.png"));
        style.add(new Style("Color (OAKLAND RAIDERS)",url + "/challenge/nfl-color-oakland-raiders.png"));
        style.add(new Style("Color (PHILADELPHIA EAGLES)",url + "/challenge/nfl-color-phildaelphia-eagles.png"));
        style.add(new Style("Color (PITTSBURGH STEELERS)",url + "/challenge/nfl-color-pittsburgh-steelers.png"));
        style.add(new Style("Color (SAN FRANCISCO 49ERS)",url + "/challenge/nfl-color-san-franciso-49ers.png"));
        style.add(new Style("Color (SEATTLE SEAHAWKS)",url + "/challenge/nfl-color-seattle-seahawks.png"));
        style.add(new Style("Color (TAMPBA BAY BUCCANEERS)",url + "/challenge/nfl-color-tampba-bay-buccaneers.png"));
        style.add(new Style("Color (TENNESSEE TITANS)",url + "/challenge/nfl-color-tennesse-titans.png"));
        style.add(new Style("Color (WASHINGTON REDKINS)",url + "/challenge/nfl-color-washington-redskins.png"));
        styleSet.setStages(style);
        saveStyleSet(styleSet);

        //Zenith Style
        styleSet = new StyleSet();
        styleSet.setStyleSetName("Zenith Style");
        style = new ArrayList<>();
        style.add(new Style("Stage 1",url + "/challenge/zenith-stage-1.png"));
        style.add(new Style("Stage 2",url + "/challenge/zenith-stage-2.png"));
        style.add(new Style("Stage 3",url + "/challenge/zenith-stage-3.png"));
        style.add(new Style("Stage 4",url + "/challenge/zenith-stage-4.png"));
        style.add(new Style("Color (WHITE)",url + "/challenge/zenith-color-white.png"));
        style.add(new Style("Color (STRIPED)",url + "/challenge/zenith-color-striped.png"));
        style.add(new Style("Color (YELLOW)",url + "/challenge/zenith-color-yellow.png"));
        style.add(new Style("Color (BLACK)",url + "/challenge/zenith-color-black.png"));
        style.add(new Style("Visor (PURPLE)",url + "/challenge/zenith-visor-purple.png"));
        style.add(new Style("Visor (ORANGE)",url + "/challenge/zenith-visor-orange.png"));
        style.add(new Style("Visor (BLUE)",url + "/challenge/zenith-visor-blue.png"));
        style.add(new Style("Visor (GREEN)",url + "/challenge/zenith-visor-green.png"));
        styleSet.setStages(style);
        saveStyleSet(styleSet);

        //Sgt. Winter Style
        styleSet = new StyleSet();
        styleSet.setStyleSetName("Sgt. Winter Style");
        style = new ArrayList<>();
        style.add(new Style("Headgear (GOGGLES)",url + "/challenge/sgt-winter-headgear-goggles.png"));
        style.add(new Style("Headgear (BATTLE BUS BALLOON)",url + "/challenge/sgt-winter-headgear-battle-bus-balloon.png"));
        style.add(new Style("Headgear (REINDEER LLAMA)",url + "/challenge/sgt-winter-headgear-reindeer-llama.png"));
        styleSet.setStages(style);
        saveStyleSet(styleSet);

        //The Ice King Style
        styleSet = new StyleSet();
        styleSet.setStyleSetName("The Ice King Style");
        style = new ArrayList<>();
        style.add(new Style("Color (BLUE)",url + "/challenge/ice-king-color-blue.png"));
        style.add(new Style("Color (RED)",url + "/challenge/ice-king-color-red.png"));
        style.add(new Style("Color (SILVER)",url + "/challenge/ice-king-color-silver.png"));
        style.add(new Style("Color (GOLD)",url + "/challenge/ice-king-color-gold.png"));
        styleSet.setStages(style);
        saveStyleSet(styleSet);

        logger.info("Finished Loading Style Set Data");
    }

    private void saveStyleSet(StyleSet set){
        //if duplicate, update existing styleset
        //else save new styleset
        if(hasDuplicate(set)){
            styleSetServiceImpl.save(set);
        }else{
            styleSetServiceImpl.save(set);
        }
    }
    private boolean hasDuplicate(StyleSet set){
        for(StyleSet s: stylesInDB){
            if(s.getStyleSetName().equals(set.getStyleSetName())){
                set.set_id(s.get_id());
                return true;
            }
        }
        return false;
    }
}
