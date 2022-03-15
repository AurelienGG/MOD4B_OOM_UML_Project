package logic.options;

public class LetThemLand extends Option {

    private final String description = "Let them land";

    public LetThemLand(){
        super("Let them land");
    }

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
