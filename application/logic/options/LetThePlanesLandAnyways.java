package logic.options;

import logic.passengers.DeadPassengerCountManager;

public class LetThePlanesLandAnyways extends Option {

    private final String description = "Let the planes land anyways";
    DeadPassengerCountManager deadPassengerCountManager;

    public LetThePlanesLandAnyways(){
        super("Let the planes land anyways");
        deadPassengerCountManager = DeadPassengerCountManager.getInstance();
    }

    @Override
    public boolean checkRequirement() {
        return true;
    }

    @Override
    public void applyConsequence() {
        deadPassengerCountManager.addDeadPassengers(100);
    }

    @Override
    public String displayOption() {
        return description;
    }
}
