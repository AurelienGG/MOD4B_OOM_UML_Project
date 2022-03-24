package userInterface.menus;

import java.io.IOException;

public class RequestMenu extends Menu {

    public RequestMenu() throws IOException {
        super(MenuType.REQUEST);
        super.liveMenu();
    }

    @Override
    protected String displayMenu() {
        return "RequestMenu";
    }

    /**
     * TODO
     */
    @Override
    protected void handleOptions() {
        //TODO
    }
}
