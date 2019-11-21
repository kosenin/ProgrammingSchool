import java.util.*;

public class Level1 {

    public static int odometer(int[] oksana) {

        List<Integer> speed = new ArrayList();
        List<Integer> hours = new ArrayList();

        for (int i = 0; i < oksana.length; i++) {
            if (i % 2 == 0) {
                speed.add(oksana[i]);
            } else
                hours.add(oksana[i]);
        }
        int realTIme = 0;
        int counter = 0;

        for (int i = 0; i < speed.size(); i++) {
            if (i == 0) {
                counter = counter + ((speed.get(i) * hours.get(i)));
            } else {
                counter = counter + (speed.get(i) * (hours.get(i) - hours.get(realTIme)));
                realTIme++;
            }
        }
        return counter;
    }
}
