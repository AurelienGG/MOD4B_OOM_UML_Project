package userInterface.menus;

public class RequestMenu extends Menu {

    public RequestMenu() {
        super(MenuType.REQUEST);
    }

    @Override
    public void goToMenu(Menu menu) {

    }

    @Override
    public String displayMenu() {
        return "RequestMenu";
    }
}
