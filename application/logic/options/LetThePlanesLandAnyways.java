package logic.options;

public class LetThePlanesLandAnyways extends Option {

    private final String description = "Let the planes land anyways";

    public LetThePlanesLandAnyways(){
        super("Let the planes land anyways");
    }

    @Override
    public boolean checkRequirement() {
        return true;
    }

    @Override
    public void applyConsequence() {

    }

    @Override
    public String displayOption() {
        return description;
    }
}
