package com.company.main.java.game;

import com.company.main.java.game.skill.Skill;
import com.company.main.java.game.skill.BuffAttack;
import com.company.main.java.game.skill.Skill;
import com.company.main.java.game.skill.WarriorsSkillList;

import java.util.ArrayList;
import java.util.List;

public class Warrior extends Unit {
    private List<Skill> availableSkillList = new ArrayList<>();
    private Stats stats;

    public Warrior() {
        stats = new Stats();
        stats.initializeWarrior(stats.getLevel());
    }

    public Unit useSkill(Skill skill) throws ClassNotFoundException, NoSuchMethodException {
        if (availableSkillList.contains(skill)) {
//            availableSkillList.stream().forEach(s -> s.getName().equals(((BuffAttack) skill).name));
            skill.useSkill(stats);
            System.out.println(skill + " has been activated");
        } else System.out.println(skill + " skill is not available");
        return this;
    }

    public Warrior move(int steps) {
        stats.setCurrentSP(stats.getCurrentSP() - steps);
        System.out.println("Your sp after you moved by " + steps + " is " + stats.getCurrentSP());
        return this;
    }

    @Override
    public void position() {

    }

    public Warrior levelUpWarrior() {
        stats.initializeWarrior(stats.getLevel() + 1);
        availableSkillList = new WarriorsSkillList().getAvailableSkillList(stats.getLevel());
        System.out.println("Your level is now " + stats.getLevel());
        System.out.println("Your hp is now " + stats.getCurrentHP());
        System.out.println("Your sp " + stats.getCurrentSP());
        System.out.println("Your P atk is now " + stats.getpAtk());
        return this;
    }

}
