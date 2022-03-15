package logic.options;

public class AllowThemTheSpaceToProtest extends Option {
    private final String description ="Allow them the space to protest";

    public AllowThemTheSpaceToProtest(){
        super("Allow them the space to protest");
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
