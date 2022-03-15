package logic.options;

public class PlaceOnStandby extends Option {

    private final String description = "Place on standby";

    public PlaceOnStandby(){
        super("Place on standby");
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
        return description;
    }
}
