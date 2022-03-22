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
        //TODO
        super("","");
    }

    /**
     * TODO
     * @return
     */
    protected Option[] generateOptions() {
        return new Option[] {new LockdownTheRunway(), new LetTheManGo()};
    }
}
