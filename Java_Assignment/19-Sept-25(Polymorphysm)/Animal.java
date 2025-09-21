class Animal {
    String type;

    Animal() {
        this.type = "Unknown";
    }

    Animal(String type) {
        this.type = type;
    }

    String getType() { return type; }
    void setType(String type) { this.type = type; }

    void display() {
        System.out.println("Animal Type: " + type);
        sound(); 
        
    }
    
    void sound()
    {
    	System.out.println("Sound of Animal : ");
    }
}

class Dog extends Animal {
    String breed;

    Dog() {
        super("Dog");
        this.breed = "Labrador";
    }

    Dog(String breed) {
        super("Dog");
        this.breed = breed;
    }

    void display() {
        super.display();
        System.out.println("Breed: " + breed);

    }
    
    void sound()
    {
    	System.out.println("Sound of Dog is Brak");
    }
}

class Cat extends Animal {
    String color;

    Cat() {
        super("Cat");
        this.color = "White";
    }

    Cat(String color) {
        super("Cat");
        this.color = color;
    }

    void display() {
        super.display();
        System.out.println("Color: " + color);

    }
    
    void sound()
    {
    	System.out.println("Sound of Cat is Meow Meow");

    }
}

class TestAnimal {
    public static void main(String[] args) {
        Animal a ;
        a = new Animal("Generic Animal");
        a.display(); 
        System.out.println();
        
        a = new Dog("German Shepherd");
        a.display(); 
        System.out.println();
        
        a = new Cat("Black");
        a.display();

        
    }
}
