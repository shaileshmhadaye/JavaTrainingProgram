package day5;

public class Employee implements Comparable<Employee>{

	public Employee(String ename, int age, int eid) {
		super();
		this.ename = ename;
		this.age = age;
		this.eid = eid;
	}
	private String ename;
	private int age;
	private int eid;
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	@Override
	public String toString() {
		return "Employee [ename=" + ename + ", age=" + age + ", eid=" + eid + "]";
	}
	
	public int compareTo(Employee e) {
		if(this.getAge()>e.getAge())
			return 1;
		else return -1;
	}

}
