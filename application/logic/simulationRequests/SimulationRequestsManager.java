package logic.simulationRequests;

import logic.hour.HourManager;

import java.util.ArrayList;

/**
 * Manage program's simulation requests
 *
 * @author Chloé T
 * @author Aurélien
 */
public class SimulationRequestsManager {

    private static SimulationRequestsManager simulationRequestsManager_instance = null;
    private ArrayList<SimulationRequests> simulationRequests;

    /**
     * TODO
     */
    private SimulationRequestsManager() {
        // last hour is 24 but we start at 0 so there is 25 hours
        this.simulationRequests = new ArrayList<>(HourManager.LAST_HOUR+1);
        for(int i = 0; i < HourManager.LAST_HOUR+1; i++)
            this.simulationRequests.add(new SimulationRequests());
    }

    /**
     * TODO
     * @return
     */
    public static SimulationRequestsManager getInstance() {
        if (simulationRequestsManager_instance == null)
            simulationRequestsManager_instance = new SimulationRequestsManager();
        return simulationRequestsManager_instance;
    }

    /**
     * TODO
     * @return
     */
    public int getNbRequestsCurrentHour() {
        return this.simulationRequests.get(HourManager.getInstance().getHour()).getNbRequests();
    }

    /**
     * TODO
     */
    public boolean areAllCurentHourRequestsDone() {
        return this.simulationRequests.get(HourManager.getInstance().getHour()).areAllRequestsDone();
    }

    /**
     *
     * @param idRequest
     */
    public void startRequestCurrentHour(int idRequest) {
        this.simulationRequests.get(HourManager.getInstance().getHour()).startRequest(idRequest);
    }

    /**
     * TODO
     * @return
     */
    public String displayRequestsNameCurrentHour() {
        return this.simulationRequests.get(HourManager.getInstance().getHour()).displayRequestsName();
    }
}
