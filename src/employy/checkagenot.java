package employy;

public class checkagenot {
	
	 public static void main(String[] args) {
		 
		Cl  clerk =new Cl("name", 11, 12);
		System.out.println(clerk.age);
	}	
}

class Cl {

	public String nameString;
	
	public int age;
	
	private int salary;
	
	public Cl(String name,int age1,int salary1){
		this.nameString=name;
		this.age=age1;
		this.salary=salary1;
	}
}

