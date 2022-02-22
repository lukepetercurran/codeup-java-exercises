package RPG;

import java.util.Scanner;
import java.util.Random;

public class TextBasedGame {
    public static void main(String[] args) {

        // System objects
        Scanner in = new Scanner(System.in);
        Random rand = new Random();

        // Game variables
        String[]enemies = {"Skeleton", "Zombie", "Warrior", "Assassin"};
        int maxEnemyHealth = 75;
        int enemyAttackDamage = 25;

        // Player Variables
        int health = 100;
        int attackDamage = 50;
        int numHealthPotions = 3;
        int healthPotionHealAmount = 30;
        int healthPotionDropChance = 50; //Percentage

        boolean running = true;
        System.out.println("Welcome to the Dungeon!");

//        GAME;
        while (running) {
            System.out.println("-----------------------------------");

            int enemyHealth = rand.nextInt(maxEnemyHealth);
            String enemy = enemies[rand.nextInt(enemies.length)];
            System.out.println("\t# " + enemy + " appeared! #\n");
            // # Skeleton has appeared! #
            while (enemyHealth > 0) {
                System.out.println("\tYour HP> " + health);
                System.out.println("\t" + enemy + "'s HP:" + enemyHealth);
                System.out.println("\n\tWhat would you like to do?");
                System.out.println("\t1. Attack");
                System.out.println("\t2. Drink health potion");
                System.out.println("\t3. Run!");

                String input = in.nextLine();
                if(input.equals("1")){

                }
                else if (input.equals("2")){

                }
                else if (input.equals("3")){

                }
            }

        }

    }
}