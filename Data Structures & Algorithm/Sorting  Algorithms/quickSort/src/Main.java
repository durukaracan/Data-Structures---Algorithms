import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int A[] = new int [8];
        Scanner scanner = new Scanner(System.in);

        System.out.println("quick sort");
        System.out.println("enter 8 elements for quick sort:");
        for(int i=0; i<8; i++){
            A[i]=scanner.nextInt();
        }
        System.out.println("sorting...");
        System.out.println("ilk hali:");
        printArray(A);

        quickSort(A,0, A.length - 1);

        System.out.println("\n--------------");
        System.out.println("son hali:");
        printArray(A);
    }

    public static void quickSort(int[] array, int low, int high){
        if(low<high){
            int pivotIndex = partition(array, low, high);
            quickSort(array, low, pivotIndex - 1);
            quickSort(array, pivotIndex + 1, high);
        }
    }

    public static int partition(int[]array, int low, int high){
        int pivot = array[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            
            if (array[j] <= pivot) {
                i++;
                swap(array, i, j);
            }
        }

        swap(array, i + 1, high);
        return i + 1;
    }

    public static void swap(int array[], int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }


    public static void printArray(int[] array){
        for(int i=0; i<8; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println("");
    }
}