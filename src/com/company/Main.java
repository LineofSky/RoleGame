package com.company;

import com.company.Units.Warrior;
import com.company.main.java.game.skill.BuffAttack;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Warrior abraham = new Warrior(2);
        Warrior devid = new Warrior(1);
        abraham.useSkill(new BuffAttack());
        abraham.levelUpWarrior();
        abraham.levelUpWarrior();
        abraham.levelUpWarrior();
        abraham.useSkill(new BuffAttack());
//        abraham.move(15, abraham);
        abraham.attack(devid);
    }
}
