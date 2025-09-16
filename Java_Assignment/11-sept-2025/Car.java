import java.util.Scanner;
class Car
{
  String model, brand;
  int year;
  double price;

  void setmodel(String model){
          this.model = model;
     }
   void setbrand(String brand){
          this.brand = brand;
     }

   void setyear(int year){
          this.year = year;
     }

    void setprice(double price){
          this.price = price;
     }

    String getmodel(){
          return this.model;
     }
   String getbrand(){
          return this.brand;
     }

   int getyear(){
          return this.year;
     }

    double getprice(){
          return this.price;
     }

    Car(String m, String b, int y, double p){
           this.model = m;
            this.brand = b;
           this.year = y;
          this.price = p;
     }

   void display(){
       System.out.println("Model of Car: "+ this.model);
       System.out.println("Brand of Car: "+ this.brand);
       System.out.println("Year : "+ this.year);
       System.out.println("Price of Car: "+ this.price);
    }
}

class TestCar
{
 public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
 
      System.out.println("Enter Model Name: ");
      String model= sc.nextLine();
      System.out.println("Enter barnd Name: ");
      String brand= sc.nextLine();

      System.out.println("Enter Year: ");
      int year= sc.nextInt();
      System.out.println("Enter Price: ");
      double price= sc.nextDouble();



      Car C1 = new Car(model, brand, year, price);
      C1.display();
   }
}