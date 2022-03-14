package logic.options;

public class IcyRunWays extends Option {

    private final String description = "Icy run ways";

    public IcyRunWays(){}

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
