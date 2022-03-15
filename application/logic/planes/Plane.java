package logic.planes;

/**
 * Class for the plane object
 *
 * @author Emmie
 * @author Aurélien
 */
public class Plane {

    private PlaneType planeType;
    private String name;
    private int hoursFuelLeft;
    private int hoursRunwayNeeded;
    private int nbPassengers;

    public Plane(PlaneType planeType, String name, int hoursFuelLeft, int hoursRunwayNeeded, int nbPassengers) {
        //TODO
    }

    public PlaneType getPlaneType() {
        return planeType;
    }

    public String getName() {
        return name;
    }

    public int getHoursFuelLeft() {
        return hoursFuelLeft;
    }

    public int getHoursRunwayNeeded() {
        return hoursRunwayNeeded;
    }

    public int getNbPassengers() {
        return nbPassengers;
    }

    public void decreaseFuelLeft() {
        //TODO
    }

    public void decreaseHoursRunwayNeeded() {
        //TODO
    }

    public String displayPlane() {
        //TODO
        return "Plane{" +
                "planeType=" + planeType +
                ", name='" + name + '\'' +
                ", hoursFuelLeft=" + hoursFuelLeft +
                ", hoursRunwayNeeded=" + hoursRunwayNeeded +
                ", nbPassengers=" + nbPassengers +
                '}';
    }

}
