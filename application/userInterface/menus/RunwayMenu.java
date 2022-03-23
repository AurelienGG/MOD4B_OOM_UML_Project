package userInterface.menus;

import logic.runways.RunwayManager;

/**
 * TODO
 */
public class RunwayMenu extends Menu {

    private RunwayManager runwayManager_instance;

    public RunwayMenu() {
        super(MenuType.RUNWAY);
        this.runwayManager_instance = RunwayManager.getInstance();
    }

    @Override
    public void goToMenu(Menu menu) {

    }

    @Override
    public String displayMenu() {
        return "Runway menu\n" +
                runwayManager_instance.displayRunway() +
                "Option: Return to Main menu";
    }
}
