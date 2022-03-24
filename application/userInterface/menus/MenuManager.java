package userInterface.menus;

import java.io.IOException;
import java.util.EnumMap;

/**
 * TODO
 */
public class MenuManager {

    private static MenuManager menuManager_instance = null;

    private EnumMap<MenuType, Menu> menusDictionary;

    /**
     * TODO
     */
    private MenuManager() throws IOException {
        //TODO
        EnumMap<MenuType, Menu> menusDictionary = new EnumMap<>(MenuType.class);

        menusDictionary.put(MenuType.MAIN, new MainMenu());
        menusDictionary.put(MenuType.RUNWAY, new RunwayMenu());
        menusDictionary.put(MenuType.WAITING_PLANES, new WaitingPlanesMenu());
        menusDictionary.put(MenuType.ADVANCE_HOUR, new AdvanceHourMenu());
        menusDictionary.put(MenuType.REQUEST, new RequestMenu());
    }

    /**
     * TODO
     * @return
     */
    public static MenuManager getInstance() throws IOException {
        if (menuManager_instance == null)
            menuManager_instance = new MenuManager();
        return menuManager_instance;
    }

    /**
     *
     * @return
     */
    public Menu getMainMenu() {
        return this.menusDictionary.get(MenuType.MAIN);
    }

    /**
     *
     * @return
     */
    public Menu getRunwayMenu() {
        return this.menusDictionary.get(MenuType.RUNWAY);
    }

    /**
     *
     * @return
     */
    public Menu getWaitingPlanesMenu() {
        return this.menusDictionary.get(MenuType.WAITING_PLANES);
    }

    /**
     *
     * @return
     */
    public Menu getAdvanceHourMenu() {
        return this.menusDictionary.get(MenuType.ADVANCE_HOUR);
    }

    /**
     *
     * @return
     */
    public Menu getRequestMenu() {
        return this.menusDictionary.get(MenuType.REQUEST);
    }
}
