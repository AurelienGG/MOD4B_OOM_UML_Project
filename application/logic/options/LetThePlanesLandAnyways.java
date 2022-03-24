package logic.options;

import logic.passengers.DeadPassengerCountManager;

/**
 * TODO
 */
public class LetThePlanesLandAnyways extends Option {
    /**
     * TODO
     */
    public LetThePlanesLandAnyways() {
        super("Let the planes land anyways", "Counts as 100 passengers dying");
    }

    /**
     * TODO
     * @return
     */
    @Override
    public boolean checkRequirement() {
        return true;
    }

    /**
     * TODO
     */
    @Override
    public void applyConsequence() {
        DeadPassengerCountManager.getInstance().addDeadPassengers(100);
    }
}
