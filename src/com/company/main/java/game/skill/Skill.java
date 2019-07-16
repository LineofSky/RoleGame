package com.company.main.java.game.skill;

import com.company.Units.Stats;
import com.company.Units.Unit;

public abstract class Skill {
    String name;
    private int manaCost;
    private boolean isSkillReady = true;
    private int skillIsReadyIn;
    private int skillCd;
    private int duration;
    private boolean skillAffects;
    protected boolean hasDuration = false;

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
            reduceCDBy(skillCd);
            applySelfSkill(stats);
        }
    }

    public void useSkill(Stats stats, Unit unit) {
        if (canUseSkill(manaCost, stats)) {
            isSkillReady = false;
            setSkillReady(false);
            reduceCDBy(skillCd);
            applyTargetSkill(stats, unit);
        }
    }

    public void reduceCDBy(int timer) {
        this.skillIsReadyIn = skillIsReadyIn - timer;
    }

    public void reduceDurationBy(int timer) {
        if (hasDuration == true) {
            this.duration = duration - timer;
            if (duration == 0) {
                effectHasEnded();
            }
        }
    }

    protected abstract void effectHasEnded();

    public int getManaCost() {
        return manaCost;
    }

    public String getName() {
        return name;
    }

    public int getSkillIsReadyIn() {
        return skillIsReadyIn;
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

    public void setSkillCd(int cd) {
        this.skillCd = cd;
    }

    protected void setDuration(int dur) {
        this.duration = dur;
    }
}