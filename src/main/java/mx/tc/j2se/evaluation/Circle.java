package mx.tc.j2se.evaluation;

public class Circle {

    int radius;

    public Circle(){
        setRadius(1);
    }

    public Circle(int radius) throws IllegalArgumentException{
        if(radius<=0)
            throw new IllegalArgumentException("Radius is less or equal to 0");
        else
            this.radius = radius;
    }

    public void setRadius(int radius) throws IllegalArgumentException {
        if(radius<=0)
            throw new IllegalArgumentException("Radius is less or equal to 0");
        else
            this.radius = radius;
    }

    public int getRadius(){
        return radius;
    }

    public double getArea(){
        return Math.PI*radius*radius;
    }
}
