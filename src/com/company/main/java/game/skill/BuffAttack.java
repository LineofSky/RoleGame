package com.company.main.java.game.skill;

import com.company.Units.Stats;
import com.company.Units.Unit;
import com.sun.org.glassfish.gmbal.Description;

@Description("Increases P Atk by 15%")
public class BuffAttack extends Skill {
    public String name = "BuffAttack";
    int manaCost = 20;
    int CD = 15;
    int duration = 3;
    boolean active = false;

    public BuffAttack() {
        setManaCost(manaCost);
        setName(name);
        hasDuration = true;
        setSkillCd(CD);

    }

    @Override
    protected void applySelfSkill(Stats stats) {
        useSkillMana(manaCost, stats);
        active = true;
        stats.setpAtk((int) (stats.getpAtk() * 1.15));
        System.out.println("Attach has incresed to " + stats.getpAtk());
    }

    @Override
    protected void applyTargetSkill(Stats stats, Unit unit) {

    }

    @Override
    protected void effectHasEnded() {

    }

    protected void effectHasEnded(Stats stats) {
        stats.setpAtk((int) (stats.getpAtk() / 1.15));
    }


}