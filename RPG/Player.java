
/**
 * The player class that will be controlled throughout the game
 *
 */

import java.util.Scanner;
import java.util.Random;

public class Player

{
    //adding scanner object to receive input
    Scanner in = new Scanner(System.in);
    Random rand = new Random();
    // player stats
    private int playerAttack;
    private int playerDefense;
    private int playerHealth;
    private int playerSpeed;
    private int playerLocation;
    private int playerExperience = 0;
    private int playerLevel = 1;
    private int playerGold = 100;
    private int choice;
    private String job;
    private boolean flag;
    private boolean onBorder;

    
    public void chooseJob(){
        flag = true;
        while(flag){
            System.out.println("Please choose your job: Warrior = 1, Mage = 2, Archer = 3");   
            choice = in.nextInt();
            switch(choice){
                case 1:
                    System.out.println("You chose Warrior.");
                    job = "Warrior";
                    playerAttack = 6;
                    playerDefense = 15;
                    playerHealth = 40;
                    playerSpeed = 5;
                    flag = false;
                    break;
                case 2:
                    System.out.println("You chose Mage.");
                    job = "Mage";
                    playerAttack = 10;
                    playerDefense = 10;
                    playerHealth = 20;
                    playerSpeed = 10;
                    flag = false;
                    break;
                case 3:
                    System.out.println("You chose Archer.");
                    job = "Archer";
                    playerAttack = 14;
                    playerDefense = 5;
                    playerHealth = 20;
                    playerSpeed = 15;
                    flag = false;
                    break;
                default:
                    System.out.println("Invalid choice, choose again.");
                    flag = true;
                }
            }
    }
    public void getStatus(){
        System.out.println("Health: " + playerHealth);
        System.out.println("Attack: " + playerAttack);
        System.out.println("Defense: " + playerDefense);
        System.out.println("Speed: " + playerSpeed);
        System.out.println("Experience: " + playerExperience);
        System.out.println("Level: " + playerLevel);
        System.out.println("Gold: " + playerGold);
        System.out.println("Job: " + job);
        System.out.println("Location: " + playerLocation);
    }
    
    public int getLocation(){
        return playerLocation;
    }
    public void setLocation(){
        playerLocation = rand.nextInt(3);
        System.out.println("You start on tile: " + playerLocation);
    }
    
    public void moveNorth(){
        onBorder = false;
        if (playerLocation < 0 || playerLocation > 3){
            System.out.println("You cannot go outside the map.");
        } 
        else {
            playerLocation -= 4;
        }
    }
    
    public void moveSouth(){
        if (playerLocation < 0 || playerLocation > 3){
            System.out.println("You cannot go outside the map.");
        } 
        else {
            playerLocation -= 4;
        }
    }
}
