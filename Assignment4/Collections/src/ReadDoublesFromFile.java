import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class ReadDoublesFromFile {
    public static void main(String[] args) {
        List<Double> values = new ArrayList<>();
        File file = new File("Assignment4/data.txt");
        try (Scanner sc = new Scanner(file)) {
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                try {
                    double num = Double.parseDouble(line);
                    values.add(num);
                } catch (NumberFormatException e) {
                    System.out.println("Invalid number skipped: " + line);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
            return;
        }
        if (values.isEmpty()) {
            System.out.println("No valid numeric values found in file");
            return;
        }
        double max = values.get(0);
        for (double d : values) {
            if (d > max) {
                max = d;
            }
        }
        System.out.println("Largest value: " + max);
    }
}
