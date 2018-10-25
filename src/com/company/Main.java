package com.company;

import com.company.main.java.game.Stats;
import com.company.main.java.game.Warrior;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Stats warriorStats = new Stats();
        Warrior abraham = new Warrior(warriorStats);
        warriorStats.initializeWarrior(1);
        abraham.buffAttack();
        abraham.levelUpWarrior();
        abraham.levelUpWarrior();
        abraham.buffAttack();
        abraham.attack(abraham);
        abraham.move(15);
    }
}
