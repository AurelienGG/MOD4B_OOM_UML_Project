package logic.options;

public class RefuseThem extends Option {

    private String description;

    public RefuseThem(){}

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
