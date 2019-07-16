package com.company.Units;

public interface BasicUnit {


    BasicUnit attack(Unit unit);

    //    public BasicUnit useSkill(Skill skill) throws ClassNotFoundException, NoSuchMethodException;
    BasicUnit defence();

    BasicUnit beingAttacked(boolean attackTypePhysical, int damage);

    BasicUnit move(int steps);

    void position();

}
