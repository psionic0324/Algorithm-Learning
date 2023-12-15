package test.bruteforce;

import static main.bruteforce.InterestingParty.bestInvitation;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class InterestingPartyTest {
    @DisplayName("Test_1")
    @Test
    void test_1() {
        String[] first = {"fishing", "gardening", "swimming", "fishing"};
        String[] second = {"hunting", "fishing", "fishing", "biting"};
        int expected = 4;

        int actual = bestInvitation(first, second);

        System.out.println("Test_1 Actual Value: " + actual);
        assertEquals(expected, actual);
    }

    @DisplayName("Test_2")
    @Test
    void test_2() {
        String[] first = {"variety", "diversity", "loquacity", "courtesy"};
        String[] second = {"talking", "speaking", "discussion", "meeting"};
        int expected = 1;

        int actual = bestInvitation(first, second);

        System.out.println("Test_2 Actual Value: " + actual);
        assertEquals(expected, actual);
    }

    @DisplayName("Test_3")
    @Test
    void test_3() {
        String[] first = {"snakes", "programming", "cobra", "monty"};
        String[] second = {"python", "python", "anaconda", "python"};
        int expected = 3;

        int actual = bestInvitation(first, second);

        System.out.println("Test_3 Actual Value: " + actual);
        assertEquals(expected, actual);
    }

    @DisplayName("Test_4")
    @Test
    void test_4() {
        String[] first = {"t", "o", "p", "c", "o", "d", "e", "r", "s", "i", "n", "g", "l", "e", "r", "o", "u",
                "n", "d", "m", "a", "t", "c", "h", "f", "o", "u", "r", "n", "i"};
        String[] second = {"n", "e", "f", "o", "u", "r", "j", "a", "n", "u", "a", "r", "y", "t", "w", "e", "n",
                "t", "y", "t", "w", "o", "s", "a", "t", "u", "r", "d", "a", "y"};
        int expected = 6;

        int actual = bestInvitation(first, second);

        System.out.println("Test_4 Actual Value: " + actual);
        assertEquals(expected, actual);
    }
}
