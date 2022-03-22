package logic.options;

import logic.passengers.DeadPassengerCountManager;

/**
 * TODO
 */
public class RescueTeam extends Option {

    private DeadPassengerCountManager deadPassengerCountManager_instance;

    public RescueTeam() {
        super("Rescue Team");
        deadPassengerCountManager_instance =DeadPassengerCountManager.getInstance();
    }

    @Override
    public boolean checkRequirement() {
        return true;
    }

    @Override
    public void applyConsequence() {
        deadPassengerCountManager_instance.decreaseDeadPassengers(100);
    }
}
