package logic.options;

public class LetThemLand extends Option {

    private String description;

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
