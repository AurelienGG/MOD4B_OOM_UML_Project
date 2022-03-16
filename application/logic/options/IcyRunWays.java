package logic.options;

public class IcyRunWays extends Option {

    private final String description = "Icy run ways";

    public IcyRunWays(){
        super("Icy run ways");
    }

    @Override
    public boolean checkRequirement() {
        return true;
    }

    @Override
    public void applyConsequence() {
        //TODO
    }

    @Override
    public String displayOption() {
        return description;
    }
}
