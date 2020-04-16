package Java_W2_Day_07_Abstract_interface.interfaceresizeable;

public class Rectangle1 extends Shape1 implements Risizeable {
    private double width =1.0;
    private double length=1.0;
    public Rectangle1(){

    }

    public Rectangle1(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle1(String color, boolean filled, double width, double length) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    public double getArea(){
        return this.width*this.length;
    }
    public double getPerimeter(){
        return (this.width+this.length)*2;
    }

    @Override
    public String toString() {
        return " A Rectangle with width = "
                + getWidth()
                + " and length= "
                +getLength()
                +",which is a subclass of "
                + super.toString();
    }

    @Override
    public void resize(int percent) {
        double newRectangleSize = getArea()*percent;
        System.out.println("Area of the rectangle change from "+getArea()+" to "+newRectangleSize +" make resize from 100% to "
                + percent+"%");
    }
}
