package com.enigma.oop.object_interaction;

public class Monster extends Character{
    Monster(String name, int HP, int damage, int shield){
        super(name, HP, damage, shield);
    }

    public void giveShield(Hero hero){
        hero.setShield(100);
    }

    @Override
    public String toString(){
        return "Monster { Name: " + getName() + " HP: " + getHP() + " Damage: " + getDamage() + " Shield: " + getShield() + " }";
    }
}
