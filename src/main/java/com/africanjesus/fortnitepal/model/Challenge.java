package com.africanjesus.fortnitepal.model;

import javax.persistence.Embeddable;

@Embeddable
public class Challenge {

    private String objective;

    private String reward;

    private String rewardImage;

    public Challenge() {
    }

    public Challenge(String objective, String reward, String rewardImage) {
        this.objective = objective;
        this.reward = reward;
        this.rewardImage = rewardImage;
    }

    public String getObjective() {
        return objective;
    }

    public void setObjective(String objective) {
        this.objective = objective;
    }

    public String getReward() {
        return reward;
    }

    public void setReward(String reward) {
        this.reward = reward;
    }

    public String getRewardImage() {
        return rewardImage;
    }

    public void setRewardImage(String rewardImage) {
        this.rewardImage = rewardImage;
    }

    @Override
    public String toString() {
        return "Challenge{" +
                "objective='" + objective + '\'' +
                ", reward='" + reward + '\'' +
                ", rewardImage='" + rewardImage + '\'' +
                '}';
    }
}
