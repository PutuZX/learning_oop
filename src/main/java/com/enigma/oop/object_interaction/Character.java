package com.enigma.oop.object_interaction;

public class Character implements Actions {
    private String name;
    private int HP;
    private int damage;
    private int shield;

    Character(String name, int HP, int damage, int shield){
        this.name = name;
        this.HP = HP;
        this.damage = damage;
        this.shield = shield;
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

    public void setShield(int shield){
        this.shield = shield;
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

    public int getShield(){
        return this.shield;
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
    public void ShieldRules(int Shield){
        if(Shield <= 0){
            setShield(0);
        } else{
            setShield(Shield);
        }
    }
   
    @Override
    public void getHit(int damage){
        int currentHP = getHP();
        int currentShield = getShield();
        if(getShield() <= 0){
            if(getHP() <= 0){
                System.out.printf("%s is killed!\n", getName());
            } else{
                currentHP -= damage;
                System.out.printf("%s got %d damage\n", getName(), damage);
            }
            HPRules(currentHP);
        } else{
            currentShield -= damage;
            System.out.println();
            System.out.printf("%s's shield hitted by %d damage%n", getName(), damage);
            if(currentShield <= 0){
                System.out.printf("%s's shield is broken%n", getName());
            }
            ShieldRules(currentShield);
        }
    }

    @Override
    public void Attacking(Character character){
        character.getHit(getDamage());
    }
}
