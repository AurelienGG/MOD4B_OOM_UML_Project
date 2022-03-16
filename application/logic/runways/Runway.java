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
    public void runwayAdvanceHour() {
        if(!(runwayStatus ==RunwayStatus.FREE)){
            decreaseTimeBlocked();
            if(checkTimeBlocked())
                emptyRunway();
        }
    }

    /**
     * TODO
     */
    protected void decreaseTimeBlocked() {
        if(this.runwayStatus == RunwayStatus.OCCUPIED)
            this.timeBlocked--;
    }

    /**
     * TODO
     */
    protected void increaseTimeBlocked() {
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
     * TODO IS IT USEFUL ?
     * Check the hours left for completing the fueling
     * @return true if time is over
     * or false if its still need time
     */
    private boolean checkTimeBlocked() {
        if(this.runwayStatus == RunwayStatus.OCCUPIED && this.timeBlocked <= 0)
            return true;
        else
            return false;
    }

    /**
     * TODO
     */
    private void emptyRunway() {
        this.runwayStatus = RunwayStatus.FREE;
        this.timeBlocked = 0;
    }

    /**
     * Add more wait time to the plane holding the runway
     * @param hoursToWait the added time to wait
     */
    protected void addTimeBlocked(int hoursToWait) {
        this.timeBlocked+=hoursToWait;
    }

    /**
     * * Block the runway for a set period of time
     * @param occupantName the name of the occupant
     * @param hoursBlocked the time in hour the runway is blocked
     */
    protected void blockRunway(String occupantName, int hoursBlocked) {
        this.runwayStatus=RunwayStatus.BLOCKED;
        this.occupantName=occupantName;
        this.timeBlocked=hoursBlocked;
    }
}
