package logic.requests;

import logic.options.*;

public class JohnMcClain extends Request {

    /**
     * TODO
     */
    protected JohnMcClain() {

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
