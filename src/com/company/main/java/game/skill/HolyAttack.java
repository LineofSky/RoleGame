package com.company.main.java.game.skill;

public class HolyAttack extends Skill {
    private String name = "HolyAttack";
    private int manaCost = 30;



    @Override
    protected void applySkill() {
        stats.setpAtk((int) (stats.getpAtk() * 0.15));
    }

    public HolyAttack() {
        setManaCost(manaCost);
        setName(name);
    }
}
