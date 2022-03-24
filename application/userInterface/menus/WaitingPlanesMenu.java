package userInterface.menus;

import logic.runways.RunwayManager;
import logic.waitingPlanes.WaitingPlanesManager;
import userInterface.UserInputManager;

import java.io.IOException;

public class WaitingPlanesMenu extends Menu {

    /**
     * TODO
     */
    public WaitingPlanesMenu() throws IOException {
        super(MenuType.WAITING_PLANES);
        super.liveMenu();
    }

    /**
     * TODO
     * @return
     */
    @Override
    protected String displayMenu() {
        return "Waiting Planes menu\n" +
                WaitingPlanesManager.getInstance().displayWaitingPlanes() +
                "\nOption 1: Select a plane to land" +
                "\nOption 2: Return to main menu";
    }

    /**
     * TODO
     */
    @Override
    protected void handleOptions() throws IOException {
        int input = UserInputManager.getInstance().readOptionInteger(1, 2);
        switch(input) {
            case 1:
                // TODO IF WAITING PLANE EMPTY
                if(RunwayManager.getInstance().areAllRunwaysFull())
                    System.out.println("Runways are full, you can't land a waiting plane");
                else if(WaitingPlanesManager.getInstance().isWaitingPlanesEmpty())
                    System.out.println("There is no Waiting Planes");
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
        int input = UserInputManager.getInstance().readOptionInteger(0, WaitingPlanesManager.getInstance().getNbWaitingPlanes()-1);
        WaitingPlanesManager.getInstance().landWaitingPlanes(input);
    }
}
