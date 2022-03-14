package logic.options;

public class AllowLanding extends Option {

    private String description;

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
        return null;
    }
}
