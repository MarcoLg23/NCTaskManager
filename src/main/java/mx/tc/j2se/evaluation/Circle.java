package mx.tc.j2se.evaluation;

public class Circle {

    int radius;

    public Circle(){
        setRadius(1);
    }

    public Circle(int radius) throws IllegalArgumentException{
        setRadius(radius);
    }

    public void setRadius(int radius) throws IllegalArgumentException {
        try {
            if (radius <= 0)
                throw new IllegalArgumentException();
            else
                this.radius = radius;
        }   catch (IllegalArgumentException e){
            System.out.println("Radius is less or equal to 0");
        }
    }

    public int getRadius(){
        return radius;
    }

    public double getArea(){
        return Math.PI*radius*radius;
    }
}
