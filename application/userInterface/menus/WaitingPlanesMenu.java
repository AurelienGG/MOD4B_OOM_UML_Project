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
        return "\nWaiting Planes menu\n" +
                WaitingPlanesManager.getInstance().displayWaitingPlanes() +
                "\n\nOption 1: Select a plane to land" +
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
                if(RunwayManager.getInstance().areAllRunwaysFull())
                    System.out.println("WARNING Runways are full, you can't land a waiting plane !");
                else if(WaitingPlanesManager.getInstance().isWaitingPlanesEmpty())
                    System.out.println("WARNING There is no Waiting Planes you can't land anything !");
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
