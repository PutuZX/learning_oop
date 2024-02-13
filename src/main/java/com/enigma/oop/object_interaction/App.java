package com.enigma.oop.object_interaction;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int round = 0;
        int winner = 0;
        Hero hero1 = heroPick("1st", input);
        System.out.println("\n"+hero1);
        Hero hero2 = heroPick("2nd", input);
        System.out.println("\n"+hero2);
        // Monster spider = new Monster("Spider", 50, 10);
        // Tower basicTower = new Tower("Basic Tower", 100, 15, 200);
        
        while(true){
            if(hero1.getHP() == 0 || hero2.getHP() == 0){
                if(hero1.getHP() < hero2.getHP()){
                    winner = 2;
                    System.out.printf("%s is win!%n", hero2.getName());
                }
                else{
                    winner = 1;
                    System.out.printf("%s is win!%n", hero1.getName());
                }
                break;
            } else{
                round++;
                System.out.printf("%nRound %d Start!%n", round);
                int attacker = 1;
                for(int i = 0; i<2; i++){
                    if(attacker == 1){
                        attacker = heroTurn(hero1, hero2, attacker);
                    } else{
                        attacker = heroTurn(hero2, hero1, attacker);
                    }
                }
                
            }
        }
    }

    static Integer heroTurn(Hero hero, Hero opponent, int attacker){
        if(hero.getHP() > 0){
            hero.Attacking(opponent);
            System.out.println(opponent);
            attacker = (attacker == 1) ? 2 : 1;
        }
        return attacker;
    }

    static Hero heroPick(String heroNum, Scanner input){
        int HP = 100;
        int damage = 0;
        int mana = 0;
        String hero = "";
        System.out.printf("%nPlease pick the %s hero: %n", heroNum);
        System.out.println("==========================================================\n");
        System.out.println("1.Natalia\t2.Zilong\t3.Alucard\t4.Johnson");
        System.out.println("\n==========================================================");
        int inputValue = input.nextInt();
        
        switch (inputValue) {
            case 1:
                hero = "Natalia";
                damage = 35;
                mana = 60;
                System.out.printf("The %s player picked Natalia", heroNum);
                break;
            case 2:
                hero = "Zilong";
                damage = 25;
                mana = 60;
                System.out.printf("The %s player picked Zilong", heroNum);
                break;
            case 3:
                hero = "Alucard";
                damage = 60;
                mana = 20;
                System.out.printf("The %s player picked Alucard", heroNum);
                break;
            case 4:
                hero = "Johnson";
                HP = 200;
                damage = 15;
                mana = 70;
                System.out.printf("The %s player picked Johnson", heroNum);
                break;
            default:
                System.out.println("Invalid Input!");
                break;
        }
        return new Hero(hero, HP, damage, mana);
    }

    static void DecisionAtt(Hero hero1, Hero hero2){
        
    }

}
