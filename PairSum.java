import java.util.HashSet;

/**
 * Find a pair at int array with a given sum
 * Using hash to memorize ints so we have O(n) speed
 */

public class PairSum {

    public static void main(String[] args) {
        // array and sum
        int[] intArray = {1, 5, 2, 6};
        int sum = 7;
        // Using set to memory integers cause it has O[1] find speed
        HashSet<Integer> intHash = new HashSet<>();
        // Cycle array: O[n] speed
        for (int i: intArray) {
            int delta = sum - i;
            // We found memorized int that sums right with int in array
            // It's a pair!
            if (intHash.contains(delta))
                System.out.println(i + " + " + delta + " = " + sum);
            // Memorize int
            intHash.add(i);
        }
        // We have
        // 2 + 5 = 7
        // 6 + 1 = 7
    }
}
