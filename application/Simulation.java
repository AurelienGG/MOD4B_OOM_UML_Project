import logic.Tools;
import logic.hour.HourManager;
import logic.requests.Request;
import logic.requests.RequestManager;
import userInterface.UserInputManager;
import userInterface.menus.MenuManager;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * TODO
 */
public class Simulation {

    private HourManager hourManager_instance;
    private UserInputManager userInputManager_instance;
    private MenuManager menuManager_instance;

    private ArrayList<Request[]> simulationRequests;
    private int requestDoneCounter;

    // TODO comments
    public static final int NB_MAX_REQUESTS = 3;

    /**
     * TODO
     * @param scanner
     */
    public Simulation(Scanner scanner)
    {
        this.hourManager_instance = HourManager.getInstance();
        this.userInputManager_instance = UserInputManager.getInstance();
        this.menuManager_instance = MenuManager.getInstance();

        this.simulationRequests = new ArrayList<>(HourManager.LAST_HOUR);

        for(int i = 0; i < HourManager.LAST_HOUR; i++) {
            int randomNbRequests = Tools.generateRandomNumber(1, NB_MAX_REQUESTS);
            Request[] hourRequests = new Request[randomNbRequests];
            RequestManager requestManager = RequestManager.getInstance();
            for(int j = 0; j < randomNbRequests; j++)
                hourRequests[j] = requestManager.giveRequest();
            simulationRequests.add(hourRequests);
        }
    }

    /**
     * TODO
     */
    public void start() {
        //TODO
    }

    /**
     * TODO
     */
    public void doRequests(int idRequest) {
        //TODO
        int nbRequestCurrentHour = this.simulationRequests.get(hourManager_instance.getHour()).length;
        for(int i = 0; i < (nbRequestCurrentHour); i++) {


        }
    }

    /**
     *
     * @param request
     */
    public void startRequest(Request request) {
        //TODO
    }

    /**
     *
     * @return
     */
    public String hourSummary() {
        //TODO
        return null;
    }
}
