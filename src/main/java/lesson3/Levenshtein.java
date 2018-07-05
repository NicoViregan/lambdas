package lesson3;

import java.util.Arrays;
import java.util.Objects;


public class Levenshtein {

    static int levenshtein(String stringA, String stringB) {
        Objects.requireNonNull(stringA);
        Objects.requireNonNull(stringB);

        if (stringA.equals(stringB))
            return 0;

        if (stringA.length() == 0)
            return stringB.length();

        if (stringB.length() == 0)
            return stringA.length();

        // convert strings to code points, represented as int[]
        int[] s = stringA.codePoints().toArray();
        int[] t = stringB.codePoints().toArray();

        // create work vectors
        int[] v0 = new int[t.length + 1];
        int[] v1 = new int[t.length + 1];
        Arrays.setAll(v0, i -> i);

        for (int i = 0; i < s.length; i++) {
            // calculate v1 (current row distances) from the previous row v0
            // first element of v1 is A[i+1][0]
            // edit distance is delete (i+1) chars from s to match empty t
            v1[0] = i + 1;

            // use formula to fill in the rest of the row
            for (int j = 0; j < t.length; j++) {
                int cost = (s[i] == t[j]) ? 0 : 1;
                v1[j + 1] = minimOfThree(v1[j] + 1, v0[j + 1] + 1, v0[j] + cost);
            }

            // copy v1 (current row) to v0 (previous row) for next iteration
            Arrays.setAll(v0, j -> v1[j]);
        }

        return v1[t.length];
    }

    static int minimOfThree(int i0, int i1, int i2) {
        return Math.min(i0, Math.min(i1, i2));
    }

    public static void main(String[] args) {
        System.out.println(levenshtein("kitten", "sitting"));
        System.out.println(levenshtein("flaw", "lawn"));
        System.out.println(levenshtein("gumbo", "gambol"));
        System.out.println(levenshtein("ROBERTMELANSON", "ROBERTOMELANSON"));
    }
}
