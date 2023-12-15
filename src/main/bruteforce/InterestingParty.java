package main.bruteforce;

public class InterestingParty {
    public static int bestInvitation(String[] first, String[] second) {
        int maxCount = 0;

        for (int i = 0; i < first.length; i++) {
            int fCount = 0;
            int sCount = 0;

            for (int j = i; j < first.length; j++) {
                if (first[i].equals(first[j])) fCount++;
                else if (first[i].equals(second[j])) fCount++;
                if (second[i].equals(first[j])) sCount++;
                else if (second[i].equals(second[j])) sCount++;
            }

            maxCount = Math.max(maxCount, fCount);
            maxCount = Math.max(maxCount, sCount);
        }

        return maxCount;
    }

//    public static int bestInvitation(String[] first, String[] second) {
//        HashMap<String, Integer> dictionary = new HashMap<>();
//
//        for (int i = 0; i < first.length; i++) {
//            dictionary.put(first[i], 0);
//            dictionary.put(second[i], 0);
//        }
//
//        for (int i = 0; i < first.length; i++) {
//            dictionary.put(first[i], dictionary.get(first[i]) + 1);
//            dictionary.put(second[i], dictionary.get(second[i]) + 1);
//        }
//
//        int maxCount = 0;
//        for (String key : dictionary.keySet()) {
//            maxCount = Math.max(maxCount, dictionary.get(key));
//        }
//
//        return maxCount;
//    }
}
