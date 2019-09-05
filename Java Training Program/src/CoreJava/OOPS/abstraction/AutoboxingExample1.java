package CoreJava.OOPS.abstraction;

class p{
	public void myMethod(Integer m) {
		System.out.print(m);
	}
	
}

public class AutoboxingExample1 extends p{
	
	public static void myMethod(int m) {
		System.out.print(m);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		p obj=new p();
		obj.myMethod(4);
		myMethod(2);

	}

}
