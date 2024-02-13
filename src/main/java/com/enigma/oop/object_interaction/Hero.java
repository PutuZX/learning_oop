package com.enigma.oop.object_interaction;

public class Hero extends Character{
    private int mana;

    public Hero(String name, int HP, int damage, int shield, int mana){
        super(name, HP, damage, shield);
        this.mana = mana;
    }

    public void healAbility(int mana){
        int currentHP = getHP();
        if(getHP() >= 100){
            System.out.println("The HP is full\n");
        } else{
            currentHP += mana;
            System.out.printf("The HP is increased by %d\n", mana);
            mana -= mana;
            setMana(mana);
        }
        HPRules(currentHP);
    }
    
    public void Healing(Hero hero){
        hero.healAbility(mana);
    }

    public int getMana(){
        return this.mana;
    }

    public void addMana(int mana){
        this.mana += mana;
        System.out.printf("%s's mana increased to %d %n", getName(), this.mana);
    }

    public void setMana(int mana){
        this.mana = mana;
    }
    
    @Override
    public String toString(){
        return "Hero { Name: " + getName() + " HP: " + getHP() + " Damage: " + getDamage() + " Mana: " + mana + " Shield: " + getShield() +" }";
    }

}
