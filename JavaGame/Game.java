import java.util.*;
import java.lang.*;

/**
 * this game is design for two player to playing a boardgame that has maximum 50 move each 
 * and who reach position will be the winner
 * 
 * @author Guantong Wo
 * @version 1.0
 */
public class Game
{    
    private boolean finishedGame;
    private String winner;

    private Player playerOne;
    private Player playerTwo;
    private Dice dice;
    
    /**
     * Constructor for objects of class Game
     */
    public Game()
    {
        // initialise instance variables
        finishedGame = false;
        winner = "";
        
        dice = new Dice();
        playerOne = new Player();
        playerTwo = new Player();
    }

    public void playGame()
    throws InterruptedException 
    {        
        String option = "";

        Menu menu;
        menu = new Menu();
        Scanner console = new Scanner(System.in);
        
        do
        {
            //Welcome message and option display
            menu.printMenu();
            option = console.nextLine();

            //option action after choose one (1-5).
            switch (option)
            {
                //start new game
                case "1":
                    createNewPlayer();
                    break;

                //roll a dice for both player    
                case "2":
                    rollDice();
                    break;

                //display current position for both players
                case "3":
                    displayPlayerPosition();
                    break;
                    
                //display game help
                case "4":
                    displayHelp();
                    break;
                    
                //quit game
                case "5":
                    exitGame();
                    break;
                    
                //default print out current position for both player
                default:
                    System.out.println(playerOne.getName() + " is on position " +
                    playerOne.getPosition() + "\n" + playerTwo.getName() +
                    " is on position " + playerTwo.getPosition());
                    System.out.println("=================================\n");
                    break;
            }
        } 

        while (!option.equals("5"));
        System.exit(0);
    }

    public void createNewPlayer()
    {
        String inputName = "";
        finishedGame = false;
        
        Scanner console = new Scanner(System.in);
        playerOne = new Player();
        playerTwo = new Player();
        
        System.out.print("Please enter player 1's name: ");
        inputName = console.nextLine();
        playerOne.setName(inputName);
        playerOne.setPosition(0);

        System.out.print("Please enter player 2's name: ");
        inputName = console.nextLine();
        playerTwo.setName(inputName);
        playerTwo.setPosition(0);
        
        System.out.println("=================================\n");
    }

    public void rollDice()
    {
        int tempPosition = 0;
        
        if (finishedGame == false)
        {
            tempPosition = dice.rollDice();
            playerOne.setPosition(tempPosition);
            System.out.println(playerOne.getName() + " rolled a " + tempPosition + 
            ", and move from position " + (playerOne.getPosition() - tempPosition) + 
            " to " + playerOne.getPosition());
    
            tempPosition = dice.rollDice();
            playerTwo.setPosition(tempPosition);
            System.out.println(playerTwo.getName() + " rolled a " + tempPosition + 
            ", and move from position " + (playerTwo.getPosition() - tempPosition) + 
            " to " + playerTwo.getPosition());
        }
        else
            winnerMessage();
        
        if (playerOne.getPosition() >= 50 && playerTwo.getPosition() >= 50)
        {
            System.out.println("This game is a Draw");
            winner = playerOne.getName() + " " + playerTwo.getName();
            finishedGame = true;
        }
        else if (playerOne.getPosition() >= 50)
        {
            System.out.println("Congratulations, " + playerOne.getName() + 
            " has Won this game");
            winner = playerOne.getName();
            finishedGame = true;
        }
        else if (playerTwo.getPosition() >= 50)
        {
            System.out.println("Congratulations, " + playerTwo.getName() + 
            " has Won this game");
            winner = playerTwo.getName();
            finishedGame = true;
        }
        else if (playerOne.getPosition() % 11 == 0)
        {
            System.out.println(playerOne.getName() + 
            " is Penalised, move back by 5\n" + playerOne.getName() + 
            " move from position " + playerOne.getPosition() + " to " + 
            (playerOne.getPosition() - 5));
            playerTwo.setPosition(-5);
        }
        else if (playerTwo.getPosition() % 11 == 0)
        {
            System.out.println(playerTwo.getName() + 
            " is Penalised, move back by 5\n" + playerTwo.getName() + 
            " move from position " + playerTwo.getPosition() + " to " + 
            (playerTwo.getPosition() - 5));
            playerTwo.setPosition(-5);
        }

        System.out.println("=================================\n");
    }

    public void displayPlayerPosition()
    {
        System.out.println(playerOne.getName() + " is on position " + 
        playerOne.getPosition() + "\n" + playerTwo.getName() + 
        " is on position " + playerTwo.getPosition());
        System.out.println("=================================\n");
    }

    public void displayHelp()
    {
        System.out.println("Enter option 1 to start a new game\n" + 
        "Enter option 2 to roll dice for both player\n" + 
        "Enter option 3 to display current position for both player\n" + 
        "Enter option 4 to display game help\n" + 
        "Enter option 5 to exit this game\n");
        System.out.println("=================================\n");
    }

    public void exitGame()
    throws InterruptedException
    {
        System.out.println("You have exit the game, have a good day");
        Thread.sleep(2000);
    }
    
    public void winnerMessage()
    {
        System.out.println("Game finished. You must start a new game");
        System.out.println("The last game won by Player " + winner);
        System.out.println("=================================\n");
    }
}