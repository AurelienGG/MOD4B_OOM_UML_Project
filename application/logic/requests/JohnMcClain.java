package logic.requests;

import logic.options.*;

public class JohnMcClain extends Request {

    /**
     * TODO
     * @param RARITY
     * @param TITLE
     * @param DESCRIPTION
     */
    protected JohnMcClain(double RARITY, String TITLE, String DESCRIPTION) {
        super(RARITY, TITLE, DESCRIPTION);
    }

    /**
     * TODO
     * @return
     */
    protected Option[] generateOptions() {
        return new Option[] {new LockdownTheRunway(), new LetTheManGo()};
    }
}
