//SalesManager (id, name, salary, incentive, target)
typedef struct SalesManager 
{
	int id,salary,incentive,target;
	char name[20];

}SalesManager;

SalesManager storeSalesManager();
void displaySalesManager(SalesManager);
void main()
{	 
	SalesManager s1,s2,s3;
	printf("\nenter id name  salary incentive");
	s1 = storeSalesManager();
		
	printf("\nenter id name salary incentive");
	s2 = storeSalesManager();

	printf("\nenter id name salary incentive");
	s3 = storeSalesManager();
	
	printf("\n--- SalesManager Information ---");
	displaySalesManager(s1);
	displaySalesManager(s2);
	displaySalesManager(s3);
	

}

SalesManager storeSalesManager()
{
		SalesManager s1;
		scanf("%d%s%d%d",&s1.id,&s1.name,&s1.salary,&s1.incentive);
		return s1;
}

void displaySalesManager(SalesManager s1)
{
	printf("\nid=%d \nname=%s \nsalary=%d \nincentive=%d \ntarget=%d\n ",s1.id,s1.name,s1.salary,s1.incentive,s1.target);
}