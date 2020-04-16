package Java_W2_Day_07_Abstract_interface.interfaceresizeable;

public class Circle1 extends Shape1 implements Risizeable {
    private double radius=1.0;

    public Circle1() {
    }
    public Circle1(double radius) {
        this.radius = radius;
    }

    public Circle1(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    @Override
    public double getArea(){
        return radius*radius*Math.PI;
    }

    public double getPerimeter(){
        return 2*radius*Math.PI;
    }

    @Override
    public void resize(int percent) {
        double newRadiusArea= getArea()*percent;
//        System.out.printf("Area of the radius change from %20.3f%d to %20.3f%d ",getArea(),newRadiusArea);
        System.out.println("Area of the radius change from "+getArea()+" to "+newRadiusArea +" make resize from 100% to "
                + percent+"%");
    }

    @Override
    public String toString() {
        return "A Circle with radius = "
                + getRadius()
                +", which is a subclass of "
                +super.toString();
    }
}
