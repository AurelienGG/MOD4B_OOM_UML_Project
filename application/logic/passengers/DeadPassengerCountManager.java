package logic.passengers;

/**
 * Manage program's number of dead passengers count
 *
 * @author Chloé A
 * @author Aurélien
 */
public class DeadPassengerCountManager {

    private static DeadPassengerCountManager deadPassengerCountManager_instance = null;
    private int nbDeadPassengers;

    private DeadPassengerCountManager() {
        this.nbDeadPassengers = 0;
    }

    public static DeadPassengerCountManager getInstance() {
        if (deadPassengerCountManager_instance == null)
            deadPassengerCountManager_instance = new DeadPassengerCountManager();
        return deadPassengerCountManager_instance;
    }

    public int getNbDeadPassengers() {
        return nbDeadPassengers;
    }

    /**
     * Add the number of dead passengers to the count
     * @param nbDeadPassengersFromCrash the number of passengers dead from the crash
     */
    public void addDeadPassengers(int nbDeadPassengersFromCrash) {
        nbDeadPassengers += nbDeadPassengersFromCrash;
    }

    /**
     * Decrease the number of dead passengers to the count
     * @param nbRescuedPassengers the number of passengers rescued from the crash
     */
    public void decreaseDeadPassengers(int nbRescuedPassengers) {
        //TODO
    }
}
