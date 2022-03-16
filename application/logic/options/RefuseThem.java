package logic.options;

public class RefuseThem extends Option {

    private final String description = "Refuse them";

    public RefuseThem(){
        super("Refuse them");
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
