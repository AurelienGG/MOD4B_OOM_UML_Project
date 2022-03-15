package userInterface.menus;

public class AdvanceHourMenu extends Menu {

    public AdvanceHourMenu() {
        super(MenuType.ADVANCE_HOUR);
    }

    @Override
    public void goToMenu(Menu menu) {

    }

    @Override
    public String displayMenu() {
        return "AdvanceHourMenu";
    }
}
