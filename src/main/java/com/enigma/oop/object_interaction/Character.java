package com.enigma.oop.object_interaction;

public class Character implements Actions {
    private String name;
    private int HP;
    private int damage;

    Character(String name, int HP, int damage){
        this.name = name;
        this.HP = HP;
        this.damage = damage;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setHP(int HP){
        this.HP = HP;
    }

    public void setDamage(int damage){
        this.damage = damage;
    }

    public String getName(){
        return this.name;
    }

    public int getHP(){
        return this.HP;
    }

    public int getDamage(){
        return this.damage;
    }

    @Override
    public void HPRules(int HP){
        if(HP <= 0){
            setHP(0);
        } else if(HP >= 100){
            setHP(100);
        } else{
            setHP(HP);
        }
    }
   
    @Override
    public void getHit(int damage){
        int currentHP = getHP();
        if(getHP() <= 0){
            System.out.printf("%s is killed!\n", getName());
        } else{
            currentHP -= damage;
            System.out.printf("%s got %d damage\n", getName(), damage);
        }
        HPRules(currentHP);
    }

    @Override
    public void Attacking(Character character){
        character.getHit(getDamage());
    }
}
