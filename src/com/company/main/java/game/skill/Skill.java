package com.company.main.java.game.skill;

import com.company.main.java.game.Stats;

public class Skill {
    Stats stats;
    private int manaCost;
    public boolean isSkillReady = true;

    public void useSkillMana(int manaCost) {
        if (stats.getCurrentMP() > manaCost) {
            isSkillReady = false;
            stats.setCurrentMP(stats.getCurrentMP() - manaCost);
        }
    }

    public int getManaCost() {
        return manaCost;
    }

    public boolean isSkillReady() {
        return isSkillReady;
    }

    public void setManaCost(int manaCost) {
        this.manaCost = manaCost;
    }

    public void setSkillReady(boolean skillReady) {
        isSkillReady = skillReady;
    }

    public boolean canUseSkill(int manaCost) {
        if (isSkillReady()) {
            if (stats.getCurrentMP() > manaCost) {
                isSkillReady = false;
                useSkillMana(manaCost);
                setSkillReady(false);
            } else System.out.print("Not enough mana");
        } else System.out.print("Skill is not ready");
        return true;
    }
}