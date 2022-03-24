package logic.simulationRequests;

import logic.Tools;
import logic.hour.HourManager;
import logic.requests.Request;
import logic.requests.RequestManager;
import logic.simulationHour.SimulationHour;
import logic.simulationHour.SimulationHourManager;

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
        this.simulationRequests = new ArrayList<>(HourManager.LAST_HOUR);
        for(int i = 0; i < HourManager.LAST_HOUR; i++)
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
     * @return
     */
    public int getNbRequestsIncomingHour() {
        return this.simulationRequests.get(HourManager.getInstance().getHour()+1).getNbRequests();
    }

    /**
     * TODO
     */
    public void doRequests() {
        //TODO DELETE IF NOT USED
        int nbRequestCurrentHour = getNbRequestsCurrentHour();
        for(int i = 0; i < (nbRequestCurrentHour); i++) {


        }
    }

    /**
     * TODO
     */
    public boolean areAllCurentHourRequestsDone() {
        return this.simulationRequests.get(HourManager.getInstance().getHour()).areAllRequestsDone();
    }

    /**
     * TODO FIX We use UI and print things which wasn't what we wanted
     *
     * @param idRequest
     */
    public void startRequestCurrentHour(int idRequest) {
        //TODO
        this.simulationRequests.get(HourManager.getInstance().getHour()).startRequest(idRequest);
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
    public String displayRequestsCurrentHour() {
        return this.simulationRequests.get(HourManager.getInstance().getHour()).displayRequests();
    }

    /**
     * TODO
     * @return
     */
    public String displayRequestsNameCurrentHour() {
        return this.simulationRequests.get(HourManager.getInstance().getHour()).displayRequestsName();
    }
}
