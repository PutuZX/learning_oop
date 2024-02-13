package com.enigma.oop.object_interaction;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Hero hero1 = heroPick("1st", input);
        System.out.println("\n"+hero1);
        Hero hero2 = heroPick("2nd", input);
        System.out.println("\n"+hero2);
        Monster spider = new Monster("Spider", 50, 10);
        Tower basicTower = new Tower("Basic Tower", 100, 15, 200);

        hero1.Attacking(hero2);
        hero2.Attacking(hero1);
        System.out.println(hero1);
        System.out.println(hero2);
        spider.Attacking(hero1);
        basicTower.Attacking(hero1);
        System.out.println(hero1);
        hero1.Attacking(spider);
        hero1.Attacking(basicTower);
        System.out.println(spider);
        System.out.println(basicTower);
        basicTower.Attacking(hero1);
        System.out.println(hero1);
        System.out.println(hero1);
        // zilong.getHit(110);
        // zilong.getHit(1);
        // System.out.println(zilong);
        // zilong.Healing(zilong);
        // System.out.println(zilong);
        // zilong.Attacking(natalia);
        // System.out.println(natalia);
        // spider.Attacking(natalia);
        // System.out.println(natalia);
        // basicTower.Attacking(natalia);
        // System.out.println(natalia);
        // natalia.Attacking(basicTower);
        // System.out.println(basicTower);
        // heroPick("1st",input);
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
