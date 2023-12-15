package test.bruteforce;

import static org.junit.jupiter.api.Assertions.assertEquals;

import main.bruteforce.Cryptography;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CryptographyTest {
    @DisplayName("Test_1")
    @Test
    void Test_1() {
        int[] numbers = {1, 2, 3};
        long expected = 12;

        long actual = Cryptography.encrypt(numbers);

        System.out.println("Test_1 Actual Value: " + actual);
        assertEquals(expected, actual);
    }

    @DisplayName("Test_2")
    @Test
    void Test_2() {
        int[] numbers = {1, 3, 2, 1, 1, 3};
        long expected = 36;

        long actual = Cryptography.encrypt(numbers);

        System.out.println("Test_2 Actual Value: " + actual);
        assertEquals(expected, actual);
    }

    @DisplayName("Test_3")
    @Test
    void Test_3() {
        int[] numbers = {1000, 999, 998, 997, 996, 995};
        long expected = 986074810223904000L;

        long actual = Cryptography.encrypt(numbers);

        System.out.println("Test_3 Actual Value: " + actual);
        assertEquals(expected, actual);
    }

    @DisplayName("Test_4")
    @Test
    void Test_4() {
        int[] numbers = {1, 1, 1, 1};
        long expected = 2;

        long actual = Cryptography.encrypt(numbers);

        System.out.println("Test_4 Actual Value: " + actual);
        assertEquals(expected, actual);
    }
}
