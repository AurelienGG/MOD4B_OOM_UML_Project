package logic.options;

public class CrossWinds extends Option {

    private final String description = "Cross winds";

    public CrossWinds(){
        super("Cross winds");
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
