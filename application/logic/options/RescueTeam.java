package logic.options;

public class RescueTeam extends Option {

    private String description;

    public RescueTeam(){}

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
