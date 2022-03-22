package logic.hour;

/**
 * TODO
 */
public class HourManager {

    private static HourManager hourManager_instance = null;
    private int hour;

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
    public int getHour() {
        return this.hour;
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
