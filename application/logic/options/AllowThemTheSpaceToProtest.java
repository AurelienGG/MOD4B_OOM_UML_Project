package logic.options;

public class AllowThemTheSpaceToProtest extends Option {
    private String description;

    public AllowThemTheSpaceToProtest(){}

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
