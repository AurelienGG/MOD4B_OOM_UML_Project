package logic.options;

public class LetTheManGo extends Option {

    private final String description = "Let the man go";

    public LetTheManGo(){
        super("Let the man go");
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
