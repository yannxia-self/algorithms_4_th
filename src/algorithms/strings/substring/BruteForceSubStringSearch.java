package algorithms.strings.substring;

/**
 * @author yann
 * @since 2017/1/24.
 */
public class BruteForceSubStringSearch {

    public static int search(String pat, String txt) {
        int M = pat.length();
        int N = txt.length();

        for (int i = 0; i < N - M; i++) {
            int j = 0;
            for (j = 0; j < M; j++) {
                if (txt.charAt(i + j) != pat.charAt(j)) {
                    break;
                }
            }
            if (j == M) return i; //Found
        }

        return -1; //not found
    }


    public static void main(String[] args) {
        int r = search("abc", "abc");
        assert r == 0;
    }


}
