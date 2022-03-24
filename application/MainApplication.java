import java.io.IOException;
import java.util.Scanner;

public class MainApplication {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        Simulation simulation = new Simulation(scanner);
        simulation.start();
    }
}
