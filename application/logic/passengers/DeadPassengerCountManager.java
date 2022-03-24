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
    private int nbDeadPassengersCurrentHour;

    public static final int NB_MAX_PASSENGERS_DEAD = 350;

    /**
     * Constructor of Dead Passenger Count Manager
     */
    private DeadPassengerCountManager() {
        this.nbDeadPassengers = 0;
        this.nbDeadPassengersCurrentHour = 0;
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
     * TODO
     * @return
     */
    public boolean isGameOver() {
        return nbDeadPassengers == NB_MAX_PASSENGERS_DEAD;
    }

    /**
     * TODO
     * @return
     */
    public void advanceHourPassengers() {
        nbDeadPassengers += nbDeadPassengersCurrentHour;
        nbDeadPassengersCurrentHour = 0;
    }

    /**
     * Get the number of dead passengers
     * @return the number of dead passengers
     */
    public int getNbDeadPassengers() {
        return nbDeadPassengers;
    }

    /**
     * TODO
     * @return
     */
    public int getNbDeadPassengersCurrentHour() {
        return nbDeadPassengersCurrentHour;
    }

    /**
     * Add the number of dead passengers to the count
     * @param nbDeadPassengersFromCrash the number of passengers dead from the crash
     */
    public void addDeadPassengers(int nbDeadPassengersFromCrash) {
        nbDeadPassengersCurrentHour += nbDeadPassengersFromCrash;
    }

    /**
     * Decrease the number of dead passengers to the count
     * @param nbRescuedPassengers the number of passengers rescued from the crash
     */
    public void decreaseDeadPassengers(int nbRescuedPassengers) {
        nbDeadPassengersCurrentHour -= nbRescuedPassengers;
    }
}
