//Time(hour, min, sec) 
typedef struct Time
{
	int hour, min, sec;

}Time;

Time storeTime();
void displayTime(Time);
void main()
{	 
	Time t1,t2,t3;
	t1 = storeTime();
			
	t2 = storeTime();
	
	t3 = storeTime();
	
	printf("\n--- Display Time ---");
	displayTime(t1);
	displayTime(t2);
	displayTime(t3);
	

}

Time storeTime()
{
		Time d1;
		printf("\nenter hour :");
		scanf("%d",&d1.hour);
		printf("\nenter min :");
		scanf("%d",&d1.min);
		printf("\nenter sec :");
		scanf("%d",&d1.sec);

		return d1;
}

void displayTime(Time d1)
{
	printf("\nTime is : ");
	printf(" %d: %d: %d \n ",d1.hour,d1.min,d1.sec);
}