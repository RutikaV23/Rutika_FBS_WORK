// Distance ( feet, inch) 
typedef struct Distance 
{
	int feet,inch;

}Distance ;

Distance  storeDistance();
void displayDistance (Distance);
void main()
{	 
	Distance  d1,d2,d3;
	d1 = storeDistance ();
			
	d2 = storeDistance ();
	
	d3 = storeDistance ();
	
	printf("\n--- Distance calculatore---");
	displayDistance (d1);
	displayDistance (d2);
	displayDistance (d3);
	

}

Distance storeDistance ()
{
	    Distance d1;
		printf("\nenter feet :");
		scanf("%d",&d1.feet);
		printf("\nenter inch :");
		scanf("%d",&d1.inch);

		return d1;
}

void displayDistance (Distance d1)
{
	printf("\nfeet = %d inch = %d \n ",d1.feet,d1.inch);
}