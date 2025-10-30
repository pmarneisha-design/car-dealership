import java.io.BufferedReader;
import java.io.FileNotFoundException;

public class DealershipFileManager {
    public class DealershipFileManager {
        public Dealership getDealership() {
            String fileName = "src/main/resources/inventory.csv";

            try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            } catch (FileNotFoundException e) {
    }
}
