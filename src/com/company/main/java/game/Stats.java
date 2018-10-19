package com.company.main.java.game;

public class Stats {
    private int level = 1;
    private int baseHitpoints = 1000;
    private int baseManapoints = 100;
    private int baseStaminapoints = 100;
    private int pAtk, mAtk, pDdef, mDef, currentHP, currentMP, currentSP;

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

    public Stats() {

    }

    public Stats initializeWarrior(int level) {
        setCurrentHP(currentHP = baseHitpoints + level * 150);
        setCurrentMP(baseManapoints + level * 5);
        setCurrentSP(baseStaminapoints + level * 10);
        setpAtk(100 + level * 25);
        setmAtk(mAtk = 50 + level * 10);
        setpDef(pDdef = 15 + level * 2);
        setmDef(mDef = 5 + level * 2);
        this.level = level;

        return this;
    }

}
