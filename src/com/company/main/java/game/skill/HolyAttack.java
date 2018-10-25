package com.company.main.java.game.skill;

import com.company.main.java.game.Stats;

public class HolyAttack extends Skill {
    private String name = "HolyAttack";
    private int manaCost = 30;

    public void useSkill() {
        if (canUseSkill(manaCost)) {
            stats.setpAtk((int) (stats.getpAtk() * 0.15));
        }
    }

    public String getName() {
        return name;
    }
}
