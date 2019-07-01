package com.company.main.java.game;

public class Stats {
    private int level = 1;
    private int pAtk, mAtk, pDdef, mDef, currentHP, currentMP, currentSP, maxHP, maxMP, maxSP, exp, movePoints;
    ;
    private String name;

    public int getLevel() {
        return level;
    }

    public int getCurrentHP() {
        return currentHP;
    }

    public int getCurrentMP() {
        return currentMP;
    }

    public int getCurrentSP() {
        return currentSP;
    }

    public int getpAtk() {
        return pAtk;
    }

    public int getmAtk() {
        return mAtk;
    }

    public int getpDdef() {
        return pDdef;
    }

    public int getmDef() {
        return mDef;
    }

    public int getMaxHP() {
        return maxHP;
    }

    public int getMaxMP() {
        return maxMP;
    }

    public int getMaxSP() {
        return maxSP;
    }

    public int getMovePoints() {
        return movePoints;
    }

    //setters


    public void setCurrentHP(int currentHP) {
        this.currentHP = currentHP;
    }

    public void setCurrentMP(int currentMP) {
        this.currentMP = currentMP;
    }

    public void setCurrentSP(int currentSP) {
        this.currentSP = currentSP;
    }

    public void setpAtk(int pAtk) {
        this.pAtk = pAtk;
    }

    public void setmAtk(int mAtk) {
        this.mAtk = mAtk;
    }

    public void setpDef(int pDef) {
        this.pDdef = pDef;
    }

    public void setmDef(int mDef) {
        this.mDef = mDef;
    }

    public void setLevel(int level) {
        this.level = level;
    }


    public void setMaxHp(int maxHP) {
        this.maxHP = maxHP;
    }

    public void setMaxMP(int maxMP) {
        this.maxMP = maxMP;
    }

    public void setMaxSP(int maxSP) {
        this.maxSP = maxSP;
    }

    public void setMovePoints(int movePoints) {
        this.movePoints = movePoints;
    }

    public Stats() {

    }

    public Stats initializeWarrior(int level) {
        setMaxHp(1000 + level * 150);
        setMaxMP(100 + level * 5);
        setMaxSP(100 + level * 10);
        setCurrentHP(maxHP);
        setCurrentMP(maxMP);
        setCurrentSP(maxSP);
        setpAtk(100 + level * 25);
        setmAtk(mAtk = 50 + level * 10);
        setpDef(pDdef = 15 + level * 2);
        setmDef(mDef = 5 + level * 2);
        this.level = level;
        return this;
    }

    public Stats initializeMage(int level) {
        setMaxHp(500 + level * 100);
        setMaxMP(100 + level * 25);
        setMaxSP(100 + level * 5);
        setCurrentHP(maxHP);
        setCurrentMP(maxMP);
        setCurrentSP(maxSP);
        setpAtk(100 + level * 25);
        setmAtk(mAtk = 100 + level * 30);
        setpDef(pDdef = 5 + level * 2);
        setmDef(mDef = 15 + level * 2);
        this.level = level;
        return this;
    }

}
