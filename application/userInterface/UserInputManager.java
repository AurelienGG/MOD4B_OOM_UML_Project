package userInterface;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Cover user input
 *
 * @author Aurélien
 */
public class UserInputManager {

    private static UserInputManager ui_instance = null;
    private Scanner userInput;

    /**
     * TODO
     */
    private UserInputManager() {
        this.userInput = new Scanner(System.in);
    }

    /**
     * TODO
     * @return
     */
    public static UserInputManager getInstance() {
        if (ui_instance == null)
            ui_instance = new UserInputManager();
        return ui_instance;
    }

    /**
     * TODO
     */
    public void displayOptions() {
        //TODO
    }

    /**
     * TODO
     * @return
     */
    public int readOptionInteger(int minInteger, int maxInteger) {
        int input = Integer.MAX_VALUE;
        boolean loop = true;
        while(loop) {
            try {
                System.out.println("Input an integer between " + minInteger + " and " + maxInteger);
                input = userInput.nextInt();
                // Eating nextInt forgotten "\n"
                userInput.nextLine();
            } catch(InputMismatchException e) {
                System.err.println("Not a number !");
                userInput.next();
            }
            if(input > maxInteger || input < minInteger)
                System.err.println("Your input does not follow the range of integer allowed.");
            else
                loop = false;
        }
        return input;
    }

    /**
     * TODO
     * @return
     */
    public int readOptionIntegerWithExit(int minInteger, int maxInteger) {
        boolean loop = true;
        int input = Integer.MAX_VALUE;
        while(loop) {
            try {
                System.out.println("Input an integer between " + minInteger + " and " + maxInteger + " input -1 to exit.");
                input = userInput.nextInt();
                // Eating nextInt forgotten "\n"
                userInput.nextLine();
            } catch(InputMismatchException e) {
                System.err.println("Not a number !");
                userInput.next();
            }
            if(input == -1 || (input >= minInteger && input <= maxInteger))
                loop = false;
            else
                System.err.println("Your input does not follow the range of integer allowed.");
        }
        return input;
    }

    /**
     * TODO
     * @return
     */
    public char readOptionChar(int nbOptions) {
        boolean loop = true;
        int maxChar = 'A' + nbOptions - 1;
        char input = Character.MAX_VALUE;
        while(loop) {
            System.out.println("Input a character between A and " + (char) maxChar + " (case sensitive)");
            input = userInput.next().charAt(0);
            if(input > maxChar || input < 'A')
                System.err.println("Your input does not follow the range of characters allowed.");
            else
                loop = false;
        }
        return input;
    }

    /**
     * TODO
     * @param charOption
     * @return
     */
    public int convertCharOptionToArrayID(char charOption) {
        //return (int) charOption - ('A' - '0');
        return (int) charOption - 'A';
    }
}
