package logic.planes;

public class Plane {

    private PlaneType planeType;
    private String name;
    private int hoursFuelLeft;
    private int hoursRunwayNeeded;
    private int nbPassengers;

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
