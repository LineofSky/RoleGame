package com.company.main.java.game.skill;

import com.company.main.java.game.Stats;
import com.sun.org.glassfish.gmbal.Description;

@Description("Increases P Atk by 15%")
public class BuffAttack extends Skill {
    public String name = "BuffAttack";
    int manaCost = 20;

    @Override
    protected void applySkill(Stats stats) {
        useSkillMana(manaCost, stats);
        stats.setpAtk((int) (stats.getpAtk() * 1.15));
    }

    public BuffAttack() {
        setManaCost(manaCost);
        setName(name);
    }

}