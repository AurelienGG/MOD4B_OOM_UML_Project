package userInterface.menus;

public class RunwayMenu extends Menu {

    public RunwayMenu() {
        super(MenuType.RUNWAY);
    }

    @Override
    public void goToMenu(Menu menu) {

    }

    @Override
    public String displayMenu() {
        return "RunwayMenu";
    }
}
