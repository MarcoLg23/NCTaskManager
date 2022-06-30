package mx.tc.j2se.evaluation;

import static mx.tc.j2se.evaluation.Evaluation1.biggestCircle;

public class Main {
	public static void main(String[] args) {

		Circle circleInv = new Circle(-1);

		Circle circle1 = new Circle();
		Circle circle2 = new Circle(5);
		Circle circle3 = new Circle(4);

		Circle[] circleArray=new Circle[]{circle1,circle2,circle3};
		int big = biggestCircle(circleArray);
		System.out.println(circleArray[big].radius);
	}
}
