
//---------------------------------------Inheritance-----------------------------------------------

package CoreJava.OOPS.Inheritence;

//In this example, we have a base class Teacher and a sub class PhysicsTeacher.
//Since class PhysicsTeacher extends the designation and college properties and work() method from base class,
//we need not to declare these properties and method in sub class.
//Here we have collegeName, designation and work() method which are common to all the teachers so 
//we have declared them in the base class,
//this way the child classes like MathTeacher, MusicTeacher and PhysicsTeacher do not need to write this code 
//and can be used directly from base class.

class Teacher {
	   String designation = "Teacher";
	   String collegeName = "DMCE";
	   void does(){
		System.out.println("Teaching");
	   }
	}

public class PhysicsTeacher extends Teacher{
	
	String mainSubject = "Physics";

	public static void main(String[] args) {
		PhysicsTeacher obj = new PhysicsTeacher();
		System.out.println(obj.collegeName);
		System.out.println(obj.designation);
		System.out.println(obj.mainSubject);
		obj.does();

	}

}
//Based on the above example we can say that PhysicsTeacher IS-A Teacher. 
//This means that a child class has IS-A relationship with the parent class.
//This is inheritance is known as IS-A relationship between child and parent class
