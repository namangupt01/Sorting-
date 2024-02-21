import java.util.Scanner;

public class merge {

    public static int[] mergeSort(int[] arr, int lb, int ub) {
        if (lb < ub) {
            int mid = (lb + ub) / 2;
            mergeSort(arr, lb, mid);
            mergeSort(arr, mid + 1, ub);
            merge(arr, lb, mid, ub);
        }
        return arr;
    }

    public static void merge(int[] arr, int lb, int mid, int ub) {
        int i = lb;
        int j = mid + 1;
        int k = lb;
        int[] arr2 = new int[arr.length]; // Corrected: Use arr.length instead of fixed size 10

        while (i <= mid && j <= ub) {
            if (arr[i] <= arr[j]) {
                arr2[k] = arr[i];
                i++;
            } else {
                arr2[k] = arr[j];
                j++;
            }
            k++;
        }

        while (i <= mid) {
            arr2[k] = arr[i];
            k++;
            i++;
        }

        while (j <= ub) {
            arr2[k] = arr[j];
            k++;
            j++;
        }

        for (int m = lb; m <= ub; m++) {
            arr[m] = arr2[m];
        }
    }

    public static void main(String[] args) {
        int arr[] = new int[10];
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 10 integers:");
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }

        int lb = 0;
        int ub = arr.length - 1;

        mergeSort(arr, lb, ub);

        System.out.println("Sorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}
