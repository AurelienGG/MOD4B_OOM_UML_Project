package logic.simulationHour;

import logic.Tools;
import logic.requests.Request;
import logic.requests.RequestManager;

import java.util.ArrayList;

/**
 * Class for the simulation hour object
 *
 * @author Chloé T
 * @author Aurélien
 */
public class SimulationHour {

    private int currentHour;
    private ArrayList<Request> requests;

    // TODO DELETE THIS CLASS
    public SimulationHour(int currentHour) {
        this.currentHour = currentHour;
        int randomNbRequests = Tools.generateRandomNumber(1,3);
        requests = new ArrayList<>(randomNbRequests);
        RequestManager requestManager = RequestManager.getInstance();
        for(int i = 0; i < randomNbRequests; i++)
            System.out.println("Error");
            //requests.add(requestManager.generateRandomRequest());
    }

    public int getCurrentHour() {
        return currentHour;
    }

    public void startRequest(Request request) {
        //TODO
    }

    public String hourSummary() {
        //TODO
        return null;
    }
}
