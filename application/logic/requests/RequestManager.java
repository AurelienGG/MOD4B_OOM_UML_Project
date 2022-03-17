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

    private RequestManager() {
        this.requestDictionary = new EnumMap<>(RequestType.class);


    }

    public static RequestManager getInstance() {
        if (requestManager_instance == null)
            requestManager_instance = new RequestManager();
        return requestManager_instance;
    }

    public Request generateRandomRequest() {
        //TODO
        return null;
    }

}
