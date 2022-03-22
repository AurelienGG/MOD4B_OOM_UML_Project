package logic.planes;

import logic.Tools;

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

    /**
     * Constructor of Plane Manager
     */
    private PlaneManager() {
        this.planesDictionary =  new EnumMap<>(PlaneType.class);

        Stack<Plane> commonStack = new Stack<>();
        Stack<Plane> emergencyStack = new Stack<>();
        Stack<Plane> jumboStack = new Stack<>();
        Stack<Plane> snakesStack = new Stack<>();

        for(int i = 99; i > 0; i--) {
            commonStack.push(generateCommonPlane(i));
            emergencyStack.push(generateEmergencyPlane(i));
            jumboStack.push(generateJumboPlane(i));
            snakesStack.push(generateSnakePlane(i));
        }

        this.planesDictionary.put(PlaneType.COMMON, commonStack);
        this.planesDictionary.put(PlaneType.EMERGENCY, emergencyStack);
        this.planesDictionary.put(PlaneType.JUMBO, jumboStack);
        this.planesDictionary.put(PlaneType.SNAKES,snakesStack);
    }

    /**
     * get the singleton of the instance of the Plane Manager
     * @return planeManager_instance the singleton of the instance of the Plane Manager
     */
    public static PlaneManager getInstance() {
        if (planeManager_instance == null)
            planeManager_instance = new PlaneManager();
        return planeManager_instance;
    }

    /**
     * Create a common plane
     * @param planeID the id of the plane to create
     * @return the new common plane created
     */
    private Plane generateCommonPlane(int planeID) {
        return new Plane(PlaneType.COMMON,
                "CommonPlane" + planeID,
                Tools.generateRandomNumber(3, 5),
                Tools.generateRandomNumber(1, 4),
                Tools.generateRandomNumber(100, 500));
    }

    /**
     * Create a emergency plane
     * @param planeID the id of the plane to create
     * @return the new emergency plane created
     */
    private Plane generateEmergencyPlane(int planeID) {
        return new Plane(PlaneType.EMERGENCY,
                "EmergencyPlane" + planeID,
                Tools.generateRandomNumber(1,3),
                Tools.generateRandomNumber(3,5),
                Tools.generateRandomNumber(100, 500));
    }

    /**
     * Create a jumbo plane
     * @param planeID the id of the plane to create
     * @return the new jumbo plane created
     */
    private Plane generateJumboPlane(int planeID) {
        return new Plane(PlaneType.JUMBO,
                "JumboJet" + planeID,
                Tools.generateRandomNumber(4,6),
                Tools.generateRandomNumber(1,4),
                Tools.generateRandomNumber(300,600));
    }

    /**
     * Create a snake plane
     * @param planeID the id of the plane to create
     * @return the new snake plane created
     */
    private Plane generateSnakePlane(int planeID) {
        return new Plane(PlaneType.SNAKES,
                "SnakesOnThePlane" + planeID,
                0,
                7,
                0);
    }

    /**
     * Give a common plane with random values
     * @return a common plane from the planesDictionary
     */
    public Plane giveCommonPlane() {
        return planesDictionary.get(PlaneType.COMMON).pop();
    }

    /**
     * Give an emergency plane with random values
     * @return an emergency plane from the planesDictionary
     */
    public Plane giveEmergencyPlane() {
        return planesDictionary.get(PlaneType.EMERGENCY).pop();
    }

    /**
     * Give a jumbo jet with random values
     * @return a jumbo jet from the planesDictionary
     */
    public Plane giveJumboPlane() {
        return planesDictionary.get(PlaneType.JUMBO).pop();
    }

    /**
     * Give a snakes plane with random values
     * @return a snakes plane from the planesDictionary
     */
    public Plane giveSnakesPlane() {
        return planesDictionary.get(PlaneType.SNAKES).pop();
    }

}
