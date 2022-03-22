package logic.options;

import logic.passengers.DeadPassengerCountManager;
import logic.waitingPlanes.WaitingPlanesManager;

/**
 * TODO
 */
public class LetTheManGo extends Option {

    private DeadPassengerCountManager deadPassengerCountManager_instance;
    private WaitingPlanesManager waitingPlanesManager_instance;

    public LetTheManGo() {
        super("Let the man go");
        this.deadPassengerCountManager_instance = DeadPassengerCountManager.getInstance();
        this.waitingPlanesManager_instance = WaitingPlanesManager.getInstance();
    }

    @Override
    public boolean checkRequirement() {
        return true;
    }

    @Override
    public void applyConsequence() {
        if(this.waitingPlanesManager_instance.getNbWaitingPlanes() >= 1)
            this.waitingPlanesManager_instance.crashWaitingPlane(this.waitingPlanesManager_instance.getRandomWaitingPlane());
        this.deadPassengerCountManager_instance.addDeadPassengers(100);
    }
}
