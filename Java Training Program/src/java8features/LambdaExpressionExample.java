package java8features;

interface Lambdademo {
	
	public String msg();
	
}

public class LambdaExpressionExample {

	public static void main(String[] args) {
				
		Lambdademo l = () -> {return("Hello");};
		
		System.out.println(l.msg());

	}

}
