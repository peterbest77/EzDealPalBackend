package com.laioffer.ezdealpal.entity;

public enum EScore {
    One(1),
    Two(2),
    Three(3),
    Four(4),
    Five(5);
    private final int score;

    EScore(int score) {
        this.score = score;
    }

    public int getScore() {
        return score;
    }
}
