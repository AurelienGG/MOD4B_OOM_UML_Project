package logic.options;

import logic.passengers.DeadPassengerCountManager;

/**
 * TODO
 */
public class RefuseThem extends Option {

    private DeadPassengerCountManager deadPassengerCountManager_instance;

    public RefuseThem() {
        super("Refuse them");
        this.deadPassengerCountManager_instance = DeadPassengerCountManager.getInstance();
    }

    @Override
    public boolean checkRequirement() {
        return true;
    }

    @Override
    public void applyConsequence() {
        this.deadPassengerCountManager_instance.addDeadPassengers(50);
    }
}
