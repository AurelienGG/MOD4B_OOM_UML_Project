package logic.simulationHour;

import logic.requests.Request;
import userInterface.UserInputManager;

/**
 * Manage program's simulation hours
 *
 * @author Chloé T
 * @author Aurélien
 */
public class SimulationHourManager {
    
    private static SimulationHourManager simulationHourManager_instance = null;
    private SimulationHour[] simulationHours;
    private int pointer;

    /**
     * TODO
     */
    private SimulationHourManager() {
        //TODO
        this.simulationHours = new SimulationHour[24];
        this.pointer = 0;
    }

    /**
     * TODO
     * @return
     */
    public static SimulationHourManager getInstance() {
        if (simulationHourManager_instance == null)
            simulationHourManager_instance = new SimulationHourManager();
        return simulationHourManager_instance;
    }

    /**
     * TODO
     */
    private void initialiseSimulationHours() {
        //TODO
    }

    /**
     * TODO
     * @return
     */
    private Request generateRandomRequest() {
        //TODO
        return null;
    }

    /**
     * TODO
     * @return
     */
    public int getCurrentHour() {
        return pointer + 1;
    }
}
