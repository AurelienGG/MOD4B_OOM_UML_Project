package logic.requests;

import logic.options.*;

/**
 * TODO
 */
public class JohnMcClain extends Request {

    /**
     * TODO
     */
    protected JohnMcClain() {
        super("John McClain","Security reports of a man hijacking a plane on the runway. He claims he needs to stop the terrorists from stealing christmas. Do you lock down the runway or let them go?", null);
    }

    /**
     * TODO
     * @return
     */
    protected Option[] generateOptions() {
        return new Option[] {new LockdownTheRunway(), new LetTheManGo()};
    }
}
