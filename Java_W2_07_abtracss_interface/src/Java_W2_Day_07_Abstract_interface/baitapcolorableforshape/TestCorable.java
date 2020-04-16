package Java_W2_Day_07_Abstract_interface.baitapcolorableforshape;

import Java_W2_Day_03_Kethua.thuchanh.Circle;
import Java_W2_Day_03_Kethua.thuchanh.Shape;
import Java_W2_Day_07_Abstract_interface.interfaceresizeable.Circle1;
import Java_W2_Day_07_Abstract_interface.interfaceresizeable.Rectangle1;
import Java_W2_Day_07_Abstract_interface.interfaceresizeable.Shape1;

public class TestCorable {
    public static void main(String[] args) {
        Shape1[]shape1s= new Shape1[5];
        shape1s[0]=new Circle1(7.6);
        shape1s[1]=new Rectangle1(5.6,4.5);
        shape1s[2]=new Square2(6.7);
        shape1s[3]=new Circle1();
        shape1s[4]=new Square2(9.0);
        for (Shape1 shape1:shape1s){
            System.out.print("Area of the shape is " + shape1.getArea()+"\t");
            if (shape1 instanceof Square2){
                Square2 square = (Square2)shape1;
//                System.out.print("Area of square is "+square.getArea()+", ");
                square.howToColor();
            }
            System.out.println();
        }

    }
}
