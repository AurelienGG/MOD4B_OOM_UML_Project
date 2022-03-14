package logic.options;

public class IceStorm extends Option {

    private String description;

    public IceStorm(){}

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
