package logic.options;

public class LetThePlanesLandAnyways extends Option {

    private final String description = "Let the planes land anyways";

    public LetThePlanesLandAnyways(){}

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
