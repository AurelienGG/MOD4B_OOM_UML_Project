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

    private boolean blocked;
    private int timeBlocked;

    /**
     * TODO
     */
    protected Runway() {
        this.occupied = false;
        this.holderPlane = null;
        this.blocked = false;
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
     */
    protected void increasePlaneHoursRunwayNeeded() {
        if(this.isOccupied())
            holderPlane.increaseHoursRunwayNeeded();
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

    /**
     * Block the runway for a set period of time
     * @param hoursBlocked the time in hour the runway is blocked
     */
    protected void blockRunway(int hoursBlocked) {
        //TODO
    }
}
