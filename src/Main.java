import java.util.*;

public class Main {

    public static int squirrel(int N) {
        int fact = 1;
        for (int i = 2; i <= N; i++) {
            fact = fact * i;
        }
        char[] smaragd = String.valueOf(fact).toCharArray();

        return Integer.parseInt(String.valueOf(smaragd[0]));
    }
}
