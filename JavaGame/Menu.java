
/**
 * Diplay menu items
 * 
 * @author Guantong Wo
 * @version 1.0
 */
public class Menu
{
    // instance variables - replace the example below with your own
    private String menu;

    /**
     * Constructor for objects of class Menu
     */
    public Menu()
    {
        // initialise instance variables
        menu = "Welcome to the Simple Board Game\n" + 
        "=================================\n" + 
        "(1) Start a New Game\n" + 
        "(2) Play One Round\n" + 
        "(3) Display Players' Position\n" + 
        "(4) Display Game Help\n" + 
        "(5) Exit Game\nChoose an option: ";
    }

    /**
     * this method will display menu on terminal
     */
    public void printMenu()
    {
        System.out.print(menu);
    }
}