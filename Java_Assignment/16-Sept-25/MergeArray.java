import java.util.Scanner;

class MergeArray {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of first array:");
        int size1 = sc.nextInt();
        int[] arr1 = new int[size1];

        System.out.println("Enter elements of first array:");
        for (int i = 0; i < size1; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.println("Enter the size of second array:");
        int size2 = sc.nextInt();
        int[] arr2 = new int[size2];

        System.out.println("Enter elements of second array:");
        for (int i = 0; i < size2; i++) {
            arr2[i] = sc.nextInt();
        }

        int[] merged = new int[size1 + size2];

        for (int i = 0; i < size1; i++) {
            merged[i] = arr1[i];
        }

        for (int i = 0; i < size2; i++) {
            merged[size1 + i] = arr2[i];
        }

        // Print merged array
        System.out.println("Merged Array:");
        for (int i = 0; i < merged.length; i++) {
            System.out.print(merged[i] + " ");
        }
    }
}
