package org.vihara.guessmegame;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("------------------------------");
        System.out.println("Welcome to Guess Me Game");
        System.out.println("------------------------------");
        System.out.println("What is your name?");

        System.out.println("------------------------------");

        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        System.out.println("------------------------------");
        System.out.println("Hello " + name);

        System.out.println("------------------------------");

        System.out.println("Shall we start the game?");
        System.out.println("\t1. Yes");
        System.out.println("\t2. No");

        int beginAnswer = scanner.nextInt();

        while (beginAnswer !=1 ){
            System.out.println("Shall we start the game?");
            System.out.println("\t1. Yes");
            System.out.println("\t2. No");

            beginAnswer = scanner.nextInt();
        }

        Random random = new Random();
        int x = random.nextInt(20)+1;
        System.out.println("------------------------------");
        System.out.println("Now your time, Guess a number : ");
        int userInput = scanner.nextInt();

        int timesTried = 0;
        boolean hasWon = false;
        boolean shouldFinish =false;

        while(!shouldFinish){
            timesTried++;

            if(timesTried<=5){

                if(userInput == x){
                    hasWon = true;
                    shouldFinish = true;
                }else if(userInput > x){
                    System.out.println("Guess Lower");
                    userInput = scanner.nextInt();
                }else {
                    System.out.println("Guess Higher");
                    userInput = scanner.nextInt();
                }
            }else{
                shouldFinish = true;
            }
        }

        if(hasWon){
            System.out.println("------------------------------");
            System.out.println("Congratulations! You have guessed in your " + timesTried + " guess.");
        }else {
            System.out.println("------------------------------");
            System.out.println("Game Over!");
            System.out.println("The Number was : " + x);
        }
    }
}
