package com.company.main.java.game;

import com.company.main.java.game.skill.Skill;
import com.company.main.java.game.skill.WarriorsSkillList;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Warrior extends Unit {
    private List<Skill> availableSkillList = new ArrayList<>();
    private final int DefaultMovingPointCap = 100;
    private final boolean attackTypePhicial = true;

    public Warrior(int level) {
        stats.setLevel(level);
        stats.initializeWarrior(stats.getLevel());
        stats.setMovePoints(DefaultMovingPointCap);
        availableSkillList = new WarriorsSkillList().getAvailableSkillList(stats.getLevel());
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

    @Override
    public void position() {

    }

    public Warrior levelUpWarrior() {
        stats.initializeWarrior(stats.getLevel() + 1);
        availableSkillList = new WarriorsSkillList().getAvailableSkillList(stats.getLevel());
        stats.setMovePoints(DefaultMovingPointCap);
        System.out.println("Your level is now " + stats.getLevel());
        System.out.println("Your hp is now " + stats.getCurrentHP());
        System.out.println("Your sp " + stats.getCurrentSP());
        System.out.println("Your P atk is now " + stats.getpAtk());
        return this;
    }

    @Override
    public Warrior attack(Unit unit) {
        if (unit.isAlive) {
            unit.beingAttacked(attackTypePhicial, stats.getpAtk());
            if (!unit.isAlive) {
                System.out.println(unit.getName() + " was killed.");
            }
        } else System.out.println("The target is already dead");
        return this;
    }
}
