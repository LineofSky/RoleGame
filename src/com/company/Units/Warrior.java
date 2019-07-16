package com.company.Units;

import com.company.main.java.game.skill.WarriorsSkillList;

import java.util.HashMap;
import java.util.Random;

public class Warrior extends Unit {
    private final int DefaultMovingPointCap = 100;
    private final boolean attackTypePhysical = true;
    HashMap<String,String> randomNames = new HashMap<>();

    public Warrior(int level) {
        stats.setLevel(level);
        this.setName();
        stats.initializeWarrior(stats.getLevel());
        stats.setMovePoints(DefaultMovingPointCap);
        availableSkillList = new WarriorsSkillList().getAvailableSkillList(stats.getLevel());
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
        double criticalHit = 1;
        double d = Math.random();
        if (d < 0.2) {
            criticalHit = 1.5;
        }

        if (unit.isAlive) {
            unit.beingAttacked(attackTypePhysical, (int) (stats.getpAtk() * criticalHit));
            if (!unit.isAlive) {
                System.out.println(unit.getName() + " was killed.");
            }
        } else System.out.println("The target is already dead");
        return this;
    }

    private Warrior setName(){
        randomNames.put("1", "Pudge");
        randomNames.put("2", "Saitama");
        randomNames.put("3", "Ichigo");
        randomNames.put("4", "Luffy");
        Random rand = new Random();
        int number = rand.nextInt(randomNames.size());
        String itemNumber;
        itemNumber = Integer.toString(number);
        setName(randomNames.get(itemNumber));
        randomNames.replace(itemNumber, randomNames.get(itemNumber) + "2");
        return this;
    }
}
