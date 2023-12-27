import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) {
        String sentence = "To be or not to be";
        String[] words = sentence.split("\\s+");

        Map<String, Integer> wordFrequencyMap = new HashMap<>();

        for (String word : words) {
            String lowercaseWord = word.toLowerCase();
            wordFrequencyMap.put(lowercaseWord, wordFrequencyMap.getOrDefault(lowercaseWord, 0) + 1);
        }

        for(String word :words) {
            wordFrequencyMap.put(word,wordFrequencyMap.getOrDefault(word,1) +1) ;
       }

        for (Map.Entry<String, Integer> entry : wordFrequencyMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
