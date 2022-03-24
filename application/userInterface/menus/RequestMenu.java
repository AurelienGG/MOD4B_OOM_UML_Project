package userInterface.menus;

import logic.simulationRequests.SimulationRequestsManager;

import java.io.IOException;

/**
 * TODO
 */
public class RequestMenu extends Menu {

    private SimulationRequestsManager simulationRequestsManager_instance;

    /**
     * TODO
     * @throws IOException
     */
    public RequestMenu() throws IOException {
        super(MenuType.REQUEST);
        this.simulationRequestsManager_instance = SimulationRequestsManager.getInstance();
        super.liveMenu();
    }

    /**
     * TODO
     * @return
     */
    @Override
    protected String displayMenu() {
        StringBuilder stringBuilder = new StringBuilder("Request menu\n");
        stringBuilder.append("Select a request with its id\n");
        stringBuilder.append(simulationRequestsManager_instance.displayRequestsNameCurrentHour());
        return stringBuilder.toString();
    }

    /**
     * TODO
     */
    @Override
    protected void handleOptions() throws IOException {
        int input = super.userInputManager_instance.readOptionInteger(1, simulationRequestsManager_instance.getNbRequestsCurrentHour());
        simulationRequestsManager_instance.startRequest(input);
        System.out.println("Request done we go back to main menu");
        super.goToMainMenu();
    }
}
