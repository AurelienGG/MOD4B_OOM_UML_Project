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
     * Constructor of the plane
     * @param planeType the type of the plane
     * @param name the name of the plane
     * @param hoursFuelLeft the hours fuel left of the plane
     * @param hoursRunwayNeeded the hours runway needed of the plane
     * @param nbPassengers the number of passengers of the plane
     */
    public Plane(PlaneType planeType, String name, int hoursFuelLeft, int hoursRunwayNeeded, int nbPassengers) {
        this.planeType=planeType;
        this.name=name;
        this.hoursFuelLeft=hoursFuelLeft;
        this.hoursRunwayNeeded=hoursRunwayNeeded;
        this.nbPassengers=nbPassengers;
    }

    /**
     * get the type of the plane
     * @return the type of the plane
     */
    public PlaneType getPlaneType() {
        return planeType;
    }

    /**
     * get the name of the plane
     * @return the name of the plane
     */
    public String getName() {
        return name;
    }

    /**
     * get the hours fuel left of the plane
     * @return the hours fuel left of the plane
     */
    public int getHoursFuelLeft() {
        return hoursFuelLeft;
    }

    /**
     * get the hours runway needed of the plane
     * @return the hours runway needed of the plane
     */
    public int getHoursRunwayNeeded() {
        return hoursRunwayNeeded;
    }

    /**
     * get the number of passengers of the plane
     * @return the number of passengers of the plane
     */
    public int getNbPassengers() {
        return nbPassengers;
    }

    /**
     * decrease the hours fuel left of the plane by 1
     */
    public void decreaseFuelLeft() {
        this.hoursFuelLeft--;
    }

    /**
     * increase the hours fuel left of the plane by the amount of fuel
     * @param fuel the number of hours that must be increase
     */
    public void increaseFuelLeft(int fuel) {
        this.hoursFuelLeft+=fuel;
    }

    /**
     * decrease the hours runway needed of the plane by 1
     */
    public void decreaseHoursRunwayNeeded() {
        this.hoursRunwayNeeded--;
    }

    /**
     * increase the hours runway needed of the plane by 1
     */
    public void increaseHoursRunwayNeeded() {
        this.hoursRunwayNeeded++;
    }

    /**
     * show the information of the plane
     * @return a string with the information of the plane
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
