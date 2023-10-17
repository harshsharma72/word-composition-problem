import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class WordCompositionProblem{

    public static void main(String[] args) {
        String inputFileName = "Input_01.txt"; // Change this to "Input_02.txt" for the larger file
        long startTime = System.currentTimeMillis();
        
        List<String> words = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                words.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }

        Collections.sort(words, Comparator.comparingInt(String::length));

        Set<String> compoundWords = new HashSet<>();
        String longestCompound = "";
        String secondLongestCompound = "";

        for (String word : words) {
            if (isCompoundWord(word, compoundWords)) {
                if (word.length() > longestCompound.length()) {
                    secondLongestCompound = longestCompound;
                    longestCompound = word;
                } else if (word.length() > secondLongestCompound.length()) {
                    secondLongestCompound = word;
                }
                compoundWords.add(word);
            }
        }

        long endTime = System.currentTimeMillis();
        long totalTime = endTime - startTime;

        System.out.println("1. Longest Compound Word: " + longestCompound);
        System.out.println("2. Second Longest Compound Word: " + secondLongestCompound);
        System.out.println("Time taken to process the input file: " + totalTime + " milliseconds");
    }

    private static boolean isCompoundWord(String word, Set<String> dictionary) {
        for (int i = 1; i < word.length(); i++) {
            String prefix = word.substring(0, i);
            String suffix = word.substring(i);
            if (dictionary.contains(prefix) && (dictionary.contains(suffix) || isCompoundWord(suffix, dictionary))) {
                return true;
            }
        }
        return false;
    }
}