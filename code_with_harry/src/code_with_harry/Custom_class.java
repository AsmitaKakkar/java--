package code_with_harry;

class Employee{
	int id;
	int salary;
	String name;
	public void printDetails() {
		System.out.println("My name is => "+name);
		System.out.println("My id is => "+id);
	}
	public int getSalary()
	{
		return salary;
	}
}

public class Custom_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("This is our custom class!!");
	    Employee obj1=new Employee();    // Instantiating a new employee object!!
	    Employee obj2=new Employee();
	    
	    //Setting properties for obj1!!
	    obj1.id=12;
	    obj1.salary=34;
	    obj1.name="Asmita Kakkar";
	    
	    //Setting properties for obj2!!
	    obj2.id=18;
	    obj2.salary=98;
	    obj2.name="Vishwanath Kakkar";
	    
	    //Printing Attributes!!
	    
	    obj1.printDetails();
	    int salary=obj1.getSalary();
	    System.out.println("Salary of obj1 is =>"+salary);
	    obj2.printDetails();
	    System.out.println("Salary of obj2 is =>"+obj2.salary);
	  
	    
	    // System.out.println(obj1.id);
	   // System.out.println(obj1.name);

	}

}
