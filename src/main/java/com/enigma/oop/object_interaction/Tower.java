package com.enigma.oop.object_interaction;

public class Tower extends Character{
    private int shield;
    Tower(String name, int HP, int damage, int shield){
        super(name, HP, damage);
        this.shield = shield;
    }

    public void setShield(int shield){
        this.shield = shield;
    }

    public int getShield(){
        return this.shield;
    }

    @Override
    public String toString(){
        return "Tower { Name: " + getName() + " HP: " + getHP() + " Damage: " + getDamage() + " Shield: " + shield + " }";
    }
}
