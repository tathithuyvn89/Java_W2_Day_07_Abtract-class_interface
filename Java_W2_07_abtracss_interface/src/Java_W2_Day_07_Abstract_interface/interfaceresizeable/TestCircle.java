package Java_W2_Day_07_Abstract_interface.interfaceresizeable;

public class TestCircle {
    public static void main(String[] args) {
        int percent= (int)(Math.random()*100);
        Circle1 circle1= new Circle1();
        circle1.resize(percent);
        int percent2= (int)(Math.random()*100);
        Circle1 circle2= new Circle1(4.5);
        circle1.resize(percent2);
    }
}
