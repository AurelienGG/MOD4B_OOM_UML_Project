package userInterface.menus;

import logic.hour.HourManager;
import logic.passengers.DeadPassengerCountManager;

/**
 * TODO
 */
public class MainMenu extends Menu {

    private logic.hour.HourManager hourManager;
    private DeadPassengerCountManager deadPassengerCountManager;

    /**
     * TODO
     */
    public MainMenu() {
        super(MenuType.MAIN);
        this.hourManager = HourManager.getInstance();
        this.deadPassengerCountManager = DeadPassengerCountManager.getInstance();
        super.printMenuToOutput();
    }

    /**
     * TODO
     */
    public void advanceHour() {
        //TODO
    }

    /**
     * TODO
     * @param menu
     */
    @Override
    public void goToMenu(Menu menu) {
        //TODO
    }

    /**
     * TODO
     * @return
     */
    @Override
    public String displayMenu() {
        //TODO
        StringBuilder mainMenuDisplay = new StringBuilder();

        mainMenuDisplay.append("MainMenu\n");
        mainMenuDisplay.append("\t\t\t\t\tcurrent hour " + hourManager.displayHour() );
        mainMenuDisplay.append("\t\t\t\t\t#passengers killed " + deadPassengerCountManager.getNbDeadPassengers() );

        // TODO
        if(true)
            mainMenuDisplay.append("\nOption 1: Go to Request Menu\n");
        else
            mainMenuDisplay.append("\nOption 1: Advance to the next hour\n");

        mainMenuDisplay.append("\nOption 2: Go to Waiting Planes menu\n");

        return mainMenuDisplay.toString();
    }

    /**
     * TODO
     * @return
     */
    public boolean checkVisibility() {
        return false;
    }
}
