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
        //TODO
    }

    public void planeLand(Plane plane) {
        //TODO
    }

    public void decreasePlaneHoursRunwayNeeded() {
        //TODO
    }

    public String displayRunway() {
        //TODO
        return "Runway{" +
                "occupied=" + occupied +
                ", holderPlane=" + holderPlane +
                '}';
    }

    private void checkPlaneFuelLevel() {
        //TODO
    }

    private void planeLeave() {
        //TODO
    }
}
