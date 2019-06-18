package com.company.main.java.game;

public interface BasicUnit {


    public BasicUnit attack(Unit unit);

    //    public BasicUnit useSkill(Skill skill) throws ClassNotFoundException, NoSuchMethodException;
    public BasicUnit defence();

    public BasicUnit beingAttacked(boolean attackTypePhysical, int damage);

    public BasicUnit move(int steps);

    public void position();

}
