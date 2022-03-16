package userInterface.menus;

import logic.passengers.DeadPassengerCountManager;
import logic.simulationHour.SimulationHourManager;

public class MainMenu extends Menu {

    /**
     * TODO
     */
    public MainMenu() {
        super(MenuType.MAIN);
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

        mainMenuDisplay.append("MainMenu\n\n");

        SimulationHourManager simulationHourManager = SimulationHourManager.getInstance();
        mainMenuDisplay.append("\t\t\t\t\tcurrent hour " + simulationHourManager.getCurrentHour() + "h00" );

        DeadPassengerCountManager deadPassengerCountManager = DeadPassengerCountManager.getInstance();
        mainMenuDisplay.append("\t\t\t\t\t#passengers killed " + deadPassengerCountManager.getNbDeadPassengers() );

        mainMenuDisplay.append("\nMenu options\n");


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
