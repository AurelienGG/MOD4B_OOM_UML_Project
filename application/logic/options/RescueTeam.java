package logic.options;

import logic.passengers.DeadPassengerCountManager;

/**
 * TODO
 */
public class RescueTeam extends Option {

    /**
     * TODO
     */
    public RescueTeam() {
        super("Rescue Team", "Reduces number of dead passengers by 100");
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
        DeadPassengerCountManager.getInstance().decreaseDeadPassengers(100);
    }
}
