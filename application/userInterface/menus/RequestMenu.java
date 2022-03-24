package userInterface.menus;

import logic.simulationRequests.SimulationRequestsManager;
import userInterface.UserInputManager;

import java.io.IOException;

/**
 * TODO
 */
public class RequestMenu extends Menu {

    /**
     * TODO
     * @throws IOException
     */
    public RequestMenu() throws IOException {
        super(MenuType.REQUEST);
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
        stringBuilder.append(SimulationRequestsManager.getInstance().displayRequestsNameCurrentHour());
        return stringBuilder.toString();
    }

    /**
     * TODO
     */
    @Override
    protected void handleOptions() throws IOException {
        int input = UserInputManager.getInstance().readOptionInteger(1, SimulationRequestsManager.getInstance().getNbRequestsCurrentHour());
        SimulationRequestsManager.getInstance().startRequestCurrentHour(input);
        System.out.println("Request done we go back to main menu");
        super.goToMainMenu();
    }

    /**
     * TODO
     */
    private void doRequest() {
    }
}
