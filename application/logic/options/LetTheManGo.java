package logic.options;

import logic.passengers.DeadPassengerCountManager;
import logic.waitingPlanes.WaitingPlanesManager;

public class LetTheManGo extends Option {

    private final String description = "Let the man go";
    DeadPassengerCountManager deadPassengerCountManager;
    WaitingPlanesManager waitingPlanesManager;

    public LetTheManGo(){
        super("Let the man go");
        deadPassengerCountManager = DeadPassengerCountManager.getInstance();
        waitingPlanesManager = WaitingPlanesManager.getInstance();
    }

    @Override
    public boolean checkRequirement() {
        return true;
    }

    @Override
    public void applyConsequence() {
        if(waitingPlanesManager.getNbWaitingPlanes() >= 1)
            waitingPlanesManager.crashWaitingPlane(waitingPlanesManager.getRandomWaitingPlane());
        deadPassengerCountManager.addDeadPassengers(100);
    }

    @Override
    public String displayOption() {
        return description;
    }
}
