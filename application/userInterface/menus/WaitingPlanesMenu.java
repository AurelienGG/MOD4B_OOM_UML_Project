package userInterface.menus;

public class WaitingPlanesMenu extends Menu {

    public WaitingPlanesMenu() {
        super(MenuType.WAITING_PLANES);
    }

    @Override
    public void goToMenu(Menu menu) {

    }

    @Override
    public String displayMenu() {
        return "WaitingPlanesMenu";
    }
}
