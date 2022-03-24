package userInterface.menus;

import logic.hour.HourManager;
import logic.passengers.DeadPassengerCountManager;
import logic.runways.RunwayManager;
import logic.simulationRequests.SimulationRequests;
import logic.simulationRequests.SimulationRequestsManager;
import logic.waitingPlanes.WaitingPlanesManager;

import java.io.IOException;

public class AdvanceHourMenu extends Menu {

    private HourManager hourManager_instance;
    private SimulationRequestsManager simulationRequestsManager_instance;
    private DeadPassengerCountManager deadPassengerCountManager_instance;


    public AdvanceHourMenu() throws IOException {
        super(MenuType.ADVANCE_HOUR);
        hourManager_instance = HourManager.getInstance();
        simulationRequestsManager_instance = SimulationRequestsManager.getInstance();
        deadPassengerCountManager_instance = DeadPassengerCountManager.getInstance();
        super.liveMenu();
    }

    @Override
    protected String displayMenu() {
        advanceHourFirst();

        StringBuilder stringBuilder = new StringBuilder("AdvanceHourMenu\n");

        stringBuilder.append("Curent time " + hourManager_instance.displayHour() + "\n");
        if(!hourManager_instance.isLastHour())
            stringBuilder.append("Number of new requests coming in" + simulationRequestsManager_instance.getNbRequestsIncomingHour() + "\n");

        int nbPassengersDeadCurrentHour = deadPassengerCountManager_instance.getNbDeadPassengersCurrentHour();
        if(nbPassengersDeadCurrentHour > 0)
            stringBuilder.append("Number of passengers dead this hour " + nbPassengersDeadCurrentHour + "\n");
        else if(nbPassengersDeadCurrentHour < 0)
            stringBuilder.append("Number of passengers saved this hour " + (nbPassengersDeadCurrentHour * -1) + "\n");
        else
            stringBuilder.append("Passengers neither died nor was saved this hour\n");

        advanceHourSecond();

        if(deadPassengerCountManager_instance.isGameOver())
            stringBuilder.append("Game Over, number of passengers killed >= 350");
        else if(hourManager_instance.isLastHour())
            stringBuilder.append("Victory, you successfully passed 24h");
        else
            stringBuilder.append("Press \"Enter\" to return to Main menu");

        return stringBuilder.toString();
    }

    /**
     * TODO
     */
    @Override
    protected void handleOptions() throws IOException {
        if(deadPassengerCountManager_instance.isGameOver() || hourManager_instance.isLastHour())
            System.exit(0);

        // TODO delete if generate bug
        System.in.read();
        super.goToMainMenu();
    }

    /**
     * Update nimber of dead passengers from waiting planes crash of current hour
     * Update leaving planes on runways
     */
    private void advanceHourFirst() {
        RunwayManager.getInstance().advanceHourAllRunways();
        WaitingPlanesManager.getInstance().advanceHourWaitingPlanes();
    }

    /**
     * Update current hour and total passengers dead from crashing planes
     */
    private void advanceHourSecond() {
        hourManager_instance.advanceHourHour();
        deadPassengerCountManager_instance.advanceHourPassengers();
    }
}
