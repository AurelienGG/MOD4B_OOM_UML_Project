package logic.options;

public class LetThemLand extends Option {

    private final String description = "Let them land";

    public LetThemLand(){}

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
