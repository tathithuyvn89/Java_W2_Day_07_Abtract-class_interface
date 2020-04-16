package Java_W2_Day_07_Abstract_interface.interfaceresizeable;

import Java_W2_Day_03_Kethua.thuchanh.Rectangle;


public class Square1 extends Rectangle1 implements Risizeable {
    public Square1(){

    }

    public Square1(double side){
        super(side,side);
    }
    public Square1(String color, boolean filled,double side){
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
}
