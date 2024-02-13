package com.enigma.oop.object_interaction;

public class Hero extends Character{
    private int mana;

    public Hero(String name, int HP, int damage, int mana){
        super(name, HP, damage);
        this.mana = mana;
    }

    public void healAbility(int mana){
        int currentHP = 0;
        if(getHP() >= 100){
            System.out.println("The HP is full\n");
        } else{
            currentHP += mana;
            System.out.printf("The HP is increased by %d\n", mana);
        }
        HPRules(currentHP);
    }
    
    public void Healing(Hero hero){
        hero.healAbility(mana);
    }

    public int getMana(){
        return this.mana;
    }
    
    @Override
    public String toString(){
        return "Hero { Name: " + getName() + " HP: " + getHP() + " Damage: " + getDamage() + " Mana: " + mana + " }";
    }

}
