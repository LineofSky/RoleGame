package com.company.main.java.game;

import com.company.main.java.game.skill.Skill;

public interface BasicUnit {
    public void attack(Stats stats);
    public void useSkill(String name, Stats stats) throws ClassNotFoundException, NoSuchMethodException;
    public void defence();
    public void move(int steps, Stats stats);
    public void position();
}
