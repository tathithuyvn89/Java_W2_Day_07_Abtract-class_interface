package Java_W2_Day_07_Abstract_interface.baitapcolorableforshape;

import Java_W2_Day_07_Abstract_interface.interfaceresizeable.Rectangle1;
import Java_W2_Day_07_Abstract_interface.interfaceresizeable.Risizeable;

public class Square2 extends Rectangle1 implements Risizeable,Colorable {
    public Square2(){

    }

    public Square2(double side){
        super(side,side);
    }
    public Square2(String color, boolean filled,double side){
        super(color,filled,side,side);
    }
    public double getSide(){
        return getWidth();
    }
    public void setSide(double side){
        setWidth(side);
        setLength(side);
    }

//    @Override
//    public void setWidth(double width) {
//        setSide(width);
//    }

//    @Override
//    public void setLength(double length) {
//        setSide(length);
//    }

    @Override
    public String toString() {
        return "A Square with side ="
                + getSide()
                +", which is a subclass of  "
                + super.toString();
    }

    @Override
    public void resize(int percent) {
        double newSquaresize = getArea()*percent;
        System.out.println("Area of the square change from "+getArea()+" to "+newSquaresize +" make resize from 100% to "
                + percent+"%");
    }


    @Override
    public void howToColor() {
        System.out.println("Color all for size ");
    }
}
