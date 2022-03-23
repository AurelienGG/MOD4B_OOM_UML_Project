package userInterface.menus;

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
    private MenuManager() {
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
    public static MenuManager getInstance() {
        if (menuManager_instance == null)
            menuManager_instance = new MenuManager();
        return menuManager_instance;
    }
}
