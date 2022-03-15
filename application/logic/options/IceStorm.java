package logic.options;

public class IceStorm extends Option {

    private final String description = "Ice storm";

    public IceStorm(){
        super("Ice storm");
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
