package logic.options;

public abstract class Option {
    private String description;
    public abstract boolean checkRequirement();
    public abstract void applyConsequence();
    public abstract String displayOption();
}
