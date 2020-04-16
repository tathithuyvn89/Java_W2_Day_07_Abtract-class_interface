package Java_W2_Day_07_Abstract_interface.thuchanhcomparator.thuchanh;

import Java_W2_Day_03_Kethua.thuchanh.Circle;

import java.util.Comparator;

public class CircleComparator implements Comparator <Circle>{
    @Override
    public int compare(Circle c1, Circle c2) {
       if (c1.getRadius()>c2.getRadius()){
           return 1;
       } else if(c1.getRadius()<c2.getRadius()) {
           return -1;
        } else {
           return 0;
       }
    }
}
