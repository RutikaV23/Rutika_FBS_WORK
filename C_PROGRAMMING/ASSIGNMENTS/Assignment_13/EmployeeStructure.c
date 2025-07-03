typedef struct Employee
{
	int id;
	char name[20];
	int salary;

}Employee;
Employee storeEmployee();
void displayEmployee(Employee );

void main()
{	 
	Employee  e1,e2,e3;
	printf("\nenter id name and salary");
	e1 = storeEmployee();
		
	printf("\nenter id name and salary");
	e2 = storeEmployee();

	printf("\nenter id name and salary");
	e3 = storeEmployee();
	
	
	displayEmployee(e1);
	displayEmployee(e2);
	displayEmployee(e3);
	
//	printf("\nid=%d \nname=%s \nsalary=%d\n ",e1.id,e1.name,e1.salary);
//	printf("\nid=%d \nname=%s \nsalary=%d\n ",e2.id,e2.name,e2.salary);
//	printf("\nid=%d \nname=%s \nsalary=%d ",e3.id,e3.name,e3.salary);

}

Employee storeEmployee()
{
		Employee e1;
		scanf("%d%s%d",&e1.id,e1.name,&e1.salary);
		return e1;
}

void displayEmployee(Employee e1)
{
	printf("\nid=%d \nname=%s \nsalary=%d\n ",e1.id,e1.name,e1.salary);

}