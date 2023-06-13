package refactor;
import java.util.Scanner;

public class Array1 {

    public static void main(String[] args) {
        System.out.println("Đề bài: Viết chương trình Java nhập một mảng số nguyên a0, a1, a2, ..., an-1. Hãy sắp xếp mảng theo thứ tự tăng dần");

        int[] arr = enterArrayElements();
        arr = sortArrayAscending(arr);
        displaySortedArray(arr);
    }

    public static int[] enterArrayElements() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số phần tử của mảng: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.print("Nhập các phần tử của mảng:\n");
        
        for (int i = 0; i < n; i++) {
            System.out.printf("a[%d] = ", i);
            arr[i] = scanner.nextInt();
        }
        return arr;
    }

    public static int[] sortArrayAscending(int[] arr) {
        int temp;
        for (int i = 0; i <arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        return arr;
    }

    public static void displaySortedArray(int[] arr) {
        System.out.println("Dãy số được sắp xếp tăng dần:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
