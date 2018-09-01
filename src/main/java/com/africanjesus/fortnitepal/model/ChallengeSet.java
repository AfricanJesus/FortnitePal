package com.africanjesus.fortnitepal.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "challenge_sets")
public class ChallengeSet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String challengeSetName;

    @ElementCollection
    @CollectionTable(name = "challenges", joinColumns = @JoinColumn(name = "challenge_sets_id"))
    private List<Challenge> challenges = new ArrayList<>();

    private String challengeSetObjective;

    private String challengeSetReward;

    private String challengeSetRewardImage;

    public ChallengeSet() {
    }

    public ChallengeSet(String challengeSetName, List<Challenge> challenges, String challengeSetObjective, String challengeSetReward, String challengeSetRewardImage) {
        this.challengeSetName = challengeSetName;
        this.challenges = challenges;
        this.challengeSetObjective = challengeSetObjective;
        this.challengeSetReward = challengeSetReward;
        this.challengeSetRewardImage = challengeSetRewardImage;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getChallengeSetName() {
        return challengeSetName;
    }

    public void setChallengeSetName(String challengeSetName) {
        this.challengeSetName = challengeSetName;
    }

    public List<Challenge> getChallenges() {
        return challenges;
    }

    public void setChallenges(List<Challenge> challenges) {
        this.challenges = challenges;
    }

    public String getChallengeSetObjective() {
        return challengeSetObjective;
    }

    public void setChallengeSetObjective(String challengeSetObjective) {
        this.challengeSetObjective = challengeSetObjective;
    }

    public String getChallengeSetReward() {
        return challengeSetReward;
    }

    public void setChallengeSetReward(String challengeSetReward) {
        this.challengeSetReward = challengeSetReward;
    }

    public String getChallengeSetRewardImage() {
        return challengeSetRewardImage;
    }

    public void setChallengeSetRewardImage(String challengeSetRewardImage) {
        this.challengeSetRewardImage = challengeSetRewardImage;
    }

    @Override
    public String toString() {
        return "ChallengeSet{" +
                "id=" + id +
                ", challengeSetName='" + challengeSetName + '\'' +
                ", challenges=" + challenges +
                ", challengeSetObjective='" + challengeSetObjective + '\'' +
                ", challengeSetReward='" + challengeSetReward + '\'' +
                ", challengeSetRewardImage='" + challengeSetRewardImage + '\'' +
                '}';
    }
}
