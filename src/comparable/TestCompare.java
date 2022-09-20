package comparable;

import java.util.Arrays;
import java.util.Comparator;

public class TestCompare {
    public static void main(String[] args) {
        CompareableCircle[] circles = new CompareableCircle[3];
        circles[0] = new CompareableCircle(3.6);
        circles[1] = new CompareableCircle();
        circles[2] = new CompareableCircle(3.5, "indigo", false);
        System.out.println("Pre-sorted:");
        for (CompareableCircle circle : circles){
            System.out.println(circle);
        }
        Arrays.sort(circles);
        System.out.println("After-sorted:");
        for (CompareableCircle circle : circles){
            System.out.println(circle);
        }
    }
}
