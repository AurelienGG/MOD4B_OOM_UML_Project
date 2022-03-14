package logic.options;

public class LetThePlanesLandAnyways extends Option {

    private String description;

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
        return null;
    }
}
