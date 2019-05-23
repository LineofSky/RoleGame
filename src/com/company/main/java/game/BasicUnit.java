package com.company.main.java.game;

import com.company.main.java.game.skill.Skill;

public interface BasicUnit {
//    public BasicUnit attack(Unit unit);
//    public BasicUnit useSkill(Skill skill) throws ClassNotFoundException, NoSuchMethodException;
    public BasicUnit defence();
    public BasicUnit beingAttacked();

    public Warrior move(int steps);
    public void position();

}
