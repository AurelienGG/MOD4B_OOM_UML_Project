package userInterface.menus;

import logic.waitingPlanes.WaitingPlanesManager;

public class WaitingPlanesMenu extends Menu {

    private WaitingPlanesManager waitingPlanesManager_instances;

    public WaitingPlanesMenu() {
        super(MenuType.WAITING_PLANES);
        this.waitingPlanesManager_instances = WaitingPlanesManager.getInstance();
    }

    @Override
    public void goToMenu(Menu menu) {

    }

    @Override
    public String displayMenu() {
        return "Waiting Planes menu\n" +
                waitingPlanesManager_instances.displayWaitingPlanes() +
                "\nOption 1: Select a plane to land" +
                "\nOption 2: Return to main menu";
    }
}
