package logic.options;

public abstract class Option {

    private final String DESCRIPTION;

    protected Option(String DESCRIPTION) {
        this.DESCRIPTION = DESCRIPTION;
    }

    public abstract boolean checkRequirement();

    public abstract void applyConsequence();

    public String displayOption() {
        return this.DESCRIPTION;
    }
}
