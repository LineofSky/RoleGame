package com.company.main.java.game;

import com.company.main.java.game.skill.Skill;

public interface BasicUnit {
    public BasicUnit attack(BasicUnit unit);
    public BasicUnit useSkill(String name, Stats stats) throws ClassNotFoundException, NoSuchMethodException;
    public BasicUnit defence();
    public BasicUnit move(int steps, Stats stats);
    public void position();
}
