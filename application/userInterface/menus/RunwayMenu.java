package userInterface.menus;

import logic.runways.RunwayManager;

import java.io.IOException;

/**
 * TODO
 */
public class RunwayMenu extends Menu {

    /**
     * TODO
     */
    public RunwayMenu() throws IOException {
        super(MenuType.RUNWAY);
        super.liveMenu();
    }

    /**
     * TODO
     * @return
     */
    @Override
    protected String displayMenu() {
        return "\nRunway menu\n" +
                RunwayManager.getInstance().displayRunway() +
                "\nPress \"Enter\" to return to Main menu";
    }

    /**
     * TODO
     */
    @Override
    protected void handleOptions() throws IOException {
        // TODO delete if generate bug
        System.in.read();
        super.goToMainMenu();
    }
}
