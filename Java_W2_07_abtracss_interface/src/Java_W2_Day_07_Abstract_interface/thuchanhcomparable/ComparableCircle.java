package Java_W2_Day_07_Abstract_interface.thuchanhcomparable;

import Java_W2_Day_07_Abstract_interface.interfaceresizeable.Circle1;

public class ComparableCircle extends Circle1 implements java.lang.Comparable<ComparableCircle> {
    public ComparableCircle() {
    }

    public ComparableCircle(double radius) {
        super(radius);
    }

    public ComparableCircle(String color, boolean filled, double radius) {
        super(color, filled, radius);
    }

    @Override
    public int compareTo(ComparableCircle o) {
        if (getRadius()>o.getRadius()){
            return 1;
        } else if (getRadius()<o.getRadius()){
            return -1;
        } else {
            return 1;
        }
    }
}
