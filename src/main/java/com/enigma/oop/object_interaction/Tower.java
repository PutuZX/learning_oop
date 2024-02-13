package com.enigma.oop.object_interaction;

public class Tower extends Character{
    Tower(String name, int HP, int damage, int shield){
        super(name, HP, damage, shield);
    }

    @Override
    public String toString(){
        return "Tower { Name: " + getName() + " HP: " + getHP() + " Damage: " + getDamage() + " Shield: " + getShield() + " }";
    }
}
