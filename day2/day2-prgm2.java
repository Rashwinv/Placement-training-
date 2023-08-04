import java.util.*;

public class InsertionSort {
    void insert(int[] a) {
        int n = a.length;
        for (int i = 1; i < n; i++) {
            int temp = a[i];
            int j = i - 1;

            while (j >= 0 && temp <= a[j]) {
                a[j + 1] = a[j];
                j = j - 1;
            }
            a[j + 1] = temp;
        }
    }

    void printArr(int[] a) {
        int n = a.length;
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] a = { 92, 50, 5, 20, 11, 22 };
        InsertionSort insertionSort = new InsertionSort();
        System.out.println("Before sorting, array elements are: ");
        insertionSort.printArr(a);
        insertionSort.insert(a);
        System.out.println("\n\nAfter sorting, array elements are: ");
        insertionSort.printArr(a);
        System.out.println();
    }
}
