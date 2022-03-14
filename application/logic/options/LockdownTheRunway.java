package logic.options;

public class LockdownTheRunway extends Option {

    private String description;

    public LockdownTheRunway(){}

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
