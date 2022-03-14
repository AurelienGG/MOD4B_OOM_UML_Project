package logic.options;

public class IcyRunWays extends Option {

    private String description;

    public IcyRunWays(){}

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
