package logic.requests;

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
        //TODO
        return null;
    }

}
