package com.company.main.java.game.skill;

import com.company.Units.Stats;

public class SkillEffect {
    int duration;
    int currentDuration;
    String attack = "pAtk";
    boolean isActive = false;

    //  stats:    pAtk, mAtk, pDdef, mDef, currentHP, currentMP, currentSP, maxHP, maxMP, maxSP, exp, movePoints;
    public SkillEffect skillApplied(Stats stats, String effectType) {

        return this;
    }

    public SkillEffect updateSkillStatus() {
        if (currentDuration <= 0) {

        }
        return this;
    }


}
