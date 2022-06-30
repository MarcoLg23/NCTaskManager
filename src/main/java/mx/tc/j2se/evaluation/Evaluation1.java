package mx.tc.j2se.evaluation;

public class Evaluation1 {

    public static int biggestCircle(Circle[] circleArray){

        int pivot = 0;
        for(int i= 0; i < circleArray.length; i++){
            if(circleArray[i].radius>circleArray[pivot].radius)
                pivot = i;
        }
        return pivot;
    }
}
