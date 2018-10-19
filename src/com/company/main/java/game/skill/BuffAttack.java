package com.company.main.java.game.skill;

import com.company.main.java.game.Stats;
import com.sun.org.glassfish.gmbal.Description;

public class BuffAttack extends Skill {
    @Description("Increases P Atk by 15%")
    final String name = "BuffAttack";
    int manaCost = 20;

    public void useSkill(Stats stats) {
        if (canUseSkill(stats, manaCost)) {
            stats.setpAtk((int) (stats.getpAtk() * 1.15));
        }
    }

    public String getName() {
        return name;
    }
}