package logic.requests;

import logic.Tools;
import logic.options.CrossWinds;
import logic.options.IceStorm;
import logic.options.IcyRunWays;
import logic.options.Option;

import javax.tools.Tool;
import java.util.EnumMap;

/**
 * Manage program's requests
 *
 * @author Chloé A
 * @author Aurélien
 */
public class RequestManager {

    private static RequestManager requestManager_instance = null;
    EnumMap<RequestType, Request> requestDictionary;
    EnumMap<RequestType, Double> requestRarityDictionary;

    /**
     * TODO
     */
    private RequestManager() {
        this.requestDictionary = new EnumMap<>(RequestType.class);


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
    public Request generateRandomRequest() {
        int random = Tools.generateRandomNumber(1, 100);
        if(random <= 40)
            return new PlaneLanding();
        else if (random <= 45)
            return new EmergencyLanding();

        else if (random <= 55)
            return new FundingEvent();

        else if (random <= 70)
            return new JumboJet();

        else if (random <= 80)
            return new BadWeather();

        else if (random <= 90)
            return new SnakesOnThePlane();

        else if (random <= 95)
            return new Protests();

        else if (random <= 100)
            return new JohnMcClain();

    }

}
