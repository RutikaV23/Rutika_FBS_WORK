package Assignment_3;

public class SumNum {

	public static void main(String[] args) {
		int start=1 ,end=10 ,sum = 0;
		   System.out.printf("enter the start and end of the number ");
		   while(start <=end)
		   {
		   	    sum = sum + start;
			    start++;
		    }
		   System.out.printf("\n%d",sum);
	}

}
