package test.bruteforce;

import static main.bruteforce.InterestingDigits.digits;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import java.util.Arrays;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class InterestingDigitsTest {
    @DisplayName("Test_1")
    @Test
    void test_1() {
        int base = 10;
        int[] expected = new int[]{3, 9};

        int[] actual = digits(base);

        System.out.println("Test_1 Actual Value: " + Arrays.toString(actual));
        assertArrayEquals(expected, actual);
    }

    @DisplayName("Test_2")
    @Test
    void test_2() {
        int base = 3;
        int[] expected = new int[]{2};

        int[] actual = digits(base);

        System.out.println("Test_2 Actual Value: " + Arrays.toString(actual));
        assertArrayEquals(expected, actual);
    }

    @DisplayName("Test_3")
    @Test
    void test_3() {
        int base = 9;
        int[] expected = new int[]{2, 4, 8};

        int[] actual = digits(base);

        System.out.println("Test_3 Actual Value: " + Arrays.toString(actual));
        assertArrayEquals(expected, actual);
    }

    @DisplayName("Test_4")
    @Test
    void test_4() {
        int base = 26;
        int[] expected = new int[]{5, 25};

        int[] actual = digits(base);

        System.out.println("Test_4 Actual Value: " + Arrays.toString(actual));
        assertArrayEquals(expected, actual);
    }

    @DisplayName("Test_5")
    @Test
    void test_5() {
        int base = 30;
        int[] expected = new int[]{29};

        int[] actual = digits(base);

        System.out.println("Test_5 Actual Value: " + Arrays.toString(actual));
        assertArrayEquals(expected, actual);
    }
}
