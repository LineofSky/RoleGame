package com.company.main.java.game.skill;

import com.company.main.java.game.Stats;

public abstract class Skill {
    String name;
    public int manaCost;
    public boolean isSkillReady = true;

    public void useSkillMana(int manaCost, Stats stats) {
        if (stats.getCurrentMP() > manaCost) {
            isSkillReady = false;
            stats.setCurrentMP(stats.getCurrentMP() - manaCost);
        }
    }

    public boolean isSkillReady() {
        return isSkillReady;
    }

    public boolean canUseSkill(int manaCost, Stats stats) {
        boolean status;
        if (isSkillReady()) {
            if (stats.getCurrentMP() > manaCost) {
                status = true;
            } else {
                System.out.print("Not enough mana");
                status = false;
            }
        } else {
            System.out.print("AbstractSkill is not ready");
            status = false;
        }
        return status;
    }

    protected abstract void applySkill(Stats stats);

    public void useSkill(Stats stats) {
        if (canUseSkill(manaCost, stats)) {
            isSkillReady = false;
            setSkillReady(false);
            applySkill(stats);
        }
    }

    public int getManaCost() {
        return manaCost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setManaCost(int manaCost) {
        this.manaCost = manaCost;
    }

    public void setSkillReady(boolean skillReady) {
        isSkillReady = skillReady;
    }
}