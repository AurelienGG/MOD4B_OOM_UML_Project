package logic.options;

public class GetPoliceInvolved extends Option {

    private String description;

    public GetPoliceInvolved(){}

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
