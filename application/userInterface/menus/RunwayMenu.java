package userInterface.menus;

import logic.runways.RunwayManager;

import java.io.IOException;

/**
 * TODO
 */
public class RunwayMenu extends Menu {

    private RunwayManager runwayManager_instance;

    /**
     * TODO
     */
    public RunwayMenu() throws IOException {
        super(MenuType.RUNWAY);
        this.runwayManager_instance = RunwayManager.getInstance();
        super.liveMenu();
    }

    /**
     * TODO
     * @return
     */
    @Override
    protected String displayMenu() {
        return "Runway menu\n" +
                runwayManager_instance.displayRunway() +
                "Press \"Enter\" to return to Main menu";
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
