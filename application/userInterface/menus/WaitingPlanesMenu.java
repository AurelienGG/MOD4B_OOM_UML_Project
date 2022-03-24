package userInterface.menus;

import logic.runways.RunwayManager;
import logic.waitingPlanes.WaitingPlanesManager;

import java.io.IOException;

public class WaitingPlanesMenu extends Menu {

    private WaitingPlanesManager waitingPlanesManager_instances;
    private RunwayManager runwayManager_instance;

    /**
     * TODO
     */
    public WaitingPlanesMenu() throws IOException {
        super(MenuType.WAITING_PLANES);
        this.waitingPlanesManager_instances = WaitingPlanesManager.getInstance();
        this.runwayManager_instance = RunwayManager.getInstance();
        super.liveMenu();
    }

    /**
     * TODO
     * @return
     */
    @Override
    protected String displayMenu() {
        return "Waiting Planes menu\n" +
                waitingPlanesManager_instances.displayWaitingPlanes() +
                "\nOption 1: Select a plane to land" +
                "\nOption 2: Return to main menu";
    }

    /**
     * TODO
     */
    @Override
    protected void handleOptions() throws IOException {
        int input = super.userInputManager_instance.readOptionInteger(1, 2);
        switch(input) {
            case 1:
                // TODO IF WAITING PLANE EMPTY
                if(runwayManager_instance.areAllRunwaysFull())
                    System.out.println("Runways are full, you can't land a waiting plane");
                else
                    selectPlaneToLand();
                new WaitingPlanesMenu();
                break;
            case 2:
                super.goToMainMenu();
                break;
        }
    }

    /**
     * TODO
     */
    private void selectPlaneToLand() {
        System.out.println("Input waiting plane id");
        int input = super.userInputManager_instance.readOptionInteger(0, waitingPlanesManager_instances.getNbWaitingPlanes()-1);
        waitingPlanesManager_instances.landWaitingPlanes(input);
    }
}
