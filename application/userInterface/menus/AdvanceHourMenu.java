package userInterface.menus;

import logic.hour.HourManager;
import logic.passengers.DeadPassengerCountManager;
import logic.runways.RunwayManager;
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
        advanceHourDatas();

        StringBuilder stringBuilder = new StringBuilder("\nAdvanceHourMenu\n");

        stringBuilder.append("Curent time " + HourManager.getInstance().displayHour() + "\n");

        HourManager.getInstance().increaseHour();
        if(!HourManager.getInstance().isLastHour()) {
            stringBuilder.append("Number of new requests coming in " + SimulationRequestsManager.getInstance().getNbRequestsCurrentHour() + "\n");
        }
        int nbDeadPassengers = DeadPassengerCountManager.getInstance().getNbDeadPassengers();
        if(nbDeadPassengers > 0)
            stringBuilder.append("Number of passengers dead " + nbDeadPassengers + "\n");
        else if(nbDeadPassengers < 0)
            stringBuilder.append("Number of passengers saved " + (nbDeadPassengers * -1) + "\n");
        else
            stringBuilder.append("Definitely no passengers died or were saved from past events\n");

        stringBuilder.append("\n");

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
     * Update number of dead passengers from waiting planes crash of current hour
     * Update leaving planes on runways
     */
    private void advanceHourDatas() {
        RunwayManager.getInstance().advanceHourAllRunways();
        WaitingPlanesManager.getInstance().advanceHourWaitingPlanes();
    }
}
