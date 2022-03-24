package logic.options;

import logic.passengers.DeadPassengerCountManager;
import logic.waitingPlanes.WaitingPlanesManager;

/**
 * TODO
 */
public class LetTheManGo extends Option {

    public LetTheManGo() {
        super("Let the man go", "He crashes the plane into another random Waiting plane and saves christmas. Remove the  waiting plane (no cost) and kill 100 passengers");
    }

    @Override
    public boolean checkRequirement() {
        return true;
    }

    @Override
    public void applyConsequence() {
        if(WaitingPlanesManager.getInstance().getNbWaitingPlanes() >= 1)
            WaitingPlanesManager.getInstance().crashWaitingPlane(WaitingPlanesManager.getInstance().getRandomWaitingPlane());
        DeadPassengerCountManager.getInstance().addDeadPassengers(100);
    }
}
