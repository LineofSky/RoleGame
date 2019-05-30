package com.company;

import com.company.main.java.game.Stats;
import com.company.main.java.game.Warrior;
import com.company.main.java.game.skill.BuffAttack;

public class Main {

    public static void main(String[] args) throws NoSuchMethodException, ClassNotFoundException {
        // write your code here
        Warrior abraham = new Warrior();
        Warrior devid = new Warrior();
        abraham.useSkill(new BuffAttack());
        abraham.levelUpWarrior();
        abraham.levelUpWarrior();
        abraham.levelUpWarrior();
        abraham.useSkill(new BuffAttack());
//        abraham.attack(devid);
        abraham.move(15);
    }
}
