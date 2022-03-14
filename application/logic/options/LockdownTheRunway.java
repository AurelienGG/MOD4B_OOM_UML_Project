package logic.options;

public class LockdownTheRunway extends Option {

    private final String description = "Lockdown the runway";

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
        return description;
    }
}
