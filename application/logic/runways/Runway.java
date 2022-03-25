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
     * TODO
     * @return
     */
    public String getOccupantName() {
        return occupantName;
    }

    /**
     * TODO
     * @return
     */
    public int getTimeBlocked() {
        return timeBlocked;
    }

    /**
     * Hourly checks for a runway,
     * Decrease the time refueling,
     * Check if plane can leave
     * Make plane leaves
     */
    public void advanceHourRunway() {
        if((runwayStatus != RunwayStatus.FREE)) {
            decreaseTimeBlocked();
            if(checkTimeBlocked())
                emptyRunway();
        }
    }

    /**
     * TODO
     */
    protected void decreaseTimeBlocked() {
        if(this.runwayStatus != RunwayStatus.FREE)
            this.timeBlocked--;
    }

    /**
     * TODO
     */
    protected void increaseTimeBlocked(int hoursTimeBlocked) {
        if(this.runwayStatus == RunwayStatus.OCCUPIED)
            this.timeBlocked+=hoursTimeBlocked;
    }

    /**
     * TODO
     * @return
     */
    protected String displayRunway() {
        if(runwayStatus == RunwayStatus.FREE)
            return "Runway is Free";
        else
            return this.occupantName + " \t " + this.timeBlocked;
    }

    /**
     * TODO IS IT USEFUL ?
     * Check the hours left for completing the fueling
     * @return true if time is over
     * or false if its still need time
     */
    private boolean checkTimeBlocked() {
        if(this.runwayStatus != RunwayStatus.FREE && this.timeBlocked <= 0)
            return true;
        else
            return false;
    }

    /**
     * TODO
     */
    protected void emptyRunway() {
        this.runwayStatus = RunwayStatus.FREE;
        this.timeBlocked = 0;
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

    /**
     * @return the status of the runway
     */
    protected RunwayStatus getRunwayStatus() {
        return this.runwayStatus;
    }
}
