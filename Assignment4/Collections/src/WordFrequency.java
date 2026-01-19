import java.io.*;
import java.util.*;

public class WordFrequency {

    public static void main(String[] args) {

        // Map to store word -> frequency
        Map<String, Integer> wordCount = new HashMap<>();
        try (BufferedReader br = new BufferedReader(new FileReader("story.txt"))) {

            String line;

            while ((line = br.readLine()) != null) {

                // Trim and skip empty lines
                line = line.trim();
                if (line.isEmpty()) {
                    continue;
                }

                // Convert to lowercase and remove punctuation
                line = line.toLowerCase().replaceAll("[^a-z\\s]", "");

                // Split into words
                String[] words = line.split("\\s+");

                // Count frequency
                for (String word : words) {
                    if (!word.isEmpty()) {
                        wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
                    }
                }
            }

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
            return;
        }

        // Print result
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.println(entry.getKey() + " appears " + entry.getValue() + " times");
        }
    }
}
