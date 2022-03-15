package logic.planes;

import java.util.EnumMap;
import java.util.Stack;

/**
 * Manage the program planes
 *
 * @author Emmie
 * @author Aurélien
 */
public class PlaneManager {

    private static PlaneManager planeManager_instance = null;

    private EnumMap<PlaneType, Stack<Plane>> planesDictionary;

    private PlaneManager() {
        EnumMap<PlaneType, Stack<Plane>> planesDictionary =  new EnumMap<>(PlaneType.class);
        //TODO
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

    /**
     * Generate a random number
     * @param minimum minimum value
     * @param maximum maximum value
     * @return a random number between 2 values
     */
    private int generateRandomNumber(int minimum, int maximum) {
        //TODO
        return 0;
    }
}
