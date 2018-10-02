package com.africanjesus.fortnitepal.repositories.dataloaders;

import com.africanjesus.fortnitepal.model.Challenge;
import com.africanjesus.fortnitepal.model.ChallengeSet;
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

    private ChallengeSetServiceImpl challengeSetServiceImpl;

    @Autowired
    public ChallengeSetDataLoader(ChallengeSetServiceImpl challengeSetServiceImpl) {
        this.challengeSetServiceImpl = challengeSetServiceImpl;
    }

    @Override
    public void run(String... args) throws Exception {
        logger.info("Started Loading Challenge Set Data");
        ChallengeSet challengeSet;
        List<Challenge> challenges;

        //Carbide Challenges
        challengeSet = new ChallengeSet();
        challengeSet.setChallengeSetName("Carbide Challenges");
        challengeSet.setChallengeSetObjective("Complete any 3 challenges to earn reward item");
        challengeSet.setChallengeSetReward("Positron");
        challengeSet.setChallengeSetRewardImage("http://localhost:8080/images/harvestingtool/positron.png");
        challenges = new ArrayList<>();
        challenges.add(new Challenge("Reach Season Level 10", "Carbide Chest", "http://localhost:8080/images/challenge/carbide-chest.png"));
        challenges.add(new Challenge("Reach Season Level 20", "Carbide Legs", "http://localhost:8080/images/challenge/carbide-legs.png"));
        challenges.add(new Challenge("Reach Season Level 30", "Carbide Arms", "http://localhost:8080/images/challenge/carbide-arms.png"));
        challenges.add(new Challenge("Reach Season Level 40", "Carbide Head", "http://localhost:8080/images/challenge/carbide-head.png"));
        challenges.add(new Challenge("Reach Season Level 65", "Carbide Accents", "http://localhost:8080/images/challenge/carbide-chest-2.png"));
        challengeSet.setChallenges(challenges);
        challengeSetServiceImpl.save(challengeSet);

        //Drift Challenges
        challengeSet = new ChallengeSet();
        challengeSet.setChallengeSetName("Drift Challenges");
        challengeSet.setChallengeSetObjective("Complete any 4 challenges to earn reward item");
        challengeSet.setChallengeSetReward("Rift Edge");
        challengeSet.setChallengeSetRewardImage("http://localhost:8080/images/harvestingtool/rift-edge.png");
        challenges = new ArrayList<>();
        challenges.add(new Challenge("Gain 10,000 XP", "Stage 1", "http://localhost:8080/images/challenge/drift-stage-1.png"));
        challenges.add(new Challenge("Gain 25,000 XP", "Stage 2", "http://localhost:8080/images/challenge/drift-stage-2.png"));
        challenges.add(new Challenge("Gain 50,000 XP", "Stage 3", "http://localhost:8080/images/challenge/drift-stage-3.png"));
        challenges.add(new Challenge("Gain 100,000 XP", "Stage 4", "http://localhost:8080/images/challenge/drift-stage-4.png"));
        challenges.add(new Challenge("Gain 200,000 XP", "Stage 5", "http://localhost:8080/images/challenge/drift-stage-5.png"));
        challengeSet.setChallenges(challenges);
        challengeSetServiceImpl.save(challengeSet);

        //Omega Challenges
        challengeSet = new ChallengeSet();
        challengeSet.setChallengeSetName("Omega Challenges");
        challengeSet.setChallengeSetObjective("Complete any 3 challenges to earn reward item");
        challengeSet.setChallengeSetReward("Onslaught");
        challengeSet.setChallengeSetRewardImage("http://localhost:8080/images/harvestingtool/onslaught.png");
        challenges = new ArrayList<>();
        challenges.add(new Challenge("Reach Season Level 25", "Omega Chest", "http://localhost:8080/images/challenge/omega-chest.png"));
        challenges.add(new Challenge("Reach Season Level 35", "Omega Legs", "http://localhost:8080/images/challenge/omega-legs.png"));
        challenges.add(new Challenge("Reach Season Level 45", "Omega Arms", "http://localhost:8080/images/challenge/omega-arms.png"));
        challenges.add(new Challenge("Reach Season Level 55", "Omega Mask", "http://localhost:8080/images/challenge/omega-mask.png"));
        challenges.add(new Challenge("Reach Season Level 80", "Omega Accent", "http://localhost:8080/images/challenge/omega-accent.png"));
        challengeSet.setChallenges(challenges);
        challengeSetServiceImpl.save(challengeSet);

        //Ragnarok Challenges
        challengeSet = new ChallengeSet();
        challengeSet.setChallengeSetName("Ragnarok Challenges");
        challengeSet.setChallengeSetObjective("Complete any 4 challenges to earn reward item");
        challengeSet.setChallengeSetReward("Permafrost");
        challengeSet.setChallengeSetRewardImage("http://localhost:8080/images/harvestingtool/permafrost.png");
        challenges = new ArrayList<>();
        challenges.add(new Challenge("Gain 35,000 XP", "Stage 1", "http://localhost:8080/images/challenge/ragnarok-stage-1.png"));
        challenges.add(new Challenge("Gain 75,000 XP", "Stage 2", "http://localhost:8080/images/challenge/ragnarok-stage-2.png"));
        challenges.add(new Challenge("Gain 120,000 XP", "Stage 3", "http://localhost:8080/images/challenge/ragnarok-stage-3.png"));
        challenges.add(new Challenge("Gain 250,000 XP", "Stage 4", "http://localhost:8080/images/challenge/ragnarok-stage-4.png"));
        challenges.add(new Challenge("Gain 500,000 XP", "Stage 5", "http://localhost:8080/images/challenge/ragnarok-stage-5.png"));
        challengeSet.setChallenges(challenges);
        challengeSetServiceImpl.save(challengeSet);


        //Calamity Challenges
        challengeSet = new ChallengeSet();
        challengeSet.setChallengeSetName("Calamity Challenges");
        challengeSet.setChallengeSetObjective("Complete any 5 challenges to earn reward item");
        challengeSet.setChallengeSetReward("Reckoning");
        challengeSet.setChallengeSetRewardImage("http://localhost:8080/images/harvestingtool/reckoning.png");
        challenges = new ArrayList<>();
        challenges.add(new Challenge("Gain 20,000 XP", "Stage 1", "http://localhost:8080/images/challenge/calamity-stage-1.png"));
        challenges.add(new Challenge("Gain 50,000 XP", "Stage 2", "http://localhost:8080/images/challenge/calamity-stage-2.png"));
        challenges.add(new Challenge("Gain 90,000 XP", "Stage 3", "http://localhost:8080/images/challenge/calamity-stage-3.png"));
        challenges.add(new Challenge("Gain 140,000 XP", "Stage 4", "http://localhost:8080/images/challenge/calamity-stage-4.png"));
        challenges.add(new Challenge("Gain 200,000 XP", "Stage 5", "http://localhost:8080/images/challenge/calamity-stage-5.png"));
        challenges.add(new Challenge("Complete 10 Weekly Challenges", "Color (TEAL)","http://localhost:8080/images/challenge/calamity-color-teal.png"));
        challenges.add(new Challenge("Complete 25 Weekly Challenges", "Color (PURPLE)","http://localhost:8080/images/challenge/calamity-color-purple.png"));
        challenges.add(new Challenge("Complete 50 Weekly Challenges", "Color (BLACK)","http://localhost:8080/images/challenge/calamity-color-black.png"));
        challengeSet.setChallenges(challenges);
        challengeSetServiceImpl.save(challengeSet);

        //Dire Challenges
        challengeSet = new ChallengeSet();
        challengeSet.setChallengeSetName("Dire Challenges");
        challengeSet.setChallengeSetObjective("Complete any 5 challenges to earn reward item");
        challengeSet.setChallengeSetReward("Wolfpack");
        challengeSet.setChallengeSetRewardImage("http://localhost:8080/images/backbling/wolfpack.png");
        challenges = new ArrayList<>();
        challenges.add(new Challenge("Gain 30,000 XP","Stage (Half-Wolf)","http://localhost:8080/images/challenge/dire-half-wolf.png"));
        challenges.add(new Challenge("Gain 70,000 XP", "Stage (Brown Werewolf)","http://localhost:8080/images/challenge/dire-brown-werewolf.png"));
        challenges.add(new Challenge("Gain 120,000 XP", "Stage (Grey Werewolf)","http://localhost:8080/images/challenge/dire-grey-werewolf.png"));
        challenges.add(new Challenge("Gain 180,000 XP", "Stage (White Werewolf)","http://localhost:8080/images/challenge/dire-white-werewolf.png"));
        challenges.add(new Challenge("Gain 250,000 XP", "Stage (Black Werewolf)","http://localhost:8080/images/challenge/dire-black-werewolf.png"));
        challenges.add(new Challenge("Complete 20 Weekly Challenges", "Color (BLUE)","http://localhost:8080/images/challenge/dire-color-blue.png"));
        challenges.add(new Challenge("Complete 40 Weekly Challenges", "Color (YELLOW)","http://localhost:8080/images/challenge/dire-color-yellow.png"));
        challenges.add(new Challenge("Complete 60 Weekly Challenges", "Color (BROWN)","http://localhost:8080/images/challenge/dire-color-brown.png"));
        challengeSet.setChallenges(challenges);
        challengeSetServiceImpl.save(challengeSet);

        //Tomatohead Challenges
        challengeSet = new ChallengeSet();
        challengeSet.setChallengeSetName("Tomatohead Challenges");
        challengeSet.setChallengeSetObjective("Complete all 3 challenges to earn reward item");
        challengeSet.setChallengeSetReward("Tomatohead Crown");
        challengeSet.setChallengeSetRewardImage("http://localhost:8080/images/challenge/tomatohead.png");
        challenges = new ArrayList<>();
        challenges.add(new Challenge("Play 25 matches", null, null));
        challenges.add(new Challenge("Deal 5000 damage to opponents", null, null));
        challenges.add(new Challenge("Gain 20,000 XP", null, null));
        challengeSet.setChallenges(challenges);
        challengeSetServiceImpl.save(challengeSet);

        //Solo Showdown
        challengeSet = new ChallengeSet();
        challengeSet.setChallengeSetName("Solo Showdown");
        challengeSet.setChallengeSetObjective("Play 50 Solo Showdown LTM matches");
        challengeSet.setChallengeSetReward("Solo Showdown Spray");
        challengeSet.setChallengeSetRewardImage("http://localhost:8080/images/spray/solo-showdown.png");
        challenges = new ArrayList<>();
        challengeSet.setChallenges(challenges);
        challengeSetServiceImpl.save(challengeSet);

        //Victory Founders
        challengeSet = new ChallengeSet();
        challengeSet.setChallengeSetName("Victory Founders");
        challengeSet.setChallengeSetObjective("Battle Royal Victory with Founder's Pack");
        challengeSet.setChallengeSetReward("Founders Umbrella");
        challengeSet.setChallengeSetRewardImage("http://localhost:8080/images/glider/founders-umbrella.png");
        challenges = new ArrayList<>();
        challengeSet.setChallenges(challenges);
        challengeSetServiceImpl.save(challengeSet);

        //Victory Any Season
        challengeSet = new ChallengeSet();
        challengeSet.setChallengeSetName("Victory Any Season");
        challengeSet.setChallengeSetObjective("Battle Royal Victory Any Season");
        challengeSet.setChallengeSetReward("The Umbrella");
        challengeSet.setChallengeSetRewardImage("http://localhost:8080/images/glider/the-umbrella.png");
        challenges = new ArrayList<>();
        challengeSet.setChallenges(challenges);
        challengeSetServiceImpl.save(challengeSet);

        //Victory Season 2
        challengeSet = new ChallengeSet();
        challengeSet.setChallengeSetName("Victory Season 2");
        challengeSet.setChallengeSetObjective("Battle Royal Victory Season 2");
        challengeSet.setChallengeSetReward("Snowflake");
        challengeSet.setChallengeSetRewardImage("http://localhost:8080/images/glider/snowflake.png");
        challenges = new ArrayList<>();
        challengeSet.setChallenges(challenges);
        challengeSetServiceImpl.save(challengeSet);

        //Victory Season 3
        challengeSet = new ChallengeSet();
        challengeSet.setChallengeSetName("Victory Season 3");
        challengeSet.setChallengeSetObjective("Battle Royal Victory Season 3");
        challengeSet.setChallengeSetReward("Paper Parasol");
        challengeSet.setChallengeSetRewardImage("http://localhost:8080/images/glider/paper-parasol.png");
        challenges = new ArrayList<>();
        challengeSet.setChallenges(challenges);
        challengeSetServiceImpl.save(challengeSet);

        //Victory Season 4
        challengeSet = new ChallengeSet();
        challengeSet.setChallengeSetName("Victory Season 4");
        challengeSet.setChallengeSetObjective("Battle Royal Victory Season 4");
        challengeSet.setChallengeSetReward("Wet Paint");
        challengeSet.setChallengeSetRewardImage("http://localhost:8080/images/glider/wet-paint.png");
        challenges = new ArrayList<>();
        challengeSet.setChallenges(challenges);
        challengeSetServiceImpl.save(challengeSet);

        //Victory Season 5
        challengeSet = new ChallengeSet();
        challengeSet.setChallengeSetName("Victory Season 5");
        challengeSet.setChallengeSetObjective("Battle Royal Victory Season 5");
        challengeSet.setChallengeSetReward("Beach Umbrella");
        challengeSet.setChallengeSetRewardImage("http://localhost:8080/images/glider/beach-umbrella.png");
        challenges = new ArrayList<>();
        challengeSet.setChallenges(challenges);
        challengeSetServiceImpl.save(challengeSet);

        //Tier 100 Season 3 Challenges
        challengeSet = new ChallengeSet();
        challengeSet.setChallengeSetName("Tier 100 Challenges");
        challengeSet.setChallengeSetObjective("Complete any 5 challenges to earn reward item");
        challengeSet.setChallengeSetReward("High Octane");
        challengeSet.setChallengeSetRewardImage("http://localhost:8080/images/harvestingtool/permafrost.png");
        challenges = new ArrayList<>();
        challenges.add(new Challenge("Search 7 chest in a single match", "1,000", "http://localhost:8080/images/icons/xp.png"));
        challenges.add(new Challenge("Play 10 matches with at least one elimination", "1,000", "http://localhost:8080/images/icons/xp.png"));
        challenges.add(new Challenge("Deal 1,000 damage to opponents in a single match", "1,000", "http://localhost:8080/images/icons/xp.png"));
        challenges.add(new Challenge("Single Pickaxe Elimination", "1,000", "http://localhost:8080/images/icons/xp.png"));
        challenges.add(new Challenge("5 Eliminations in a single match", "1,000", "http://localhost:8080/images/icons/xp.png"));
        challenges.add(new Challenge("Place Top 10 in 5 Solo matches", "1,000", "http://localhost:8080/images/icons/xp.png"));
        challenges.add(new Challenge("Place Top 3 in 3 Squads matches", "1,000", "http://localhost:8080/images/icons/xp.png"));
        challengeSet.setChallenges(challenges);
        challengeSetServiceImpl.save(challengeSet);

        //Road Trip Challenges
        challengeSet = new ChallengeSet();
        challengeSet.setChallengeSetName("Road Trip Challenges");
        challengeSet.setChallengeSetObjective("Complete any 7 challenges to earn reward item");
        challengeSet.setChallengeSetReward("Enforcer");
        challengeSet.setChallengeSetRewardImage("http://localhost:8080/images/outfit/enforcer.png");
        challenges = new ArrayList<>();
        challenges.add(new Challenge("Complete all challenges from any from any week", "Road Trip", "http://localhost:8080/images/loadingscreen/road-trip.png"));
        challenges.add(new Challenge("Complete all challenges from any 2 different weeks", "Fairway Fun", "http://localhost:8080/images/loadingscreen/fairway-fun.png"));
        challenges.add(new Challenge("Complete all challenges from any 3 different weeks", "Track Record", "http://localhost:8080/images/loadingscreen/track-record.png"));
        challenges.add(new Challenge("Complete all challenges from any 4 different weeks", "Poolside Paradise", "http://localhost:8080/images/loadingscreen/poolside-paradise.png"));
        challenges.add(new Challenge("Complete all challenges from any 5 different weeks", "Blast From The Past", "http://localhost:8080/images/loadingscreen/blast-from-the-past.png"));
        challenges.add(new Challenge("Complete all challenges from any 6 different weeks", "Opening Night", "http://localhost:8080/images/loadingscreen/opening-night.png"));
        challenges.add(new Challenge("Complete all challenges from any 7 different weeks", "Signing Back In", "http://localhost:8080/images/loadingscreen/signing-back-in.png"));
        challengeSet.setChallenges(challenges);
        challengeSetServiceImpl.save(challengeSet);

        //Refer Friends
        challengeSet = new ChallengeSet();
        challengeSet.setChallengeSetName("Refer Friends Challenges");
        challengeSet.setChallengeSetObjective("Refer 3 friends for Wegame");
        challengeSet.setChallengeSetReward("Embers");
        challengeSet.setChallengeSetRewardImage("http://localhost:8080/images/contrail/embers.png");
        challenges = new ArrayList<>();
        challengeSet.setChallenges(challenges);
        challengeSetServiceImpl.save(challengeSet);

        //Fortnite 1st Birthday
        challengeSet = new ChallengeSet();
        challengeSet.setChallengeSetName("Fortnite 1st Birthday Challenges");
        challengeSet.setChallengeSetObjective("Complete all 3 challenges to earn reward item");
        challengeSet.setChallengeSetReward("Birthday Cake");
        challengeSet.setChallengeSetRewardImage("http://localhost:8080/images/backbling/birthday-cake.png");
        challenges = new ArrayList<>();
        challenges.add(new Challenge("Play 14 matches", "5,000", "http://localhost:8080/images/icons/xp.png"));
        challenges.add(new Challenge("Deal 1,000 damage to opponents", "Fortnite Birthday", "http://localhost:8080/images/emoticon/fortnite-birthday.png"));
        challenges.add(new Challenge("Dance in front of different Birthday Cakes", "Happy Birthday!", "http://localhost:8080/images/spray/happy-birthday.png"));
        challengeSet.setChallenges(challenges);
        challengeSetServiceImpl.save(challengeSet);

        //Enable 2FA
        challengeSet = new ChallengeSet();
        challengeSet.setChallengeSetName("Enable 2FA");
        challengeSet.setChallengeSetObjective("Enable 2 Factor Authentication on Fortnite account");
        challengeSet.setChallengeSetReward("Boogie Down");
        challengeSet.setChallengeSetRewardImage("http://localhost:8080/images/dance/boogie-down.png");
        challenges = new ArrayList<>();
        challengeSet.setChallenges(challenges);
        challengeSetServiceImpl.save(challengeSet);

        //Invite Friends
        challengeSet = new ChallengeSet();
        challengeSet.setChallengeSetName("Invite Friends");
        challengeSet.setChallengeSetObjective("Invite friends to Fortnite with 10 hours of playtime");
        challengeSet.setChallengeSetReward("Penguin");
        challengeSet.setChallengeSetRewardImage("http://localhost:8080/images/backbling/penguin.png");
        challenges = new ArrayList<>();
        challengeSet.setChallenges(challenges);
        challengeSetServiceImpl.save(challengeSet);

        logger.info("Finished Loading Challenge Set Data");
    }
}
