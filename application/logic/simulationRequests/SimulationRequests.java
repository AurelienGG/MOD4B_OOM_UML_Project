package logic.simulationRequests;

import logic.Tools;
import logic.options.Option;
import logic.requests.Request;
import logic.requests.RequestManager;
import userInterface.UserInputManager;

import java.util.ArrayList;

/**
 * Class for the simulation requests object
 *
 * @author Chloé T
 * @author Aurélien
 */
public class SimulationRequests {

    private ArrayList<Request> hourRequests;

    // TODO comments
    public static final int NB_MAX_REQUESTS = 3;

    /**
     * TODO
     */
    public SimulationRequests() {
        int randomNbRequests = Tools.generateRandomNumber(1, NB_MAX_REQUESTS);
        this.hourRequests = new ArrayList<>(randomNbRequests);
        RequestManager requestManager = RequestManager.getInstance();
        for(int j = 0; j < randomNbRequests; j++)
            hourRequests.add(requestManager.giveRequest());
    }

    /**
     *
     * @return
     */
    public int getNbRequests() {
        return this.hourRequests.size();
    }

    /**
     *
     * @return
     */
    public boolean areAllRequestsDone() {
        return this.hourRequests.isEmpty();
    }

    /**
     * TODO FIX We use UI and print things which wasn't what we wanted
     * @param idRequest
     */
    public void startRequest(int idRequest) {
        // -1 because idRequest start from 1 where the array start at 0
        Request request = this.hourRequests.get(idRequest-1);
        System.out.println(request.displayRequest());

        int inputInt = 0; //If value not changed code might crash
        boolean loop = true;
        while(loop) {
            System.out.println("Select an option with its character");
            char inputChar = UserInputManager.getInstance().readOptionChar(request.getNbOptions());
            inputInt = UserInputManager.getInstance().convertCharOptionToArrayID(inputChar);
            if(request.isOptionDoable(inputInt))
                loop = false;
            else
                System.out.println("WARNING Option requirement aren't met");
        }
        request.doOption(inputInt);
        // Now that the request is done we can remove it
        deleteRequest(request);
    }

    /**
     * TODO
     */
    public void deleteRequest(Request request) {
        this.hourRequests.remove(request);
    }

    /**
     * TODO
     * @return
     */
    public String hourSummary() {
        //TODO
        return null;
    }

    /**
     * TODO
     * @return
     */
    public String displayRequests() {
        StringBuilder stringBuilder = new StringBuilder();
        for(Request request: hourRequests)
            stringBuilder.append(request.displayRequest());
        return stringBuilder.toString();
    }

    /**
     * TODO
     * @return
     */
    public String displayRequestsName() {
        StringBuilder stringBuilder = new StringBuilder();
        int idRequest = 1;
        for(Request request: hourRequests)
            stringBuilder.append(idRequest++ + ") " + request.getTITLE() + "\n");
        return stringBuilder.toString();
    }
}
