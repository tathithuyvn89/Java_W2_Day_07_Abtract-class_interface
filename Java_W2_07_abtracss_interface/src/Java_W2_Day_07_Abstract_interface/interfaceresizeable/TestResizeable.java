package Java_W2_Day_07_Abstract_interface.interfaceresizeable;

import Java_W2_Day_02_modifier_static.baitap.Circle;

public class TestResizeable {
    public static void main(String[] args) {
        int percent= (int)(Math.random()*100);
        Risizeable [] shape1s= new Risizeable[6];
        shape1s[0]=new Circle1();
        shape1s[1]=new Circle1(5.6);
        shape1s[2]=new Rectangle1();
        shape1s[3]=new Rectangle1(7.8,9.0);
        shape1s[4]=new Square1();
        shape1s[5]=new Square1(6.7);
        for ( Risizeable shape: shape1s){
            shape.resize(percent);
            System.out.println(shape.toString());
        }






    }
}
