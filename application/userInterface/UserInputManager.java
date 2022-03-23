package userInterface;

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
    public int readOptionMenu() {
        //TODO
        return this.userInput.nextInt();
    }

    /**
     * TODO
     * @return
     */
    public char readOptionRequest() {
        //TODO
        return this.userInput.next().charAt(0);
    }

    /**
     * TODO
     * @param charOption
     * @return
     */
    public int convertCharOptionToArrayID(char charOption) {
        return (int) charOption - ('A' - '0');
    }
}
