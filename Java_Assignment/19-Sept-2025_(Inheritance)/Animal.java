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
}

class TestAnimal {
    public static void main(String[] args) {
        Animal a = new Animal("Generic Animal");
        Dog d = new Dog("German Shepherd");
        Cat c = new Cat("Black");

        a.display(); System.out.println();
        d.display(); System.out.println();
        c.display();
    }
}
