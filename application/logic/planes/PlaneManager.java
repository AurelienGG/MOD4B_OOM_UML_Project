package logic.planes;

import java.util.EnumMap;
import java.util.Stack;

public class PlaneManager {

    private static PlaneManager planeManager_instance = null;

    private EnumMap<PlaneType, Stack<Plane>> planesDictionary;

    private PlaneManager() {
        //TODO
        EnumMap<PlaneType, Stack<Plane>> planesDictionary =  new EnumMap<>(PlaneType.class);
    }

    public PlaneManager getInstance() {
        if (planeManager_instance == null)
            planeManager_instance = new PlaneManager();
        return planeManager_instance;
    }

    private Plane generateCommonPlane() {
        //TODO
        return null;
    }

    private Plane generateEmergencyPlane() {
        //TODO
        return null;
    }

    private Plane generateJumboPlane() {
        //TODO
        return null;
    }
}
