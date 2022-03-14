package logic.options;

public class AllowLanding extends Option {

    private final String description = "Allow landing";

    public AllowLanding(){}

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
