package userInterface.menus;

import logic.hour.HourManager;
import logic.passengers.DeadPassengerCountManager;
import logic.runways.RunwayManager;
import logic.simulationRequests.SimulationRequests;
import logic.simulationRequests.SimulationRequestsManager;
import logic.waitingPlanes.WaitingPlanesManager;

import java.io.IOException;

/**
 * TODO
 */
public class AdvanceHourMenu extends Menu {
    /**
     * TODO
     * @throws IOException
     */
    public AdvanceHourMenu() throws IOException {
        super(MenuType.ADVANCE_HOUR);
        super.liveMenu();
    }

    /**
     * TODO
     * @return
     */
    @Override
    protected String displayMenu() {
        advanceHourFirst();

        StringBuilder stringBuilder = new StringBuilder("AdvanceHourMenu\n");

        stringBuilder.append("Curent time " + HourManager.getInstance().displayHour() + "\n");
        if(!HourManager.getInstance().isLastHour())
            stringBuilder.append("Number of new requests coming in" + SimulationRequestsManager.getInstance().getNbRequestsIncomingHour() + "\n");

        int nbPassengersDeadCurrentHour = DeadPassengerCountManager.getInstance().getNbDeadPassengersCurrentHour();
        if(nbPassengersDeadCurrentHour > 0)
            stringBuilder.append("Number of passengers dead this hour " + nbPassengersDeadCurrentHour + "\n");
        else if(nbPassengersDeadCurrentHour < 0)
            stringBuilder.append("Number of passengers saved this hour " + (nbPassengersDeadCurrentHour * -1) + "\n");
        else
            stringBuilder.append("Passengers neither died nor was saved this hour\n");

        advanceHourSecond();

        if(DeadPassengerCountManager.getInstance().isGameOver())
            stringBuilder.append("Game Over, number of passengers killed >= 350");
        else if(HourManager.getInstance().isLastHour())
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
        if(DeadPassengerCountManager.getInstance().isGameOver() || HourManager.getInstance().isLastHour())
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
        HourManager.getInstance().advanceHourHour();
        DeadPassengerCountManager.getInstance().advanceHourPassengers();
    }
}
