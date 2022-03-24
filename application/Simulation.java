import logic.Tools;
import logic.hour.HourManager;
import logic.requests.Request;
import logic.requests.RequestManager;
import logic.simulationRequests.SimulationRequestsManager;
import userInterface.UserInputManager;
import userInterface.menus.MainMenu;
import userInterface.menus.Menu;
import userInterface.menus.MenuManager;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * TODO
 */
public class Simulation {

    private HourManager hourManager_instance;
    private UserInputManager userInputManager_instance;
    private MenuManager menuManager_instance;
    private SimulationRequestsManager simulationRequestsManager_instance;


    // TODO comments
    public static final int NB_MAX_REQUESTS = 3;

    /**
     * TODO
     * @param scanner
     */
    public Simulation(Scanner scanner) throws IOException {
        this.hourManager_instance = HourManager.getInstance();
        this.userInputManager_instance = UserInputManager.getInstance();
        this.menuManager_instance = MenuManager.getInstance();
        this.simulationRequestsManager_instance = SimulationRequestsManager.getInstance();
    }

    /**
     * TODO
     */
    public void start() throws IOException {
        //TODO
        //Menu mainMenu = this.menuManager_instance.getMainMenu();
        new MainMenu();
    }
}
