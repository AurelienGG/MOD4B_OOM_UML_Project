package logic.options;

public class RescueTeam extends Option {

    private final String description = "Rescue Team";

    public RescueTeam(){
    }

    @Override
    public boolean checkRequirement() {
        return false;
    }

    @Override
    public void applyConsequence() {

    }

    @Override
    public String displayOption() {
        return null;
    }
}
