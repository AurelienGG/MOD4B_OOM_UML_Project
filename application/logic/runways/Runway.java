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

    /**
     * TODO
     */
    protected Runway() {
        this.occupied=false;
        this.holderPlane=null;
    }

    /**
     * TODO
     * @param plane
     */
    protected void planeLand(Plane plane) {
        this.holderPlane=plane;
        this.occupied=true;
    }

    /**
     * TODO
     */
    protected void decreasePlaneHoursRunwayNeeded() {
        if(this.isOccupied())
            holderPlane.decreaseHoursRunwayNeeded();
    }

    /**
     * TODO
     * @return
     */
    protected String displayRunway() {
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
    private Plane checkPlaneFuelLevel() {
        if(this.isOccupied() && holderPlane.getHoursFuelLeft() <= 0)
            return this.holderPlane;
        else
            return null;
    }

    /**
     * TODO
     */
    private void planeLeave() {
        this.holderPlane=null;
        this.occupied=false;
    }

    /**
     * TODO
     * @return
     */
    protected boolean isOccupied(){
        return this.occupied;
    }

    /**
     * Add more wait time to the plane holding the runway
     * @param hoursToWait the added time to wait
     */
    protected void addWaitTime(int hoursToWait) {
        //TODO
    }
}
