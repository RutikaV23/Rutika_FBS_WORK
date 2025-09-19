class Person {
    String name;
    int age;

    Person() {
        this.name = "Unknown";
        this.age = 18;
    }

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    String getName() 
    { 
    	return name; 
    }
    
    void setName(String name) 
    { 
    	this.name = name; 
    }

    int getAge() 
    { 
    	return age;
    }
    
    void setAge(int age) 
    { 
    	this.age = age;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Students extends Person {
    String course;

    Students() {
        super();
        this.course = "CSE";
    }

    Students(String name, int age, String course) {  
        super(name, age);
        this.course = course;
    }

    void display() {
        super.display();
        System.out.println("Course: " + course);
    }
}

class Teacher extends Person {
    String subject;

    Teacher() {
        super();
        this.subject = "Maths";
    }

    Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    void display() {
        super.display();
        System.out.println("Subject: " + subject);
    }
}

class TestPerson {
    public static void main(String[] args) {
        Person p = new Person("John", 40);
        Students s = new Students("Alice", 20, "Java");
        Teacher t = new Teacher("Mr. Smith", 45, "Physics");

        p.display(); System.out.println();
        s.display(); System.out.println();
        t.display();
    }
}
