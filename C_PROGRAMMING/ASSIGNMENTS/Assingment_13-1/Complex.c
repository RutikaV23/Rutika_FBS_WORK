// Complex(real, imaginary) 
typedef struct Complex 
{
	int real, imaginary;

}Complex ;

Complex storeComplex();
void displayComplex(Complex);
void main()
{	 
	Complex c1,c2,c3;
	c1 = storeComplex();
			
	c2 = storeComplex();
	
	c3 = storeComplex();
	
	printf("\n--- complex Number---");
	displayComplex(c1);
	displayComplex(c2);
	displayComplex(c3);
	

}

Complex storeComplex()
{
	    Complex c1;
		printf("\nenter real :");
		scanf("%d",&c1.real);
		printf("\nenter imaginary :");
		scanf("%d",&c1.imaginary);

		return c1;
}

void displayComplex(Complex c1)
{
	printf("\nreal = %d imaginary = %di \n ",c1.real,c1.imaginary);
}