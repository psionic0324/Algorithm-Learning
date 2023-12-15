package main.bruteforce;

public class Cryptography {
    public static long encrypt(int[] numbers) {
        long max = 0;

        for (int i = 0; i < numbers.length; i++) {
            long temp = numbers[i] + 1;

            for (int j = 0; j < numbers.length; j++) {
                if(i == j) continue;
                temp *= numbers[j];
            }
            max = Math.max(max, temp);
        }

        return max;
    }

    /* 응용기술 1 */
//    public static long encrypt(int[] numbers) {
//        Arrays.sort(numbers);
//        long temp = numbers[0] + 1;
//
//        for (int j = 1; j < numbers.length; j++) {
//            temp *= numbers[j];
//        }
//
//        return temp;
//    }
}