import java.util.ArrayList;
import java.util.Collections;

public class ListTask {
    int[] num = new int[] {5, -3, 7, 9, 4, -4, 3, 2, -5, 1};
    ArrayList<Integer> numPlus = new ArrayList<Integer>();
    public void numList() {
        for (int i=0; i < num.length; i++) {
            if(num[i] > 0) {
                numPlus.add(num[i]);
            }
        }
        System.out.println(numPlus);
    }
    public void multList() {
        int i = numPlus.toArray().length;
        int a = 0;
        int b = numPlus.toArray().length;
        b--;
        while (i > 0) {
            numPlus.add(numPlus.get(a) * 10);
            a++;
            i--;
        }
        while (b >= 0) {
            numPlus.remove(b);
            b--;
        }
        System.out.println(numPlus);
        Collections.sort(numPlus);
        System.out.println(numPlus);
    }
}
