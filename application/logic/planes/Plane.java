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

    /**
     * TODO
     * @param planeType
     * @param name
     * @param hoursFuelLeft
     * @param hoursRunwayNeeded
     * @param nbPassengers
     */
    public Plane(PlaneType planeType, String name, int hoursFuelLeft, int hoursRunwayNeeded, int nbPassengers) {
        this.planeType=planeType;
        this.name=name;
        this.hoursFuelLeft=hoursFuelLeft;
        this.hoursRunwayNeeded=hoursRunwayNeeded;
        this.nbPassengers=nbPassengers;
    }

    /**
     * TODO
     * @return
     */
    public PlaneType getPlaneType() {
        return planeType;
    }

    /**
     * TODO
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * TODO
     * @return
     */
    public int getHoursFuelLeft() {
        return hoursFuelLeft;
    }

    /**
     * TODO
     * @return
     */
    public int getHoursRunwayNeeded() {
        return hoursRunwayNeeded;
    }

    /**
     * TODO
     * @return
     */
    public int getNbPassengers() {
        return nbPassengers;
    }

    /**
     * TODO
     */
    public void decreaseFuelLeft() {
        this.hoursFuelLeft--;
    }

    /**
     * TODO
     */
    public void decreaseHoursRunwayNeeded() {
        this.hoursRunwayNeeded--;
    }

    /**
     * TODO
     */
    public void increaseHoursRunwayNeeded() {
        this.hoursRunwayNeeded++;
    }

    /**
     * TODO
     * @return
     */
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
