typedef struct HR 
{
	int id;
	char name[20];
	int salary;
	int comission;

}HR  ;

HR storeHR();
void displayHR(HR);
void main()
{	 
	HR h1,h2,h3;
	printf("\nenter id name  salary comission");
	h1 = storeHR();
		
	printf("\nenter id name salary comission");
	h2 = storeHR();

	printf("\nenter id name salary comission");
	h3 = storeHR();
	
	printf("\n--- HR Information ---");
	displayHR(h1);
	displayHR(h2);
	displayHR(h3);
	

}

HR storeHR()
{
		HR h1;
		scanf("%d%s%d%d",&h1.id,h1.name,&h1.salary,&h1.comission);
		return h1;
}

void displayHR(HR h1)
{
	printf("\nid=%d \nname=%s \nsalary=%d \ncomission=%d\n ",h1.id,h1.name,h1.salary,h1.comission);

}