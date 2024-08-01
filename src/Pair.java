import java.util.HashSet;
import java.util.Set;

public class Pair {
    public static void main(String[] args) {
        int[] numbers = new int[]{2, 3, 5, 6, 1};
        int k = 5;
        findAllPairs(numbers, k);
    }

    private static void findAllPairs(int[] numbers, int k) {
        Set<Integer> pairs = new HashSet<>();
            System.out.println("k: " +k);
        for (int number : numbers) {
            int complement = k - number;
            System.out.println("number: " + number);
            System.out.println("complement: " + complement);
            if (pairs.contains(complement)) {
                System.out.println("found: " + number + " + " + complement);
            }
            System.out.println("---");
            pairs.add(number);
        }
    }
}
