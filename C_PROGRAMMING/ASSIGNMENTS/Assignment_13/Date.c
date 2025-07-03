//Date (date, month, year) 
typedef struct Date 
{
	int month, year, date;

}Date;

Date storeDate();
void displayDate(Date);
void main()
{	 
	Date d1,d2,d3;
	d1 = storeDate();
			
	d2 = storeDate();
	
	d3 = storeDate();
	
	printf("\n--- Display Date ---");
	displayDate(d1);
	displayDate(d2);
	displayDate(d3);
	

}

Date storeDate()
{
		Date d1;
		printf("\nenter date :");
		scanf("%d",&d1.date);
		printf("\nenter month :");
		scanf("%d",&d1.month);
		printf("\nenter year :");
		scanf("%d",&d1.year);

		return d1;
}

void displayDate(Date d1)
{
	printf("\ndate=%d \nmonth=%d \nyear=%d \n ",d1.date,d1.month,d1.year);
}