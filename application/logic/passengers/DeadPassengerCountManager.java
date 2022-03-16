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

    /**
     * Constructor of Dead Passenger Count Manager
     */
    private DeadPassengerCountManager() {
        this.nbDeadPassengers = 0;
    }

    /**
     * get the singleton of the instance of the Dead Passenger Count Manager
     * @return deadPassengerCountManager_instance the singleton of the instance of the Dead Passenger Count Manager
     */
    public static DeadPassengerCountManager getInstance() {
        if (deadPassengerCountManager_instance == null)
            deadPassengerCountManager_instance = new DeadPassengerCountManager();
        return deadPassengerCountManager_instance;
    }

    /**
     * Get the number of dead passengers
     * @return the number of dead passengers
     */
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
        nbDeadPassengers -= nbRescuedPassengers;

    }
}
