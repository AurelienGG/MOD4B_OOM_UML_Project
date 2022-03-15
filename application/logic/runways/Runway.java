package logic.runways;

import logic.planes.Plane;

/**
 * Class for the runway object
 *
 * @author Emmie
 * @author Aurélien
 */
public class Runway {

    private boolean occupied;
    private Plane holderPlane;

    public Runway() {
        this.occupied=false;
        this.holderPlane=null;
    }

    public void planeLand(Plane plane) {
        this.holderPlane=plane;
        this.occupied=true;
    }

    public void decreasePlaneHoursRunwayNeeded() {
        holderPlane.decreaseHoursRunwayNeeded();
    }

    public String displayRunway() {
        //TODO
        return "Runway{" +
                "occupied=" + occupied +
                ", holderPlane=" + holderPlane +
                '}';
    }

    /**
     * Check the hours left for completing the fueling
     * @return the plane if its full
     * or null if its still need time
     */
    private Plane checkPlaneFuelLevel() { //TODO
        return (holderPlane.getHoursFuelLeft()>0);
    }

    private void planeLeave() {
        this.holderPlane=null;
        this.occupied=false;
    }
}
