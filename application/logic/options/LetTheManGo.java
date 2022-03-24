package logic.options;

import logic.passengers.DeadPassengerCountManager;
import logic.waitingPlanes.WaitingPlanesManager;

/**
 * TODO
 */
public class LetTheManGo extends Option {

    public LetTheManGo() {
        super("Let the man go");
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
