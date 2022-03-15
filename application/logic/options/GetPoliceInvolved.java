package logic.options;

public class GetPoliceInvolved extends Option {

    private final String description = "Get police involved";

    public GetPoliceInvolved(){
        super("Get police involved");
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
