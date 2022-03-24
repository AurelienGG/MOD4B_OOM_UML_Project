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

    /**
     * TODO
     */
    public MainMenu() throws IOException {
        super(MenuType.MAIN);
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
        StringBuilder mainMenuDisplay = new StringBuilder();

        mainMenuDisplay.append("MainMenu\n");
        mainMenuDisplay.append("\t\t\t\t\t\t\t\t\t\tcurrent hour " + HourManager.getInstance().displayHour() + "\n");
        mainMenuDisplay.append("\t\t\t\t\t\t\t\t\t\t#passengers killed " + DeadPassengerCountManager.getInstance().getNbDeadPassengers() +"\n");

        if(areRequestsDone())
            mainMenuDisplay.append("Option 1: Advance to the next hour\n");
        else
            mainMenuDisplay.append("Option 1: Go to Request Menu\n");

        mainMenuDisplay.append("Option 2: Go to Waiting Planes menu\n");
        // Not asked but there was no clear scenario where we have to go to Runway menu so we just added it as an option in Main menu
        mainMenuDisplay.append("Option 3: Go to Runway menu\n");

        return mainMenuDisplay.toString();
    }

    /**
     * TODO
     */
    @Override
    public void handleOptions() throws IOException {
        //TODO
        int input = UserInputManager.getInstance().readOptionInteger(1, 3);
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
            case 3:
                new RunwayMenu();
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
