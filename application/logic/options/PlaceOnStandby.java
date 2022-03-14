package logic.options;

public class PlaceOnStandby extends Option {

    private String description;

    public PlaceOnStandby(){}

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
