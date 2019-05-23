package com.company.main.java.game;

public class Unit implements BasicUnit {
    //    private List<Skill> availableSkillList = new ArrayList<>();
    public String name;

//    @Override
//    public Unit attack(Unit unitName) {
//        stats.setCurrentSP(stats.getCurrentSP() - 30);
//        return this;
//    }


    public BasicUnit defence() {
        return null;
    }

    @Override
    public BasicUnit beingAttacked() {
        return null;
    }

    @Override
    public Warrior move(int steps) {
        return null;
    }

    @Override
    public void position() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
