package com.africanjesus.fortnitepal.repositories.dataloaders;

import com.africanjesus.fortnitepal.model.documents.Challenge;
import com.africanjesus.fortnitepal.model.documents.ChallengeSet;
import com.africanjesus.fortnitepal.services.ChallengeSetServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ChallengeSetDataLoader implements CommandLineRunner {

    private final Logger logger = LoggerFactory.getLogger(ChallengeSetDataLoader.class);
    private String url = "https://s3.us-east-2.amazonaws.com/fortnitepal";
    private ChallengeSetServiceImpl challengeSetServiceImpl;
    private List<ChallengeSet> setsInDB;

    @Autowired
    public ChallengeSetDataLoader(ChallengeSetServiceImpl challengeSetServiceImpl) {
        this.challengeSetServiceImpl = challengeSetServiceImpl;
    }

    @Override
    public void run(String... args){
        logger.info("Started Loading Challenge Set Data");
        setsInDB = challengeSetServiceImpl.findAll();
        ChallengeSet challengeSet;
        List<Challenge> challenges;

        //Carbide Challenges
        challengeSet = new ChallengeSet();
        challengeSet.setChallengeSetName("Carbide Challenges");
        challengeSet.setChallengeSetObjective("Complete any 3 challenges to earn reward item");
        challengeSet.setChallengeSetReward("Positron");
        challengeSet.setChallengeSetRewardImage(url + "/images/harvestingtool/positron.png");
        challenges = new ArrayList<>();
        challenges.add(new Challenge("Reach Season Level 10", "Carbide Chest", url + "/images/challenge/carbide-chest.png"));
        challenges.add(new Challenge("Reach Season Level 20", "Carbide Legs", url + "/images/challenge/carbide-legs.png"));
        challenges.add(new Challenge("Reach Season Level 30", "Carbide Arms", url + "/images/challenge/carbide-arms.png"));
        challenges.add(new Challenge("Reach Season Level 40", "Carbide Head", url + "/images/challenge/carbide-head.png"));
        challenges.add(new Challenge("Reach Season Level 65", "Carbide Accents", url + "/images/challenge/carbide-chest-2.png"));
        challengeSet.setChallenges(challenges);
        saveChallengeSet(challengeSet);

        //Drift Challenges
        challengeSet = new ChallengeSet();
        challengeSet.setChallengeSetName("Drift Challenges");
        challengeSet.setChallengeSetObjective("Complete any 4 challenges to earn reward item");
        challengeSet.setChallengeSetReward("Rift Edge");
        challengeSet.setChallengeSetRewardImage(url + "/images/harvestingtool/rift-edge.png");
        challenges = new ArrayList<>();
        challenges.add(new Challenge("Gain 10,000 XP", "Stage 1", url + "/images/challenge/drift-stage-1.png"));
        challenges.add(new Challenge("Gain 25,000 XP", "Stage 2", url + "/images/challenge/drift-stage-2.png"));
        challenges.add(new Challenge("Gain 50,000 XP", "Stage 3", url + "/images/challenge/drift-stage-3.png"));
        challenges.add(new Challenge("Gain 100,000 XP", "Stage 4", url + "/images/challenge/drift-stage-4.png"));
        challenges.add(new Challenge("Gain 200,000 XP", "Stage 5", url + "/images/challenge/drift-stage-5.png"));
        challengeSet.setChallenges(challenges);
        saveChallengeSet(challengeSet);

        //Omega Challenges
        challengeSet = new ChallengeSet();
        challengeSet.setChallengeSetName("Omega Challenges");
        challengeSet.setChallengeSetObjective("Complete any 3 challenges to earn reward item");
        challengeSet.setChallengeSetReward("Onslaught");
        challengeSet.setChallengeSetRewardImage(url + "/images/harvestingtool/onslaught.png");
        challenges = new ArrayList<>();
        challenges.add(new Challenge("Reach Season Level 25", "Omega Chest", url + "/images/challenge/omega-chest.png"));
        challenges.add(new Challenge("Reach Season Level 35", "Omega Legs", url + "/images/challenge/omega-legs.png"));
        challenges.add(new Challenge("Reach Season Level 45", "Omega Arms", url + "/images/challenge/omega-arms.png"));
        challenges.add(new Challenge("Reach Season Level 55", "Omega Mask", url + "/images/challenge/omega-mask.png"));
        challenges.add(new Challenge("Reach Season Level 80", "Omega Accent", url + "/images/challenge/omega-accent.png"));
        challengeSet.setChallenges(challenges);
        saveChallengeSet(challengeSet);

        //Ragnarok Challenges
        challengeSet = new ChallengeSet();
        challengeSet.setChallengeSetName("Ragnarok Challenges");
        challengeSet.setChallengeSetObjective("Complete any 4 challenges to earn reward item");
        challengeSet.setChallengeSetReward("Permafrost");
        challengeSet.setChallengeSetRewardImage(url + "/images/harvestingtool/permafrost.png");
        challenges = new ArrayList<>();
        challenges.add(new Challenge("Gain 35,000 XP", "Stage 1", url + "/images/challenge/ragnarok-stage-1.png"));
        challenges.add(new Challenge("Gain 75,000 XP", "Stage 2", url + "/images/challenge/ragnarok-stage-2.png"));
        challenges.add(new Challenge("Gain 120,000 XP", "Stage 3", url + "/images/challenge/ragnarok-stage-3.png"));
        challenges.add(new Challenge("Gain 250,000 XP", "Stage 4", url + "/images/challenge/ragnarok-stage-4.png"));
        challenges.add(new Challenge("Gain 500,000 XP", "Stage 5", url + "/images/challenge/ragnarok-stage-5.png"));
        challengeSet.setChallenges(challenges);
        saveChallengeSet(challengeSet);


        //Calamity Challenges
        challengeSet = new ChallengeSet();
        challengeSet.setChallengeSetName("Calamity Challenges");
        challengeSet.setChallengeSetObjective("Complete any 5 challenges to earn reward item");
        challengeSet.setChallengeSetReward("Reckoning");
        challengeSet.setChallengeSetRewardImage(url + "/images/harvestingtool/reckoning.png");
        challenges = new ArrayList<>();
        challenges.add(new Challenge("Gain 20,000 XP", "Stage 1", url + "/images/challenge/calamity-stage-1.png"));
        challenges.add(new Challenge("Gain 50,000 XP", "Stage 2", url + "/images/challenge/calamity-stage-2.png"));
        challenges.add(new Challenge("Gain 90,000 XP", "Stage 3", url + "/images/challenge/calamity-stage-3.png"));
        challenges.add(new Challenge("Gain 140,000 XP", "Stage 4", url + "/images/challenge/calamity-stage-4.png"));
        challenges.add(new Challenge("Gain 200,000 XP", "Stage 5", url + "/images/challenge/calamity-stage-5.png"));
        challenges.add(new Challenge("Complete 10 Weekly Challenges", "Color (TEAL)",url + "/images/challenge/calamity-color-teal.png"));
        challenges.add(new Challenge("Complete 25 Weekly Challenges", "Color (PURPLE)",url + "/images/challenge/calamity-color-purple.png"));
        challenges.add(new Challenge("Complete 50 Weekly Challenges", "Color (BLACK)",url + "/images/challenge/calamity-color-black.png"));
        challengeSet.setChallenges(challenges);
        saveChallengeSet(challengeSet);

        //Dire Challenges
        challengeSet = new ChallengeSet();
        challengeSet.setChallengeSetName("Dire Challenges");
        challengeSet.setChallengeSetObjective("Complete any 5 challenges to earn reward item");
        challengeSet.setChallengeSetReward("Wolfpack");
        challengeSet.setChallengeSetRewardImage(url + "/images/backbling/wolfpack.png");
        challenges = new ArrayList<>();
        challenges.add(new Challenge("Gain 30,000 XP","Stage (Half-Wolf)",url + "/images/challenge/dire-half-wolf.png"));
        challenges.add(new Challenge("Gain 70,000 XP", "Stage (Brown Werewolf)",url + "/images/challenge/dire-brown-werewolf.png"));
        challenges.add(new Challenge("Gain 120,000 XP", "Stage (Grey Werewolf)",url + "/images/challenge/dire-grey-werewolf.png"));
        challenges.add(new Challenge("Gain 180,000 XP", "Stage (White Werewolf)",url + "/images/challenge/dire-white-werewolf.png"));
        challenges.add(new Challenge("Gain 250,000 XP", "Stage (Black Werewolf)",url + "/images/challenge/dire-black-werewolf.png"));
        challenges.add(new Challenge("Complete 20 Weekly Challenges", "Color (BLUE)",url + "/images/challenge/dire-color-blue.png"));
        challenges.add(new Challenge("Complete 40 Weekly Challenges", "Color (YELLOW)",url + "/images/challenge/dire-color-yellow.png"));
        challenges.add(new Challenge("Complete 60 Weekly Challenges", "Color (BROWN)",url + "/images/challenge/dire-color-brown.png"));
        challengeSet.setChallenges(challenges);
        saveChallengeSet(challengeSet);

        //Tomatohead Challenges
        challengeSet = new ChallengeSet();
        challengeSet.setChallengeSetName("Tomatohead Challenges");
        challengeSet.setChallengeSetObjective("Complete all 3 challenges to earn reward item");
        challengeSet.setChallengeSetReward("Tomatohead Crown");
        challengeSet.setChallengeSetRewardImage(url + "/tomatohead.png");
        challenges = new ArrayList<>();
        challenges.add(new Challenge("Play 25 matches", null, null));
        challenges.add(new Challenge("Deal 5000 damage to opponents", null, null));
        challenges.add(new Challenge("Gain 20,000 XP", null, null));
        challengeSet.setChallenges(challenges);
        saveChallengeSet(challengeSet);

        //14 Days of Fortnite Challenges
        challengeSet = new ChallengeSet();
        challengeSet.setChallengeSetName("14 Days of Fortnite Challenges");
        challengeSet.setChallengeSetObjective("Complete all 14 challenges to earn reward item");
        challengeSet.setChallengeSetReward("Banner");
        challengeSet.setChallengeSetRewardImage("null");
        challenges = new ArrayList<>();
        challenges.add(new Challenge("Start or join a creative server", "GG Ornament", url + "/images/emoticon/gg-ornament"));
        challengeSet.setChallenges(challenges);
        saveChallengeSet(challengeSet);

        //Solo Showdown
        challengeSet = new ChallengeSet();
        challengeSet.setChallengeSetName("Solo Showdown");
        challengeSet.setChallengeSetObjective("Play 50 Solo Showdown LTM matches");
        challengeSet.setChallengeSetReward("Solo Showdown Spray");
        challengeSet.setChallengeSetRewardImage(url + "/images/challenge/images/spray/solo-showdown.png");
        challenges = new ArrayList<>();
        challengeSet.setChallenges(challenges);
        saveChallengeSet(challengeSet);

        //Victory Founders
        challengeSet = new ChallengeSet();
        challengeSet.setChallengeSetName("Victory Founders");
        challengeSet.setChallengeSetObjective("Battle Royal Victory with Founder's Pack");
        challengeSet.setChallengeSetReward("Founders Umbrella");
        challengeSet.setChallengeSetRewardImage(url + "/images/glider/founders-umbrella.png");
        challenges = new ArrayList<>();
        challengeSet.setChallenges(challenges);
        saveChallengeSet(challengeSet);

        //Victory Any Season
        challengeSet = new ChallengeSet();
        challengeSet.setChallengeSetName("Victory Any Season");
        challengeSet.setChallengeSetObjective("Battle Royal Victory Any Season");
        challengeSet.setChallengeSetReward("The Umbrella");
        challengeSet.setChallengeSetRewardImage(url + "/images/glider/the-umbrella.png");
        challenges = new ArrayList<>();
        challengeSet.setChallenges(challenges);
        saveChallengeSet(challengeSet);

        //Victory Season 2
        challengeSet = new ChallengeSet();
        challengeSet.setChallengeSetName("Victory Season 2");
        challengeSet.setChallengeSetObjective("Battle Royal Victory Season 2");
        challengeSet.setChallengeSetReward("Snowflake");
        challengeSet.setChallengeSetRewardImage(url + "/images/glider/snowflake.png");
        challenges = new ArrayList<>();
        challengeSet.setChallenges(challenges);
        saveChallengeSet(challengeSet);

        //Victory Season 3
        challengeSet = new ChallengeSet();
        challengeSet.setChallengeSetName("Victory Season 3");
        challengeSet.setChallengeSetObjective("Battle Royal Victory Season 3");
        challengeSet.setChallengeSetReward("Paper Parasol");
        challengeSet.setChallengeSetRewardImage(url + "/images/glider/paper-parasol.png");
        challenges = new ArrayList<>();
        challengeSet.setChallenges(challenges);
        saveChallengeSet(challengeSet);

        //Victory Season 4
        challengeSet = new ChallengeSet();
        challengeSet.setChallengeSetName("Victory Season 4");
        challengeSet.setChallengeSetObjective("Battle Royal Victory Season 4");
        challengeSet.setChallengeSetReward("Wet Paint");
        challengeSet.setChallengeSetRewardImage(url + "/images/glider/wet-paint.png");
        challenges = new ArrayList<>();
        challengeSet.setChallenges(challenges);
        saveChallengeSet(challengeSet);

        //Victory Season 5
        challengeSet = new ChallengeSet();
        challengeSet.setChallengeSetName("Victory Season 5");
        challengeSet.setChallengeSetObjective("Battle Royal Victory Season 5");
        challengeSet.setChallengeSetReward("Beach Umbrella");
        challengeSet.setChallengeSetRewardImage(url + "/images/glider/beach-umbrella.png");
        challenges = new ArrayList<>();
        challengeSet.setChallenges(challenges);
        saveChallengeSet(challengeSet);

        //Victory Season 7
        challengeSet = new ChallengeSet();
        challengeSet.setChallengeSetName("Victory Season 7");
        challengeSet.setChallengeSetObjective("Battle Royal Victory Season 7");
        challengeSet.setChallengeSetReward("Snowfall");
        challengeSet.setChallengeSetRewardImage(url + "/images/glider/snowfall.png");
        challenges = new ArrayList<>();
        challengeSet.setChallenges(challenges);
        saveChallengeSet(challengeSet);

        //Tier 100 Season 3 Challenges
        challengeSet = new ChallengeSet();
        challengeSet.setChallengeSetName("Tier 100 Challenges");
        challengeSet.setChallengeSetObjective("Complete any 5 challenges to earn reward item");
        challengeSet.setChallengeSetReward("High Octane");
        challengeSet.setChallengeSetRewardImage(url + "/images/harvestingtool/permafrost.png");
        challenges = new ArrayList<>();
        challenges.add(new Challenge("Search 7 chest in a single match", "1,000", url + "/images/icons/xp.png"));
        challenges.add(new Challenge("Play 10 matches with at least one elimination", "1,000", url + "/images/icons/xp.png"));
        challenges.add(new Challenge("Deal 1,000 damage to opponents in a single match", "1,000", url + "/images/icons/xp.png"));
        challenges.add(new Challenge("Single Pickaxe Elimination", "1,000", url + "/images/icons/xp.png"));
        challenges.add(new Challenge("5 Eliminations in a single match", "1,000", url + "/images/icons/xp.png"));
        challenges.add(new Challenge("Place Top 10 in 5 Solo matches", "1,000", url + "/images/icons/xp.png"));
        challenges.add(new Challenge("Place Top 3 in 3 Squads matches", "1,000", url + "/images/icons/xp.png"));
        challengeSet.setChallenges(challenges);
        saveChallengeSet(challengeSet);

        //Road Trip Challenges
        challengeSet = new ChallengeSet();
        challengeSet.setChallengeSetName("Road Trip Challenges");
        challengeSet.setChallengeSetObjective("Complete any 7 challenges to earn reward item");
        challengeSet.setChallengeSetReward("Enforcer");
        challengeSet.setChallengeSetRewardImage(url + "/images/outfit/enforcer.png");
        challenges = new ArrayList<>();
        challenges.add(new Challenge("Complete all challenges from any from any week", "Road Trip", url + "/images/loadingscreen/road-trip.png"));
        challenges.add(new Challenge("Complete all challenges from any 2 different weeks", "Fairway Fun", url + "/images/loadingscreen/fairway-fun.png"));
        challenges.add(new Challenge("Complete all challenges from any 3 different weeks", "Track Record", url + "/images/loadingscreen/track-record.png"));
        challenges.add(new Challenge("Complete all challenges from any 4 different weeks", "Poolside Paradise", url + "/images/loadingscreen/poolside-paradise.png"));
        challenges.add(new Challenge("Complete all challenges from any 5 different weeks", "Blast From The Past", url + "/images/loadingscreen/blast-from-the-past.png"));
        challenges.add(new Challenge("Complete all challenges from any 6 different weeks", "Opening Night", url + "/images/loadingscreen/opening-night.png"));
        challenges.add(new Challenge("Complete all challenges from any 7 different weeks", "Signing Back In", url + "/images/loadingscreen/signing-back-in.png"));
        challengeSet.setChallenges(challenges);
        saveChallengeSet(challengeSet);

        //Refer Friends
        challengeSet = new ChallengeSet();
        challengeSet.setChallengeSetName("Refer Friends Challenges");
        challengeSet.setChallengeSetObjective("Refer 3 friends for Wegame");
        challengeSet.setChallengeSetReward("Embers");
        challengeSet.setChallengeSetRewardImage(url + "/images/contrail/embers.png");
        challenges = new ArrayList<>();
        challengeSet.setChallenges(challenges);
        saveChallengeSet(challengeSet);

        //Fortnite 1st Birthday
        challengeSet = new ChallengeSet();
        challengeSet.setChallengeSetName("Fortnite 1st Birthday Challenges");
        challengeSet.setChallengeSetObjective("Complete all 3 challenges to earn reward item");
        challengeSet.setChallengeSetReward("Birthday Cake");
        challengeSet.setChallengeSetRewardImage(url + "/images/backbling/birthday-cake.png");
        challenges = new ArrayList<>();
        challenges.add(new Challenge("Play 14 matches", "5,000", url + "/images/icons/xp.png"));
        challenges.add(new Challenge("Deal 1,000 damage to opponents", "Fortnite Birthday", url + "/images/emoticon/fortnite-birthday.png"));
        challenges.add(new Challenge("Dance in front of different Birthday Cakes", "Happy Birthday!", url + "/images/spray/happy-birthday.png"));
        challengeSet.setChallenges(challenges);
        saveChallengeSet(challengeSet);

        //Enable 2FA
        challengeSet = new ChallengeSet();
        challengeSet.setChallengeSetName("Enable 2FA");
        challengeSet.setChallengeSetObjective("Enable 2 Factor Authentication on Fortnite account");
        challengeSet.setChallengeSetReward("Boogie Down");
        challengeSet.setChallengeSetRewardImage(url + "/images/dance/boogie-down.png");
        challenges = new ArrayList<>();
        challengeSet.setChallenges(challenges);
        saveChallengeSet(challengeSet);

        //Invite Friends
        challengeSet = new ChallengeSet();
        challengeSet.setChallengeSetName("Invite Friends");
        challengeSet.setChallengeSetObjective("Invite friends to Fortnite with 10 hours of playtime");
        challengeSet.setChallengeSetReward("Penguin");
        challengeSet.setChallengeSetRewardImage(url + "/images/backbling/penguin.png");
        challenges = new ArrayList<>();
        challengeSet.setChallenges(challenges);
        saveChallengeSet(challengeSet);

        //Hunting Party Challenges
        challengeSet = new ChallengeSet();
        challengeSet.setChallengeSetName("Hunting Party Challenges");
        challengeSet.setChallengeSetObjective("Complete any 7 challenges to earn reward item");
        challengeSet.setChallengeSetReward("A.I.M.");
        challengeSet.setChallengeSetRewardImage(url + "/images/outfit/aim.png");
        challenges = new ArrayList<>();
        challenges.add(new Challenge("Complete all challenges from any week", "Down On The Ranch", url + "/images/loadingscreen/down-on-the-ranch.png"));
        challenges.add(new Challenge("Complete all challenges from any 2 different weeks", "Unknown", url + "/images/loadingscreen/mystery-2.png"));
        challenges.add(new Challenge("Complete all challenges from any 3 different weeks", "Unknown", url + "/images/loadingscreen/mystery-3.png"));
        challenges.add(new Challenge("Complete all challenges from any 4 different weeks", "Unknown", url + "/images/loadingscreen/mystery-4.png"));
        challenges.add(new Challenge("Complete all challenges from any 5 different weeks", "Unknown", url + "/images/loadingscreen/mystery-5.png"));
        challenges.add(new Challenge("Complete all challenges from any 6 different weeks", "Unknown", url + "/images/loadingscreen/mystery-6.png"));
        challenges.add(new Challenge("Complete all challenges from any 7 different weeks", "Unknown", url + "/images/loadingscreen/mystery-7.png"));
        challenges.add(new Challenge("Complete all challenges from any 8 different weeks", "Unknown", url + "/images/loadingscreen/mystery-8.png"));
        challenges.add(new Challenge("Complete all challenges from any 9 different weeks", "Unknown", url + "/images/loadingscreen/mystery-9.png"));
        challenges.add(new Challenge("Complete all challenges from any 10 different weeks", "Unknown", url + "/images/loadingscreen/mystery-10.png"));
        challengeSet.setChallenges(challenges);
        saveChallengeSet(challengeSet);

        //Lil' Kev Challenges
        challengeSet = new ChallengeSet();
        challengeSet.setChallengeSetName("Lil' Kev Challenges");
        challengeSet.setChallengeSetObjective("Complete all 3 challenges to earn the reward item");
        challengeSet.setChallengeSetReward("Lil' Kev");
        challengeSet.setChallengeSetRewardImage(url + "/images/backbling/lil-kev.png");
        challenges = new ArrayList<>();
        challenges.add(new Challenge("Play 15 matches", "500 XP", url + "/images/icons/xp.png"));
        challenges.add(new Challenge("Gain 5000 XP", "500 XP", url + "/images/icons/xp.png"));
        challenges.add(new Challenge("Outlive 500 Opponents", "500 XP", url + "/images/icons/xp.png"));
        challengeSet.setChallenges(challenges);
        saveChallengeSet(challengeSet);

        //Skull Trooper Challenges
        challengeSet = new ChallengeSet();
        challengeSet.setChallengeSetName("Skull Trooper Challenges");
        challengeSet.setChallengeSetObjective("Complete all 5 challenges to earn the reward item");
        challengeSet.setChallengeSetReward("Ghost Portal");
        challengeSet.setChallengeSetRewardImage(url + "/images/backbling/ghost-portal.png");
        challenges = new ArrayList<>();
        challenges.add(new Challenge("Play 7 Daily Challenges", "1,000 XP", url + "/images/icons/xp.png"));
        challenges.add(new Challenge("Play 50 Matches", "1,000 XP", url + "/images/icons/xp.png"));
        challenges.add(new Challenge("Play 14 matches with at least one elimination", "1,000 XP", url + "/images/icons/xp.png"));
        challenges.add(new Challenge("Search 10 Chests in a single match", "5", url + "/images/icons/battle-star.png"));
        challenges.add(new Challenge("Deal 1,000 to opponents in a single match", "1,000 XP", url + "/images/icons/xp.png"));
        challengeSet.setChallenges(challenges);
        saveChallengeSet(challengeSet);


        //High Stakes Challenges
        challengeSet = new ChallengeSet();
        challengeSet.setChallengeSetName("High Stakes Challenges");
        challengeSet.setChallengeSetObjective("Complete all 3 challenges to earn the reward item");
        challengeSet.setChallengeSetReward("Crowbar");
        challengeSet.setChallengeSetRewardImage(url + "/images/harvestingtool/crowbar.png");
        challenges = new ArrayList<>();
        challenges.add(new Challenge("Play 10 matches of The Getaway.", "5,000 XP", url + "/images/icons/xp.png"));
        challenges.add(new Challenge("Deal 500 damage to Jewel carrying opponents", "Suited Up", url + "/images/spray/suited-up.png"));
        challenges.add(new Challenge("Pick up 5 Jewels in different matches of The Getaway", "Cash Flow", url + "/images/contrail/cash-flow.png"));
        challengeSet.setChallenges(challenges);
        saveChallengeSet(challengeSet);

        //Fortnitemares Challenges Part 1
        challengeSet = new ChallengeSet();
        challengeSet.setChallengeSetName("Fortnitemares Challenges Part 1");
        challengeSet.setChallengeSetObjective("Complete all 4 challenges to earn the reward item");
        challengeSet.setChallengeSetReward("Fiery");
        challengeSet.setChallengeSetRewardImage(url + "/images/emoticon/fiery.png");
        challenges = new ArrayList<>();
        challenges.add(new Challenge("Destroy 200 Cube Monsters", "500 XP", url + "/images/icons/xp.png"));
        challenges.add(new Challenge("Deal 5,000 damage with Assault Rifles or Pistols to Cube Monsters", "500 XP", url + "/images/icons/xp.png"));
        challenges.add(new Challenge("Visit 7 Corrupted Areas in Different Matches", "500 XP", url + "/images/icons/xp.png"));
        challenges.add(new Challenge("Dance in front of 5 different Gargoyles", "500 XP", url + "/images/icons/xp.png"));
        challengeSet.setChallenges(challenges);
        saveChallengeSet(challengeSet);

        //Fortnitemares Challenges Part 2
        challengeSet = new ChallengeSet();
        challengeSet.setChallengeSetName("Fortnitemares Challenges Part 2");
        challengeSet.setChallengeSetObjective("Complete all 4 challenges to earn the reward item");
        challengeSet.setChallengeSetReward("Deadfire");
        challengeSet.setChallengeSetRewardImage(url + "/images/spray/deadfire.png");
        challenges = new ArrayList<>();
        challenges.add(new Challenge("Destroy 150 Cube Fiends", "500 XP", url + "/images/icons/xp.png"));
        challenges.add(new Challenge("Deal 5,000 damage with Shotguns or SMGs to Cube Monsters", "500 XP", url + "/images/icons/xp.png"));
        challenges.add(new Challenge("Eliminate 3 opponents at Corrupted Areas", "500 XP", url + "/images/icons/xp.png"));
        challenges.add(new Challenge("Destroy 7 Ghost Decorations in different Named Locations", "500 XP", url + "/images/icons/xp.png"));
        challengeSet.setChallenges(challenges);
        saveChallengeSet(challengeSet);

        //Fortnitemares Challenges Part 3
        challengeSet = new ChallengeSet();
        challengeSet.setChallengeSetName("Fortnitemares Challenges Part 3");
        challengeSet.setChallengeSetObjective("Complete all 4 challenges to earn the reward item");
        challengeSet.setChallengeSetReward("Virulent Flames");
        challengeSet.setChallengeSetRewardImage(url + "/images/contrail/virulent-flames.png");
        challenges = new ArrayList<>();
        challenges.add(new Challenge("Destroy 25 Cube Brutes", "500 XP", url + "/images/icons/xp.png"));
        challenges.add(new Challenge("Deal 2,000 damage with Explosive Weapons to Cube Monsters", "500 XP", url + "/images/icons/xp.png"));
        challenges.add(new Challenge("Search 7 Chests in Corrupted Areas", "500 XP", url + "/images/icons/xp.png"));
        challenges.add(new Challenge("Visit Wailing Woods, Visit Fatal Fields, Visit Haunted Hills", "500 XP", url + "/images/icons/xp.png"));
        challengeSet.setChallenges(challenges);
        saveChallengeSet(challengeSet);

        //Fortnitemares Challenges Part 4
        challengeSet = new ChallengeSet();
        challengeSet.setChallengeSetName("Fortnitemares Challenges Part 4");
        challengeSet.setChallengeSetObjective("Complete all 6 challenges to earn the reward item");
        challengeSet.setChallengeSetReward("Dark Engine");
        challengeSet.setChallengeSetRewardImage(url + "/images/glider/dark-engine.png");
        challenges = new ArrayList<>();
        challenges.add(new Challenge("Destroy 10 Elite Cube Monsters", "500 XP", url + "/images/icons/xp.png"));
        challenges.add(new Challenge("Damage 2,500 Cube Fragments", "500 XP", url + "/images/icons/xp.png"));
        challenges.add(new Challenge("Deal 1,000 damage to Cube Monsters in a single match", "500 XP", url + "/images/icons/xp.png"));
        challenges.add(new Challenge("Visit 4 different Corrupted Areas in a single match", "500 XP", url + "/images/icons/xp.png"));
        challenges.add(new Challenge("Destroy 3 Cube Fragments", "500 XP", url + "/images/icons/xp.png"));
        challenges.add(new Challenge("Complete 14 Fortnitemares Challenges", "500 XP", url + "/images/icons/xp.png"));
        challengeSet.setChallenges(challenges);
        saveChallengeSet(challengeSet);

        logger.info("Finished Loading Challenge Set Data");
    }

    private void saveChallengeSet(ChallengeSet set){
        //if duplicate, update existing challengeset
        //else save new styleset
        ChallengeSet duplicate = getDuplicate(set);
        if(duplicate == null){
            challengeSetServiceImpl.save(set);
        }else{
            String tempId = duplicate.get_id();
            duplicate.setChallenges(set.getChallenges());
            duplicate.set_id(tempId);
            challengeSetServiceImpl.save(duplicate);
        }
    }
    private ChallengeSet getDuplicate(ChallengeSet set){
        for(ChallengeSet s: setsInDB){
            if(s.getChallengeSetName().equals(set.getChallengeSetName())){
                return s;
            }
        }
        return null;
    }
}
