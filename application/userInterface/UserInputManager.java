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

    private UserInputManager() {
        this.userInput = new Scanner(System.in);
    }

    public static UserInputManager getInstance() {
        if (ui_instance == null)
            ui_instance = new UserInputManager();
        return ui_instance;
    }
}
