package main.bruteforce;

import java.util.Vector;

public class InterestingDigits {
    static public int[] digits(int base) {
        Vector<Integer> vector = new Vector<>();

        for (int i = 2; i < base; i++) {
            if ((base-1) % i == 0) vector.add(i);
        }

        return vector.stream().mapToInt(o -> o).toArray();
    }
}
