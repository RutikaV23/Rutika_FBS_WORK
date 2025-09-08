
public class Salary {

    public static void main(String[] args) {
        double total;
        int salary = 1000;
        double da, ta, hra;

        if (salary <= 5000) {
            da = salary * 0.10;
            ta = salary * 0.20;
            hra = salary * 0.25;
        } else {
            da = salary * 0.15;
            ta = salary * 0.25;
            hra = salary * 0.30;
        }

        total = salary + da + ta + hra; // Total salary includes base + allowances

        System.out.printf("The total salary is : %.2f", total);
    }
}

