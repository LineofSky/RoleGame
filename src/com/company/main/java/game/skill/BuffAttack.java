package com.company.main.java.game.skill;

import com.sun.org.glassfish.gmbal.Description;

@Description("Increases P Atk by 15%")
public class BuffAttack extends Skill {
    public String skillName = "BuffAttack";
    int manaCost = 20;

    @Override
    protected void applySkill() {
        useSkillMana(manaCost, stats);
        stats.setpAtk((int) (stats.getpAtk() * 1.15));
        stats.setCurrentMP(stats.getCurrentMP() - 20);
    }

    public BuffAttack() {
        setManaCost(manaCost);
        setName(name);
    }

}