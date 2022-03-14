package userInterface.menus;

public abstract class Menu {

    private MenuType menuType;

    //public Menu() {}

    public abstract void goToMenu(Menu menu);

    public abstract String menuToString();

    public void displayMenu() {
        System.out.println(menuToString());
    }
}
