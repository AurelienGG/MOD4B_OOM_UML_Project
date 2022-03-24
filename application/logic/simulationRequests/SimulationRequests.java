package logic.simulationRequests;

import logic.Tools;
import logic.requests.Request;
import logic.requests.RequestManager;

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
     * TODO
     * @param idRequest
     */
    public void startRequest(int idRequest) {
        //TODO
        deleteRequest(this.hourRequests.get(idRequest));
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
        int idRequest = 0;
        for(Request request: hourRequests)
            stringBuilder.append(idRequest + ") " + request.getTITLE());
        return stringBuilder.toString();
    }
}
