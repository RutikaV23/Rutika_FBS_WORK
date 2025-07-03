typedef struct Admin 
{
	int id;
	char name[20];
	int salary;
	int allowance;

}Admin ;

Admin storeAdmin();
void displayAdmin(Admin);
void main()
{	 
	Admin  a1,a2,a3;
	printf("\nenter id name  salary allowance");
	a1 = storeAdmin();
		
	printf("\nenter id name salary allowance");
	a2 = storeAdmin();

	printf("\nenter id name salary allowance");
	a3 = storeAdmin();
	
	printf("\n--- Admin Information ---");
	displayAdmin(a1);
	displayAdmin(a2);
	displayAdmin(a3);
	

}

Admin storeAdmin()
{
		Admin a1;
		scanf("%d%s%d%d",&a1.id,a1.name,&a1.salary,&a1.allowance);
		return a1;
}

void displayAdmin(Admin a1)
{
	printf("\nid=%d \nname=%s \nsalary=%d \nallowance=%d\n ",a1.id,a1.name,a1.salary,a1.allowance);

}