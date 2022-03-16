package logic.runways;

import logic.planes.Plane;

/**
 * Class for the runway object
 *
 * @author Emmie
 * @author Aurélien
 */
public class Runway {

    private RunwayStatus runwayStatus;
    private String occupantName;
    private int timeBlocked;

    /**
     * TODO
     */
    protected Runway() {
        this.runwayStatus = RunwayStatus.FREE;
        this.occupantName = null;
        this.timeBlocked = 0;
    }

    /**
     * TODO
     * @param plane
     */
    protected void planeLand(Plane plane) {
        this.runwayStatus = RunwayStatus.OCCUPIED;
        this.occupantName = plane.getName();
        this.timeBlocked = plane.getHoursRunwayNeeded();
    }

    /**
     * Hourly checks for a runway,
     * Decrease the time refueling,
     * Check if plane can leave
     * Make plane leaves
     */
    public void RunwayAdvanceHour() {
        //TODO
    }

    /**
     * TODO
     */
    protected void decreasePlaneHoursRunwayNeeded() {
        if(this.runwayStatus == RunwayStatus.OCCUPIED)
            this.timeBlocked--;
    }

    /**
     * TODO
     */
    protected void increasePlaneHoursRunwayNeeded() {
        if(this.runwayStatus == RunwayStatus.OCCUPIED)
            this.timeBlocked++;
    }

    /**
     * TODO
     * @return
     */
    protected String displayRunway() {
        //TODO
        return "Runway";
    }

    /**
     * TODO IS IT USEFULL ?
     * Check the hours left for completing the fueling
     * @return the plane if its full
     * or null if its still need time
     */
    private Plane checkPlaneFuelLevel() {
        if(this.runwayStatus == RunwayStatus.OCCUPIED && this.timeBlocked <= 0)
            return null;
        else
            return null;
    }

    /**
     * TODO
     */
    private void planeLeave() {
        this.runwayStatus = RunwayStatus.FREE;
        this.timeBlocked = 0;
    }

    /**
     * Add more wait time to the plane holding the runway
     * @param hoursToWait the added time to wait
     */
    protected void addWaitTime(int hoursToWait) {
        //TODO
    }

    /**
     * * Block the runway for a set period of time
     * @param occupantName the name of the occupant
     * @param hoursBlocked the time in hour the runway is blocked
     */
    protected void blockRunway(String occupantName, int hoursBlocked) {
        //TODO
    }
}
