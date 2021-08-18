package LambdaJavaExpression;

interface IMathFucntion{
	int calculate(int a, int b);
}
public class LambdaExample1 {
public static void main(String[] args) {
	IMathFucntion addition = (a,b) ->(a+b);
	System.out.println("Addition =>  " + addition.calculate(10,20));
	
	IMathFucntion subtraction = (a,b) -> (a-b);
	System.out.println("subtraction =>  " + subtraction.calculate(10,20));
	
	IMathFucntion multiplication = (a,b) -> (a*b);
	System.out.println("multiplication =>  " + multiplication.calculate(10,20));
	
	IMathFucntion division = (a,b) -> (a/b);
	System.out.println("Division=>  " + division.calculate(10,20));
}
}
