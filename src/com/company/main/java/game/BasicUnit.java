package com.company.main.java.game;

import com.company.main.java.game.skill.Skill;

public interface BasicUnit {
    public BasicUnit attack(BasicUnit unit);
    public BasicUnit useSkill(String name) throws ClassNotFoundException, NoSuchMethodException;
    public BasicUnit defence();

    public Warrior move(int steps);
    public void position();
}
