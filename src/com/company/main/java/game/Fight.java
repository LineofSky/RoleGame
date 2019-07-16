package com.company.main.java.game;

import com.company.Units.Unit;

public class Fight {

    int round = 1;

    public Fight(Unit controlledUnit, Unit enemyUnit) {
        do {
            System.out.println("Round " + round);
            round++;
            performAction(controlledUnit, enemyUnit);
            performAction(enemyUnit, controlledUnit);
//            this instanceof Skill ? ((Skill) this) : null;
        } while (controlledUnit.isAlive() && enemyUnit.isAlive());
    }

    private void performAction(Unit unit, Unit target) {
        double d = Math.random();
        if (d < 0.2) {
            unit.attack(target);
        } else if (d > 0.6) {
            unit.defence();
        } else if (d > 0.2 && d < 0.6) {
            unit.useSkill(unit.getRandomSkill(), target);
        }
        unit.availableSkillList.forEach(skill -> {
            skill.reduceCDBy( 1);
            skill.reduceDurationBy(1);
        });
        System.out.println("Fin");
    }

    public void checkSkillEffects(Unit unit){
        unit.effects.forEach(ad->ad.updateSkillStatus());
    }
}
