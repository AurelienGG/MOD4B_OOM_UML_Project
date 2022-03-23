package logic.runways;

import logic.planes.Plane;

import java.util.ArrayList;

/**
 * Manage the program runways
 *
 * @author Emmie
 * @author Aurélien
 */
public class RunwayManager {

    private static RunwayManager runwayManager_instance = null;
    private ArrayList<Runway> runways;

    private final int INFINITY = 30;
    private final int NB_RUNWAYS = 8;

    /**
     * Constructor the Runway Manager
     */
    private RunwayManager() {
        this.runways =  new ArrayList<>(NB_RUNWAYS);
        for(int i = 0; i < NB_RUNWAYS; i++)
            runways.add(new Runway());
    }

    /**
     * get the singleton of the instance of the Runway Manager
     * @return runwayManager_instance the singleton of the instance of the Runway Manager
     */
    public static RunwayManager getInstance() {
        if (runwayManager_instance == null)
            runwayManager_instance = new RunwayManager();
        return runwayManager_instance;
    }

    /**
     *
     * @return
     */
    public String displayRunway() {
       StringBuilder stringBuilder = new StringBuilder("\t\tRunway id, Name, Occupied time remaining");
       int idRunway = 0;
       for(Runway runway: runways)
           stringBuilder.append("\t\tR" + idRunway++ + " " + runway.getOccupantName() + " " + runway.getTimeBlocked());
       return stringBuilder.toString();
    }

    /**
     * Make the plane land on a free runway
     * @param plane the landing plane
     */
    public void planeLandOnFreeRunway(Plane plane) {
        for(Runway r : runways)
            if(r.getRunwayStatus()==RunwayStatus.FREE) {
                r.planeLand(plane);
                break;
            }
    }

    /**
     * Hourly checks for runways,
     * Decrease the time refueling,
     * Check if planes can leave
     * Make planes leaves
     */
    public void runwayAdvanceHourAll() {
        for (Runway r : runways)
            r.runwayAdvanceHour();
    }

    /**
     * For all the runways check if they are occupied
     * @return the number of occupied runways
     */
    public int getNbFullRunway() {
        int nbFullRunway = 0;
        for(Runway r : runways)
            if(!(r.getRunwayStatus()==RunwayStatus.FREE))
                nbFullRunway++;
        return nbFullRunway;
    }

    /**
     * For all the runways check if they are free
     * @return the number of free runways
     */
    public int getNbFreeRunway() {
        int nbFreeRunway = 0;
        for(Runway r : runways)
            if(r.getRunwayStatus()==RunwayStatus.FREE)
                nbFreeRunway++;
        return nbFreeRunway;
    }

    /**
     * Empty 1 random runway
     */
    public void emptyRandomRunway() {
        for(Runway r : runways)
            if(!(r.getRunwayStatus()==RunwayStatus.FREE)){
                r.emptyRunway();
                break;
            }
    }

    /**
     * Remove a runway
     */
    public void removeRunway() {
        for(Runway r : runways)
            if(r.getRunwayStatus()==RunwayStatus.FREE){
                r.blockRunway("CLOSED",INFINITY);
                break;
            }
    }

    /**
     * For every plane in a runway add more wait time
     * @param hoursToWait the added time to wait
     */
    public void addTimeBlockedAllPlanes(int hoursToWait) {
        for(Runway r : runways)
            if(r.getRunwayStatus()==RunwayStatus.OCCUPIED)
                r.increaseTimeBlocked(hoursToWait);

    }

    /**
     * Block a free runway
     * @param occupantName
     * @param hoursBlocked
     */
    public void blockFreeRunway(String occupantName, int hoursBlocked) {
        for(Runway r : runways)
            if(r.getRunwayStatus()==RunwayStatus.FREE){
                r.blockRunway(occupantName,hoursBlocked);
                break;
            }
    }
}
