package logic.options;

/**
 * Abstract class for options, provide the subclasses template
 *
 * @author Emmie
 * @author Aurélien
 */
public abstract class Option {

    private final String DESCRIPTION;
    private final String CONSEQUENCES;

    /**
     * TODO
     * @param DESCRIPTION
     */
    protected Option(String DESCRIPTION, String CONSEQUENCES) {
        this.DESCRIPTION = DESCRIPTION;
        this.CONSEQUENCES = CONSEQUENCES;
    }

    /**
     * TODO
     * @return
     */
    public abstract boolean checkRequirement();

    /**
     * TODO
     */
    public abstract void applyConsequence();

    /**
     * TODO Delete if not used
     * @return
     */
    public String getDESCRIPTION() {
        return this.DESCRIPTION;
    }

    /**
     * TODO
     * @return
     */
    public String displayOption() {
        return this.DESCRIPTION + " (" + this.CONSEQUENCES + ")";
    }
}
