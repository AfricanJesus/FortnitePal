package com.africanjesus.fortnitepal.model.documents;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Document(collection = "Challenge Sets")
public class ChallengeSet {

    @Id
    private String _id;

    private String challengeSetName;

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

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ChallengeSet)) return false;
        ChallengeSet that = (ChallengeSet) o;
        return Objects.equals(challengeSetName, that.challengeSetName) &&
                Objects.equals(challenges, that.challenges) &&
                Objects.equals(challengeSetObjective, that.challengeSetObjective) &&
                Objects.equals(challengeSetReward, that.challengeSetReward) &&
                Objects.equals(challengeSetRewardImage, that.challengeSetRewardImage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(challengeSetName, challenges, challengeSetObjective, challengeSetReward, challengeSetRewardImage);
    }

    @Override
    public String toString() {
        return "ChallengeSet{" +
                ", challengeSetName='" + challengeSetName + '\'' +
                ", challenges=" + challenges +
                ", challengeSetObjective='" + challengeSetObjective + '\'' +
                ", challengeSetReward='" + challengeSetReward + '\'' +
                ", challengeSetRewardImage='" + challengeSetRewardImage + '\'' +
                '}';
    }
}
