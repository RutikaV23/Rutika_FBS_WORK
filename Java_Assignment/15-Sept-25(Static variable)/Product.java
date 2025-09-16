class Product {
    int p_id, quantity;
    String p_name;
    double costPrice;
    static double discount;

    // default constructor
    Product() {
        this.p_id = 1;
        this.p_name = "Laptop";
        this.costPrice = 58000;
        this.quantity = 1;
    }

    // parameterized constructor
    Product(int i, String n, double d, int q) {
        this.p_id = i;
        this.p_name = n;
        this.costPrice = d;
        this.quantity = q;
    }

    static {
        discount = 0.5;
    }

    // setters
    void setID(int p_id) {
        this.p_id = p_id;
    }

    void setName(String p_name) {
        this.p_name = p_name;
    }

    void setPrice(double costPrice) {
        this.costPrice = costPrice;
    }

    void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    // getters 
    int getID() {
        return this.p_id;
    }

    String getName() {
        return this.p_name;
    }

    double getPrice() {
        return this.costPrice;
    }

    int getQuantity() {
        return this.quantity;
    }

	void totalPrice()
	{
		int Price = p1.getPrice() - this.discount;
		 System.out.println("Selling Price : " + Price);
	}

    void display() {
        System.out.println("Id : " + this.p_id);
        System.out.println("Name : " + this.p_name);
        System.out.println("CostPrice : " + this.costPrice);
        System.out.println("Quantity : " + this.quantity);
        System.out.println("Discount : " + this.discount);
    }
}

class Test {
    public static void main(String[] args) {
        Product P = new Product();
        P.display();

        Product P1 = new Product(2, "Pen", 15, 4);
        P1.display();

       
    }
}