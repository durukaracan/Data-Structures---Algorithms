import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int A[] = new int[6];
        Scanner scanner = new Scanner(System.in);

        System.out.println("insertion sort algo");
        System.out.println("enter 6 elements for insertion sort:");
        for (int i=0; i<6 ;i++){
            A[i]=scanner.nextInt();
        }
        System.out.println("sorting...");
        insertionSort(A);

    }

    public static void insertionSort(int [] array){
        int n =array.length;

        System.out.println("ilk hali:");
        printArray(array);
        for (int j = 1; j < n; j++) {
            int key = array[j];
            int i = j - 1; // i=1'den başlayacak, j=i-1

            while (i >= 0 && array[i] > key) {
                array[i + 1] = array[i];
                i--;
                array[i + 1] = key;
                System.out.println("while ın içi:");
                printArray(array);
            }
            System.out.println("while a girmeden for un içi:");
            printArray(array);
            //array[i + 1] = key;
        }
        System.out.println("son hali:");
        printArray(array);
    }
    public static void printArray(int[] arr) {
        for (int element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}