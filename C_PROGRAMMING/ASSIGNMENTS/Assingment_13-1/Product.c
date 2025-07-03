// Product(id, name, quantity, price)  
typedef struct Product  
{
	int id,quantity, price;
	char name[20];

}Product ;

Product storeProduct();
void displayProduct(Product );
void main()
{	 
	Product p1,p2,p3;
	p1 = storeProduct();
			
	p2 = storeProduct();
	
	p3 = storeProduct();
	
	printf("\n--- Product Number---");
	displayProduct(p1);
	displayProduct(p2);
	displayProduct(p3);
	

}

Product  storeProduct ()
{
	    Product  p1;
		printf("\nenter id :");
		scanf("%d",&p1.id);
		printf("\nenter quantity:");
		scanf("%d",&p1.quantity);
		printf("\nenter name:");
		scanf("%s",&p1.name);
		printf("\nenter price:");
		scanf("%d",&p1.price);

		return p1;
}

void displayProduct(Product p1)
{
	printf("\nid = %d quantity = %d name = %s price = %d\n ",p1.id,p1.quantity,p1.name,p1.price);
}