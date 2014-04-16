import java.util.*;

/**
 * Player class will contain two fields: name and position
 * 
 * @author Guantong Wo
 * @version 1.0
 */
public class Player
{
    // instance variables - replace the example below with your own
    private String name;
    private int position;
    
    Scanner console = new Scanner(System.in);

    /**
     * Constructor for objects of class Player
     */
    public Player()
    {
        // initialise instance variables
        name = "no name";
        position = 0;
    }
        
    public String getName()
    {
        return name;
    }
    
    public void setName(String newName)
    {
        name = newName;
    }
    
    public int getPosition()
    {
        return position;
    }
    
    public void setPosition(int newPosition)
    {
        position = newPosition;
    }
}