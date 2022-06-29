package mx.tc.j2se.evaluation;

public class Evaluation1 {
    Circle circle1 = new Circle();
    Circle circle2 = new Circle(2);
    Circle circle3 = new Circle(-1);
    Circle[] circleArray=new Circle[]{circle1,circle2,circle3};

    public Object biggestCircle(){
        int pivot = 0;
        for(int i= 0; i < circleArray.length; i++){
            if(circleArray[i].radius>circleArray[pivot].radius)
                pivot = i;
        }
        System.out.println(circleArray[pivot]);
        return null;
    }
}
class Main{
    public static void main(String[] args){
        Evaluation1 biggestCircle;
    }
}
