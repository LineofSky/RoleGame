package com.company.main.java.game;

public class Unit implements BasicUnit {
    public String name;
    public Boolean isAlive = true;
    public String state;
    Stats stats = new Stats();


    @Override
    public BasicUnit attack(Unit unit) {
        return null;
    }

    public BasicUnit defence() {
        return null;
    }

    @Override
    public BasicUnit beingAttacked(boolean attackTypePhysical, int damage) {
        if (attackTypePhysical) {
            stats.setCurrentHP((100 * stats.getCurrentHP() - (damage * (100 - stats.getpDdef())))/100);
        } else {
            stats.setCurrentHP(stats.getCurrentHP() - damage / stats.getmDef());
        }

        if (stats.getCurrentHP()<1) {
            setAlive(false);
        }
        return null;
    }

    @Override
    public Unit move(int steps) {
        if (isAlive && stats.getMovePoints() > steps) {
            stats.setMovePoints(stats.getMovePoints() - steps);
            System.out.println("Your movePoints after you moved by " + steps + " is " + stats.getMovePoints());
        } else {
            System.out.println("Can`t move");
        }
        return this;
    }


    @Override
    public void position() {

    }

    public String getName() {
        return name;
    }

    public Boolean getAlive() {
        return isAlive;
    }

    public void setName(String name) {
        this.name = name;
    }

    private void setAlive(Boolean alive) {
        isAlive = alive;
    }

}
