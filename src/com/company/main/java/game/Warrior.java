package com.company.main.java.game;

import com.company.main.java.game.skill.BuffAttack;
import com.company.main.java.game.skill.WarriorsSkillList;

import java.util.ArrayList;
import java.util.List;

public class Warrior implements BasicUnit {
    private List<String> availableSkillList = new ArrayList<>();

    public Warrior(Stats stats) {
        stats.initializeWarrior(stats.getLevel());
    }

    @Override
    public void attack(Stats stats) {
        stats.setCurrentSP(stats.getCurrentSP() - 30);
        System.out.print("skill is not available");
    }

    @Override
    public void useSkill(String skill, Stats stats) {
        BuffAttack buffAttack = new BuffAttack();
        if (availableSkillList.contains(skill)) {
            buffAttack.useSkill(stats);
            System.out.println(skill + " has been activated");
            System.out.println("Your attack is increased to " + stats.getpAtk());
        } else System.out.println(skill + " skill is not available");
    }

    public void buffAttack(Stats stats) {
        useSkill("BuffAttack", stats);
    }

    @Override
    public void defence() {

    }

    @Override
    public void move(int steps, Stats stats) {
        stats.setCurrentSP(stats.getCurrentSP() - steps);
        System.out.println("Your sp after you moved by " + steps +" is " + stats.getCurrentSP());
    }

    @Override
    public void position() {

    }

    public Warrior levelUpWarrior(Stats stats) {
        availableSkillList = new WarriorsSkillList().getAvailableSkillList(stats.getLevel());
        stats.initializeWarrior(stats.getLevel() +1);
        System.out.println("Your level is now " + stats.getLevel());
        System.out.println("Your hp is now " + stats.getCurrentHP());
        System.out.println("Your sp " + stats.getCurrentSP());
        System.out.println("Your P atk is now " + stats.getpAtk());
        return this;
    }

    public Warrior initializeWarrior(Stats stats) {
        stats.initializeWarrior(1);
        return this;
    }

}
