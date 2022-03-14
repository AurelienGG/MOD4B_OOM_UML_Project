package logic.options;

public class AirRefueling extends Option {

    private String description;

    public AirRefueling(){}

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
