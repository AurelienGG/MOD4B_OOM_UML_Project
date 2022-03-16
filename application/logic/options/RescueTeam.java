package logic.options;

public class RescueTeam extends Option {

    private final String description = "Rescue Team";

    public RescueTeam(){
        super("Rescue Team");
    }

    @Override
    public boolean checkRequirement() {
        return true;
    }

    @Override
    public void applyConsequence() {

    }

    @Override
    public String displayOption() {
        return description;
    }
}
