package com.company.main.java.game;

import com.company.Units.Warrior;
import com.company.main.java.game.skill.BuffAttack;
import com.company.main.java.game.skill.HolyAttack;
import org.testng.annotations.Test;

public class Tests {

    @Test
    public void TestInitializeAndSkillUsage() {
        Warrior abraham = new Warrior(1);
        abraham.useSkill(new BuffAttack());
        abraham.levelUpWarrior();
        abraham.levelUpWarrior();
        abraham.levelUpWarrior();
        abraham.useSkill(new BuffAttack());
        abraham.move(15);
    }

    @Test
    public void moveAndFastKillTest() {
        Warrior kisuke = new Warrior(15);
        Warrior enemy = new Warrior(1);
        kisuke.move(80);
        kisuke.useSkill(new HolyAttack(), enemy);
        kisuke.attack(enemy);
        kisuke.attack(enemy);
        kisuke.attack(enemy);
        kisuke.attack(enemy);
    }

    @Test
    public void testFights(){
        Warrior champion = new Warrior(15);
        Warrior loser = new Warrior(10);
        new Fight(champion, loser);
    }
}
