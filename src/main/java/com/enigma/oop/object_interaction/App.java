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
        Monster monster1 = new Monster("Spider", 50, 5, 0);
        Monster monster2 = new Monster("Spider", 50, 5, 0);
        Tower tower1 = new Tower("Tower", 100, 15, 50);
        Tower tower2 = new Tower("Tower", 100, 15, 50);
        
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
                hero1.addMana(5);
                hero2.addMana(5);
                int attacker = 1;
                for(int i = 0; i<2; i++){
                    if(attacker == 1){
                        attacker = heroDecision(hero1, hero2, attacker, input, tower1, monster1);
                    } else{
                        attacker = heroDecision(hero2, hero1, attacker, input, tower2, monster2);
                    }
                }
            }
        }
    }

    static Integer heroTurn(Hero hero, Character opponent, int attacker){
        hero.Attacking(opponent);
        System.out.println(opponent);
        attacker = (attacker == 1) ? 2 : 1;
        return attacker;
    }

    static Integer heroDecision(Hero hero, Hero opponent, int attacker, Scanner input, Tower tower, Monster monster){
        if(hero.getHP() > 0){
            System.out.printf("%n%s, what do you want to do next?%n", hero.getName());
            System.out.println("==========================================================\n");
            System.out.println("1.Attack Opponent (default) 2.Attack Tower 3.Attack Monster 4.Heal");
            System.out.println("\n==========================================================");
            System.out.print("Input: ");
            int inputValue = input.nextInt();
            switch (inputValue) {
                case 1:
                    attacker = heroTurn(hero, opponent, attacker);
                    if(tower.getHP() > 0){
                        tower.Attacking(hero);
                        hero.toString();
                    }
                    break;
                case 2:
                    if(tower.getHP() <= 0){
                        System.out.println("The tower is no more!");
                    } else{
                        attacker = heroTurn(hero, tower, attacker);
                        if(tower.getHP() >= 0){
                            tower.Attacking(hero);
                            hero.toString();
                        }
                    }
                    break;
                case 3:
                    if(monster.getHP() <= 0){
                        System.out.println("The monster is no more!");
                    } else{
                        attacker = heroTurn(hero, monster, attacker);
                        if(monster.getHP() <= 0){
                           monster.giveShield(hero); 
                           System.out.printf("%s obtained the shield from the %s", hero.getName(), monster.getName());
                           hero.toString();
                        } else{
                            monster.Attacking(hero);
                            hero.toString();
                        }
                    }
                    break;
                case 4:
                    hero.Healing(hero);
                    attacker = (attacker == 1) ? 2 : 1;
                    break;
                default:
                    break;
            }
        }
        return attacker;
    }

    static Hero heroPick(String heroNum, Scanner input){
        System.out.printf("%nPlease pick the %s hero: %n", heroNum);
        System.out.println("==================================================================\n");
        System.out.println("1.Natalia (default)\t2.Zilong\t3.Alucard\t4.Johnson");
        System.out.println("\n==================================================================");
        System.out.print("Input: ");
        int inputValue = input.nextInt();
        
        switch (inputValue) {
            case 1:
                System.out.printf("The %s player picked Natalia", heroNum);
                return new Hero("Natalia", 100, 35, 0, 60);
            case 2:
                System.out.printf("The %s player picked Zilong", heroNum);
                return new Hero("Zilong", 100, 25, 0, 60);
            case 3:
                System.out.printf("The %s player picked Alucard", heroNum);
                return new Hero("Alucard", 100, 50, 0, 20);
            case 4:
                System.out.printf("The %s player picked Johnson", heroNum);
                return new Hero("Johnson", 100, 15, 0, 70);
            default:
                System.out.printf("The %s player picked Natalia", heroNum);
                return new Hero("Natalia", 100, 35, 0, 60);
        }
    }

    static void DecisionAtt(Hero hero1, Hero hero2){
        
    }

}
