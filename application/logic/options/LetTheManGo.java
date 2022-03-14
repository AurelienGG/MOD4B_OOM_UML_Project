package logic.options;

public class LetTheManGo extends Option {

    private String description;

    public LetTheManGo(){}

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
