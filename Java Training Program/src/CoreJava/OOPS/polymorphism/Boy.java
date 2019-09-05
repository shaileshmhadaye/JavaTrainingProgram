
//------------------------------------------Overriding--------------------------------------------------------

package CoreJava.OOPS.polymorphism;

class Human{
	//Overridden method
		
	   public void eat()
	   {
	      System.out.println("Human is eating");
	   }
}

public class Boy extends Human {

	//Overriding method
	   @Override
	   public void eat(){
	      System.out.println("Boy is eating");
	   }
	   public static void main( String args[]) {
	      Human obj = new Boy();
	      //This will call the child class version of eat()
	      obj.eat();
	   }

}
