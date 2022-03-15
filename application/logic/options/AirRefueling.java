package logic.options;

public class AirRefueling extends Option {

    private final String description = "Air refueling";

    public AirRefueling(){
        super("Air refueling");
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
