package logic.options;

public class EmptyRandomRunway extends Option {

    private final String description = "Empty random runway";

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
        return description;
    }
}
