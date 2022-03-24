package logic.options;

import logic.passengers.DeadPassengerCountManager;

/**
 * TODO
 */
public class RefuseThem extends Option {

    /**
     * TODO
     */
    public RefuseThem() {
        super("Refuse them", "Counts as letting 50 people die");
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
        DeadPassengerCountManager.getInstance().addDeadPassengers(50);
    }
}
