package logic.requests;

import logic.Tools;
import logic.planes.Plane;
import logic.planes.PlaneManager;
import logic.planes.PlaneType;

import java.util.EnumMap;
import java.util.Stack;

/**
 * Manage program's requests
 *
 * @author Chloé A
 * @author Aurélien
 */
public class RequestManager {

    private static RequestManager requestManager_instance = null;
    private Stack<Request> requestsStack;
    //EnumMap<RequestType, Request> requestDictionary;
    //EnumMap<RequestType, Double> requestRarityDictionary;

    // TODO fix hard code, use (NB_HOURS * NB_MAX_REQUESTS)
    // TODO maybe a class GameSettings with static final fields
    private static final int NB_REQUESTS_MAX = 100;

    /**
     * TODO
     */
    private RequestManager() {
        this.requestsStack = new Stack<>();
        for(int i = 0; i < NB_REQUESTS_MAX; i++)
            this.requestsStack.add(generateRandomRequest());
    }

    /**
     * TODO
     * @return
     */
    public static RequestManager getInstance() {
        if (requestManager_instance == null)
            requestManager_instance = new RequestManager();
        return requestManager_instance;
    }

    /**
     * TODO
     * @return
     */
    private Request generateRandomRequest() {
        int random = Tools.generateRandomNumber(1, 100);
        if(random <= 40)
            //TODO delete
            //System.out.println("Nb Plane RequestManager generateRandomRequest = " + PlaneManager.getInstance().getNbCommonPlane());
            return new PlaneLanding(PlaneManager.getInstance().giveCommonPlane());
        else if (random <= 45)
            return new EmergencyLanding(PlaneManager.getInstance().giveEmergencyPlane());
        else if (random <= 55)
            return new FundingEvent();
        else if (random <= 70)
            return new JumboJet(PlaneManager.getInstance().giveJumboPlane());
        else if (random <= 80)
            return new BadWeather();
        else if (random <= 90)
            return new SnakesOnThePlane(PlaneManager.getInstance().giveSnakesPlane());
        else if (random <= 95)
            return new Protests();
        else if (random <= 100)
            return new JohnMcClain();
        else
            // If for some reason we get here, Plane Landing will be the default request
            return new PlaneLanding(PlaneManager.getInstance().giveCommonPlane());
    }

    /**
     * Give a request which was generated randomly
     * @return a request from the requestsStack
     */
    public Request giveRequest() {
        return this.requestsStack.pop();
    }


}
