import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> set = new ArrayList<>();
        for (int i=1; i<10;i++) {
            set.add(i);
        }
        System.out.println(set.contains(8));
        System.out.println(set.contains(9));
        System.out.println(set.contains(10));



    }
}
