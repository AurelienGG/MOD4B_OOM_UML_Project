package logic.options;

import logic.passengers.DeadPassengerCountManager;

/**
 * TODO
 */
public class LetThePlanesLandAnyways extends Option {

    private DeadPassengerCountManager deadPassengerCountManager_instance;

    public LetThePlanesLandAnyways() {
        super("Let the planes land anyways");
        this.deadPassengerCountManager_instance = DeadPassengerCountManager.getInstance();
    }

    @Override
    public boolean checkRequirement() {
        return true;
    }

    @Override
    public void applyConsequence() {
        this.deadPassengerCountManager_instance.addDeadPassengers(100);
    }
}
