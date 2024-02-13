package com.enigma.oop.object_interaction;

public class Monster extends Character{
    Monster(String name, int HP, int damage){
        super(name, HP, damage);
    }

    @Override
    public String toString(){
        return "Monster { Name: " + getName() + " HP: " + getHP() + " Damage: " + getDamage() + " }";
    }
}
