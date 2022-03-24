package userInterface.menus;

import logic.hour.HourManager;
import logic.passengers.DeadPassengerCountManager;
import logic.simulationRequests.SimulationRequestsManager;
import userInterface.UserInputManager;

import java.io.IOException;

/**
 * TODO
 */
public class MainMenu extends Menu {

    private HourManager hourManager_instance;
    private DeadPassengerCountManager deadPassengerCountManager_instance;

    /**
     * TODO
     */
    public MainMenu() throws IOException {
        super(MenuType.MAIN);
        this.hourManager_instance = HourManager.getInstance();
        this.deadPassengerCountManager_instance = DeadPassengerCountManager.getInstance();
        super.liveMenu();
    }

    /**
     * TODO
     */
    public void advanceHour() {
        //TODO
    }

    /**
     * TODO
     * @return
     */
    @Override
    public String displayMenu() {
        //TODO
        StringBuilder mainMenuDisplay = new StringBuilder();

        mainMenuDisplay.append("MainMenu\n");
        mainMenuDisplay.append("\t\t\t\t\tcurrent hour " + hourManager_instance.displayHour() );
        mainMenuDisplay.append("\t\t\t\t\t#passengers killed " + deadPassengerCountManager_instance.getNbDeadPassengers() );

        // TODO
        if(areRequestsDone())
            mainMenuDisplay.append("\nOption 1: Advance to the next hour\n");
        else
            mainMenuDisplay.append("\nOption 1: Go to Request Menu\n");

        mainMenuDisplay.append("\nOption 2: Go to Waiting Planes menu\n");

        return mainMenuDisplay.toString();
    }

    /**
     * TODO
     */
    @Override
    public void handleOptions() throws IOException {
        //TODO
        int input = super.userInputManager_instance.readOptionInteger(1, 2);
        switch(input) {
            case 1:
                if(areRequestsDone())
                    new AdvanceHourMenu();
                else
                    new RequestMenu();
                break;
            case 2:
                new WaitingPlanesMenu();
                break;
        }
    }

    /**
     * TODO
     * @return
     */
    public boolean areRequestsDone() {
        return SimulationRequestsManager.getInstance().areAllCurentHourRequestsDone();
    }
}
