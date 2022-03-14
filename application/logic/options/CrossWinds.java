package logic.options;

public class CrossWinds extends Option {

    private final String description = "Cross winds";

    public CrossWinds(){}

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
