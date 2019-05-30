package com.company.main.java.game.skill;

import com.company.main.java.game.Stats;

public class HolyAttack extends Skill {
    private String name = "HolyAttack";
    private int manaCost = 30;



    @Override
    protected void applySkill(Stats stats) {
        stats.setpAtk((int) (stats.getpAtk() * 0.15));
        useSkillMana(manaCost, stats);
    }

    public HolyAttack() {
        setManaCost(manaCost);
        setName(name);
    }
}
