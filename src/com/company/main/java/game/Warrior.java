package com.company.main.java.game;

import com.company.main.java.game.skill.BuffAttack;
import com.company.main.java.game.skill.WarriorsSkillList;

import java.sql.Driver;
import java.sql.DriverManager;
import java.util.ArrayList;
import java.util.List;

public class Warrior implements BasicUnit {
    private List<String> availableSkillList = new ArrayList<>();
    private Stats stats;

    public Warrior() {
        stats = new Stats();
        stats.initializeWarrior(stats.getLevel());
    }

    @Override
    public Warrior attack(BasicUnit someUnit) {
        this.stats.setCurrentSP(stats.getCurrentSP() - 30);
        System.out.print("skill is not available");
        someUnit.position();
        return this;
    }

    @Override
    public BasicUnit useSkill(String name, Stats stats) throws ClassNotFoundException, NoSuchMethodException {
        return null;
    }

    public Warrior useSkill(String skill) {
        BuffAttack buffAttack = new BuffAttack();
        if (availableSkillList.contains(skill)) {
            buffAttack.useSkill();
            System.out.println(skill + " has been activated");
            System.out.println("Your attack is increased to " + stats.getpAtk());
        } else System.out.println(skill + " skill is not available");
        return this;
    }

    public void buffAttack() {
        useSkill("BuffAttack");
    }

    @Override
    public Warrior defence() {
        return this;
    }

    @Override
    public BasicUnit move(int steps, Stats stats) {
        return null;
    }

    public Warrior move(int steps) {
        stats.setCurrentSP(stats.getCurrentSP() - steps);
        System.out.println("Your sp after you moved by " + steps +" is " + stats.getCurrentSP());
        return this;
    }

    @Override
    public void position() {

    }

    public Warrior levelUpWarrior() {
        availableSkillList = new WarriorsSkillList().getAvailableSkillList(stats.getLevel());
        initializeWarrior(stats.getLevel() +1);
        System.out.println("Your level is now " + stats.getLevel());
        System.out.println("Your hp is now " + stats.getCurrentHP());
        System.out.println("Your sp " + stats.getCurrentSP());
        System.out.println("Your P atk is now " + stats.getpAtk());
        return this;
    }

    public Warrior initializeWarrior(int level) {
        stats.initializeWarrior(level);
        return this;
    }

}
