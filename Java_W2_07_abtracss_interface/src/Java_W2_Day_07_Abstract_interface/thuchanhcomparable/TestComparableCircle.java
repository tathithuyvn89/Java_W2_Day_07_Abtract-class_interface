package Java_W2_Day_07_Abstract_interface.thuchanhcomparable;

import java.util.Arrays;

public class TestComparableCircle {
    public static void main(String[] args) {
        ComparableCircle[] circles = new ComparableCircle[3];
        circles[0] = new ComparableCircle(3.6);
        circles[1] = new ComparableCircle();
        circles[2] = new ComparableCircle("indigo", false, 5.6);
        System.out.println("Pre-sort");
        for (ComparableCircle circle : circles) {
            System.out.println(circle);
        }
        Arrays.sort(circles);
        System.out.println("After-sort");
        for (ComparableCircle circle : circles) {
            System.out.println(circle);
        }
    }
}
