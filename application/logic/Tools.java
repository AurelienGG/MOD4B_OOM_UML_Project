package logic;

public class Tools {

    /**
     * Generate a random number
     * @param minimum minimum value
     * @param maximum maximum value
     * @return a random number between 2 values
     */
    public static int generateRandomNumber(int minimum, int maximum) {
        return (int) (Math.random() * ((maximum - minimum) + 1)) + minimum;
    }
}
