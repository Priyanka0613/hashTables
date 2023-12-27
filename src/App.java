import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) {
        String sentence = "Paranoids are not paranoid because they are paranoid but because they keep putting themselves deliberately into paranoid avoidable situations";
        String[] words = sentence.split("\\s+");

        Map<String, Integer> wordFrequencyMap = new HashMap<>();

        for (String word : words) {
            String lowercaseWord = word.toLowerCase();
            wordFrequencyMap.put(lowercaseWord, wordFrequencyMap.getOrDefault(lowercaseWord, 0) +1);
        }

        for (Map.Entry<String, Integer> entry : wordFrequencyMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
