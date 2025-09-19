class Employee1 {
    int empId;
    String name;

    Employee1() {
        this.empId = 1001;
        this.name = "Default";
    }

    Employee1(int empId, String name) {
        this.empId = empId;
        this.name = name;
    }

    int getEmpId() 
    { 
    	return empId; 
    }
    void setEmpId(int empId) 
    { 
    	this.empId = empId;
    }

    String getName() 
    { 
    	return name;
    }
    void setName(String name) 
    { 
    	this.name = name;
    }

    void display() {
        System.out.println("EmpId: " + empId);
        System.out.println("Name: " + name);
    }
}

class Developer extends Employee1 {
    String language;

    Developer() {
        super();
        this.language = "Java";
    }

    Developer(int empId, String name, String language) {
        super(empId, name);
        this.language = language;
    }

    void display() {
        super.display();
        System.out.println("Programming Language: " + language);
    }
}

class Manager extends Employee1 {
    int teamSize;

    Manager() {
        super();
        this.teamSize = 5;
    }

    Manager(int empId, String name, int teamSize) {
        super(empId, name);
        this.teamSize = teamSize;
    }

    void display() {
        super.display();
        System.out.println("Team Size: " + teamSize);
    }
}

class TestEmployee {
    public static void main(String[] args) {
        Employee1 e = new Employee1(101, "Ramesh");
        e.display(); 
        System.out.println();
        
        Developer d = new Developer(102, "Suresh", "Python");
        d.display(); 
        System.out.println();

        Manager m = new Manager(103, "Mahesh", 10);
        m.display();
    }
}
