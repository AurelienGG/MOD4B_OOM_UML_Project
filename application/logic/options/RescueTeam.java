package logic.options;

import logic.passengers.DeadPassengerCountManager;

public class RescueTeam extends Option {

    private final String description = "Rescue Team";
    DeadPassengerCountManager deadPassengerCountManager;

    public RescueTeam(){
        super("Rescue Team");
        deadPassengerCountManager=DeadPassengerCountManager.getInstance();
    }

    @Override
    public boolean checkRequirement() {
        return true;
    }

    @Override
    public void applyConsequence() {
        deadPassengerCountManager.decreaseDeadPassengers(100);
    }

    @Override
    public String displayOption() {
        return description;
    }
}
