import java.util.HashMap;
import java.util.Map;

public class practicalMST {
    public static void main(String[] args) {
     
        int[] arr = {2, 2, 2, 3, 3, 4, 4, 4};

        HashMap<Integer, Integer> frequencyMap = new HashMap<>();

        for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            System.out.println("Element: " + entry.getKey() + ", Frequency: " + entry.getValue());
        }
    }
}
