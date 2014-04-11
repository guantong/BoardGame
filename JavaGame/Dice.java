import java.util.*;

/**
 * this class will only return a random generated number from rollDice method
 * 
 * @author Guantong Wo
 * @version 1.0
 */
public class Dice
{
    // instance variables - replace the example below with your own
    private int diceNumber;
    
    Random rollDice = new Random();
    
    /**
     * Constructor for objects of class Dice
     */
    public Dice()
    {
        // initialise instance variables
        diceNumber = 0;
    }

    /**
     * @return     a random number between 1 - 6
     */
    public int rollDice()
    {
        return diceNumber = rollDice.nextInt(6) + 1;
    }
}