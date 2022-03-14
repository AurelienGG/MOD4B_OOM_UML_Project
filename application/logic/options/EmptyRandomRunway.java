package logic.options;

public class EmptyRandomRunway extends Option {

    private String description;

    public EmptyRandomRunway(){}

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
