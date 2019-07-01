package com.company.main.java.game.skill;

import com.company.main.java.game.Stats;
import com.company.main.java.game.Unit;

public abstract class Skill {
    String name;
    private int manaCost;
    private boolean isSkillReady = true;
    private int skillCD;
    private int duration;

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

    protected abstract void applySelfSkill(Stats stats);

    protected abstract void applyTargetSkill(Stats stats, Unit unit);

    public void useSkill(Stats stats) {
        if (canUseSkill(manaCost, stats)) {
            isSkillReady = false;
            setSkillReady(false);
            applySelfSkill(stats);
        }
    }

    public void useSkill(Stats stats, Unit unit) {
        if (canUseSkill(manaCost, stats)) {
            isSkillReady = false;
            setSkillReady(false);
            applyTargetSkill(stats, unit);
        }
    }

    public int getManaCost() {
        return manaCost;
    }

    public String getName() {
        return name;
    }

    public int getSkillCD() {
        return skillCD;
    }

    public int getDuration() {
        return duration;
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

    public void setSkillCD(int skillCD) {
        this.skillCD = skillCD;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}