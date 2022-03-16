package logic.options;

import logic.passengers.DeadPassengerCountManager;

public class RefuseThem extends Option {

    private final String description = "Refuse them";
    DeadPassengerCountManager deadPassengerCountManager;

    public RefuseThem(){
        super("Refuse them");
        deadPassengerCountManager = DeadPassengerCountManager.getInstance();
    }

    @Override
    public boolean checkRequirement() {
        return true;
    }

    @Override
    public void applyConsequence() {
        deadPassengerCountManager.addDeadPassengers(50);
    }

    @Override
    public String displayOption() {
        return description;
    }
}
