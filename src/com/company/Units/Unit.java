package com.company.Units;

import com.company.main.java.game.skill.Skill;
import com.company.main.java.game.skill.SkillEffect;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Unit implements BasicUnit {
    public String name;
    public Boolean isAlive = true;
    public String state;
    Stats stats = new Stats();
    public List<Skill> availableSkillList;
    public List<SkillEffect> effects;

    @Override
    public BasicUnit attack(Unit unit) {
        System.out.print("unitAttack");
        return this;
    }

    public BasicUnit defence() {
        return null;
    }

    @Override
    public BasicUnit beingAttacked(boolean attackTypePhysical, int damage) {
        if (attackTypePhysical) {
            stats.setCurrentHP((100 * stats.getCurrentHP() - (damage * (100 - stats.getpDdef()))) / 100);
        } else {
            stats.setCurrentHP(stats.getCurrentHP() - damage / stats.getmDef());
        }

        if (stats.getCurrentHP() < 1) {
            setAlive(false);
        }
        return null;
    }

    @Override
    public Unit move(int steps) {
        if (isAlive && stats.getMovePoints() > steps) {
            stats.setMovePoints(stats.getMovePoints() - steps);
            System.out.println("Your movePoints after you moved by " + steps + " is " + stats.getMovePoints());
        } else {
            System.out.println("Can`t move");
        }
        return this;
    }

    @Override
    public void position() {

    }

    public String getName() {
        return name;
    }

    public Boolean isAlive() {
        return isAlive;
    }

    public void setName(String name) {
        this.name = name;
    }

    private void setAlive(Boolean alive) {
        isAlive = alive;
    }

    public Unit useSkill(Skill skill) {
        List<String> skillList = new ArrayList<>();
        skillList.addAll(availableSkillList.stream().map(Skill::getName).collect(Collectors.toList()));
        if (skillList.contains(skill.getName())) {
            skill.useSkill(stats);
            System.out.println(skill + " has been activated");
        } else System.out.println(skill + " skill is not available");
        return this;
    }

    public Unit useSkill(Skill skill, Unit unit) {
        List<String> skillList = new ArrayList<>();
        skillList.addAll(availableSkillList.stream().map(Skill::getName).collect(Collectors.toList()));
        if (skillList.contains(skill.getName())) {
            skill.useSkill(stats, unit);
            System.out.println(skill + " has been activated");
        } else System.out.println(skill + " skill is not available");
        return this;
    }

    public Skill getRandomSkill() {
        Random rand = new Random();
        int value = rand.nextInt(availableSkillList.size() - 1);
        return availableSkillList.get(value);
    }
}
