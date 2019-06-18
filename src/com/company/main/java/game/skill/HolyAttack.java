package com.company.main.java.game.skill;

import com.company.main.java.game.Stats;
import com.company.main.java.game.Unit;

public class HolyAttack extends Skill {
    private String name = "HolyAttack";
    private int manaCost = 30;

    public HolyAttack() {
        setManaCost(manaCost);
        setName(name);
    }

    @Override
    protected void applySelfSkill(Stats stats) {
        stats.setpAtk((int) (stats.getpAtk() * 0.15));
        useSkillMana(manaCost, stats);
    }

    @Override
    protected void applyTargetSkill(Stats stats, Unit unit) {
        int damage = (115 * stats.getpAtk() /100 );
        unit.beingAttacked(true, damage);
    }
}
