package userInterface.menus;

import userInterface.UserInputManager;

import java.io.IOException;

/**
 * TODO
 */
public abstract class Menu {

    private MenuType menuType;

    /**
     * TODO
     * @param menuType
     */
    public Menu(MenuType menuType) throws IOException {
        this.menuType = menuType;
    }

    /**
     * TODO
     */
    protected void liveMenu() throws IOException {
        printMenuToOutput();
        handleOptions();
    }

    /**
     * TODO
     */
    protected void printMenuToOutput() {
        System.out.println(displayMenu());
    }

    /**
     * TODO
     */
    protected void goToMainMenu() throws IOException {
        new MainMenu();
    }

    /**
     * TODO
     * @return
     */
    protected abstract String displayMenu();

    /**
     * TODO
     */
    protected abstract void handleOptions() throws IOException;
}
