
class Student
{
	int fbs_id;
	String s_name;
	double distance_traveled;
	static int student_count;

	// default constructor
    Student() {
        this.fbs_id = 1;
        this.s_name = "Rutika";
        this.distance_traveled = 5800;
	student_count++;
    
    }

    // parameterized constructor
    Student(int i, String n, double d) {
        this.fbs_id = i;
        this.s_name = n;
        this.distance_traveled = d;
	student_count++;
   
    }

	//static block
    static 
	{
        	student_count = 0;
    }

	 
	// setters
    void setID(int fbs_id) {
        this.fbs_id = fbs_id;
    }

    void setName(String p_name) {
        this.s_name =s_name;
    }

    void setDistance(double distance_traveled) {
        this.distance_traveled = distance_traveled;
    }


    // getters 
    	int getID() 
	{
        	return this.fbs_id;
    	}

    	String getName() 
	{
       		 return this.s_name;
    	}

    	double getDistance() 
	{
        	return this.distance_traveled;
   	 }

	 static double getCount() 
	{
        	return student_count;
    }
	

    void display() {
        System.out.println("Id : " + this.fbs_id);
        System.out.println("Name : " + this.s_name);
        System.out.println("Distance_traveled : " + this.distance_traveled);
        //System.out.println("student_count : " + this.student_count);
    }

}//end Student

class PlacedStudent extends Student
{
	String companyName;
	String desgn;
	PlacedStudent() {//default constructor
		super();//step -2 A
		this.companyName = "kuni tari ghya re";
		this.desgn = "student";
	}
	
	PlacedStudent(int fbs_id ,String s_name, double distance_traveled ,String companyName, String desgn) {
		//Parameterized constructor
		super(fbs_id ,s_name,distance_traveled );
		this.companyName = companyName;
		this.desgn = desgn;
	}

	String getCompanyName() {
		return companyName;
	}

	void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	String getDesgn() {
		return desgn;
	}

	void setDesgn(String desgn) {
		this.desgn = desgn;
	}
	
	void display() 
	{
		super.display();
		System.out.println("Company name : " + this.companyName);
	    System.out.println("designation : " + this.desgn);
	}
}//end PlacedStudent

class Test
{
	public static void main(String []args)
	{
		Student s = new Student();
		s.display();

		System.out.println();
		
		Student s1 = new Student(2,"Raju",6.6);
		s1.display();
		
		PlacedStudent ps1 = new PlacedStudent(1,"Rutika",700,"Persistant","developer");

		Student.getCount();
	}
}//end Test