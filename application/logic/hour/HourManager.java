package logic.hour;

/**
 * TODO
 */
public class HourManager {

    private static HourManager hourManager_instance = null;
    private int hour;

    public static final int LAST_HOUR = 24;

    /**
     * TODO
     */
    private HourManager() {
        this.hour = 0;
    }

    /**
     * TODO
     * @return
     */
    public static HourManager getInstance() {
        if (hourManager_instance == null)
            hourManager_instance = new HourManager();
        return hourManager_instance;
    }

    /**
     * TODO
     * @return
     */
    public void advanceHourHour() {
       increaseHour();
    }

    /**
     * TODO
     * @return
     */
    public int getHour() {
        return this.hour;
    }

    /**
     * TODO
     * @return
     */
    public boolean isLastHour() {
        // >= 24 or > 24
        // total hour = 24 or 25 ?
        return this.hour >= LAST_HOUR;
    }

    /**
     * TODO
     */
    public void increaseHour() {
        this.hour++;
    }

    /**
     * TODO
     * @return
     */
    public String displayHour() {
        return this.hour + "h00";
    }
}
