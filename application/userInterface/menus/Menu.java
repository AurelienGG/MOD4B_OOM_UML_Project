package userInterface.menus;

public abstract class Menu {

    private MenuType menuType;

    //public Menu() {}

    public abstract void goToMenu(Menu menu);

    public abstract String displayMenu();

    public void printMenuToOutput() {
        System.out.println(displayMenu());
    }
}
