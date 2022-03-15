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

    private SimulationHourManager() {
        this.simulationHours = new SimulationHour[24];
    }

    public SimulationHourManager getInstance() {
        if (simulationHourManager_instance == null)
            simulationHourManager_instance = new SimulationHourManager();
        return simulationHourManager_instance;
    }

    private void initialiseSimulationHours() {
        //TODO
    }

    private Request generateRandomRequest() {
        //TODO
        return null;
    }
}
