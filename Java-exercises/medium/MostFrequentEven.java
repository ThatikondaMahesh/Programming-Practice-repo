import java.util.HashMap;
import java.util.Map;

public class MostFrequentEven {

    public static Integer mostFrequentEven(int[] arr) {
        Map<Integer, Integer> frequency = new HashMap<>();
        
        for (int num : arr) {
            if (num % 2 == 0) { // Check if the number is even
                frequency.put(num, frequency.getOrDefault(num, 0) + 1);
            }
        }
        
        int maxFreq = -1;
        int mostFrequent = -1;
        
        for (Map.Entry<Integer, Integer> entry : frequency.entrySet()) {
            if (entry.getValue() > maxFreq) {
                maxFreq = entry.getValue();
                mostFrequent = entry.getKey();
            } else if (entry.getValue() == maxFreq && entry.getKey() < mostFrequent) {
                mostFrequent = entry.getKey();
            }
        }
        
        return mostFrequent;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 4, 4, 6, 6, 6, 6};
        System.out.println("Most frequent even number: " + mostFrequentEven(arr));
    }
}
