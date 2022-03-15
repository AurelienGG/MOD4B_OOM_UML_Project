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

        Stack<Plane> commonStack = new Stack<>();
        Stack<Plane> emergencyStack = new Stack<>();
        Stack<Plane> jumboStack = new Stack<>();

        for(int i = 99; i > 0; i--) {
            commonStack.push(generateCommonPlane(i));
            emergencyStack.push(generateEmergencyPlane(i));
            jumboStack.push(generateJumboPlane(i));
        }

        this.planesDictionary.put(PlaneType.COMMON, commonStack);
        this.planesDictionary.put(PlaneType.EMERGENCY, emergencyStack);
        this.planesDictionary.put(PlaneType.JUMBO, jumboStack);
    }

    public PlaneManager getInstance() {
        if (planeManager_instance == null)
            planeManager_instance = new PlaneManager();
        return planeManager_instance;
    }

    private Plane generateCommonPlane(int planeID) {
        return new Plane(PlaneType.COMMON,
                "CommonPlane" + planeID,
                generateRandomNumber(3, 5),
                generateRandomNumber(1, 4),
                generateRandomNumber(100, 500));
    }

    private Plane generateEmergencyPlane(int planeID) {
        //TODO
        return null;
    }

    private Plane generateJumboPlane(int planeID) {
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
