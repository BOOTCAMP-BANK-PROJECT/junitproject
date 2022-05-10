package game;

import java.security.SecureRandom;
import java.util.Scanner;

public class Game {

    private Scanner input = new Scanner(System.in);
    private SecureRandom random = new SecureRandom ();

    private ScoreBoard score;

    public void play() {
        //start game
        printGameRules();

        //initialize variables
        score = new ScoreBoard();

        String choice;

        do //do the following if the user does not put in "quit"
        {
            choice = input.nextLine().toUpperCase(); //prompt response in lowercase for consistency
            if(choice.equals("QUIT")) break; //quit program

            GameOption choiceNum = getChoiceCode(choice);

             //not valid responses
            if(choiceNum == null) //continue while user input is still not valid
            {
                print("Sorry, it looks like you didn't enter a correct input. Try again.");
            } else {

                GameOption compNum = getComputerChoice();

                evaluateChoices(choiceNum, compNum, score);

                printGameRules();

                choice = input.nextLine().toUpperCase(); //prompt for new user input
            }
        } while (!choice.equals("QUIT"));

    }

    private void evaluateChoices(GameOption choiceNum, GameOption compNum, ScoreBoard score) {
        if(choiceNum == compNum) { //tie cases

            whenTie();
        }
        else if (   choiceNum == GameOption.ROCK && compNum == GameOption.SCISSORS
                ||  choiceNum == GameOption.SCISSORS && compNum == GameOption.PAPER
                ||  choiceNum == GameOption.PAPER && compNum == GameOption.ROCK ) { //user wins paper vs rock
            whenWins();
        }
        else { //otherwise computer wins
            whenLose();
        }

        print("wins:" + score.getWins() + "\nloses:" + score.getLoses() + "\nties:" + score.getTie()); //print out number of wins, ties, and loses
    }

    private void whenTie() {
        print("It's a tie");
        score.incrementTie();
    }

    private void whenLose() {
        print("you lose.");
        score.incrementLoses();
    }

    private void whenWins() {
        print("you win!");
        score.incrementWins();
    }

    private GameOption getChoiceCode(String choice) {
        GameOption option;

        try {
            option = GameOption.valueOf(choice);
        } catch (Exception e) {
            return null;
        }

        return option;
    }

    private GameOption getComputerChoice() {
        GameOption option = GameOption.values()[ (random.nextInt(3)) ];//computer generate random num

        print("Computer chose " + option.toString().toLowerCase());

        return option;
    }

    private void printGameRules() {
        print("Let's play Rock, Paper, Scissors!");
        print("Say \"Rock\", \"Paper\", or \"Scissors\" to indicate your choice. Otherwise say \"Quit\" to quit.");
    }

    private void print(String message){
        System.out.println(message);
    }
}