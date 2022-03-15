package logic.options;

/**
 * Abstract class for options, provide the sub-classes template
 *
 * @author Emmie
 * @author Aurélien
 */
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
