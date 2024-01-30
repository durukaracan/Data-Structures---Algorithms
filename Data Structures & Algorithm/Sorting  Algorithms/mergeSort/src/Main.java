import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int A[] = new int[8];
        Scanner scanner = new Scanner(System.in);

        System.out.println("merge sort");
        System.out.println("enter 8 elements for merge sort:");
        for (int i = 0; i < 8; i++) {
            A[i] = scanner.nextInt();
        }
        System.out.println("sorting....");
        System.out.println("ilk hali:");
        printArray(A);


        mergeSort(A);

        System.out.println("\n sorted array:");
        printArray(A);

    }

    public static void mergeSort(int array[]) {
        int inputLenght = array.length;

        if (inputLenght < 2) {
            return; // already sorted yapcak bir şey kalmadı
        }

        //şimdiki görevimiz array i 2 ye parçalamak
        int midIndex = inputLenght / 2;
        int leftHalf[] = new int[midIndex];
        int rightHalf[] = new int[inputLenght - midIndex]; // düz midIndex yazsan tek sayılarda algoritman çalışmaz

        //şimdi orijinal arrayden leftHalf ve rightHalf için elemanları alıcaz
        for (int i = 0; i < midIndex; i++) {
            leftHalf[i] = array[i];
        }
        for (int i = midIndex; i < inputLenght; i++) {
            rightHalf[i - midIndex] = array[i];
            //rightHalf[0] dan başlasın diye mid=5 i =5 olduğunu düşün
        }

        //recursive çağırmak için
        mergeSort(leftHalf);
        mergeSort(rightHalf);

        // şimdi 1 1 ayrılan arrayleri merge edicez
        merge(array,leftHalf,rightHalf);

    }

    public static void merge(int[] array, int[] leftHalf, int[] rightHalf) {
        int leftSize = leftHalf.length;
        int rightSize = rightHalf.length;

        // şimdi merge kısmın en karışık yeri 3 tane pointer a ihtiyaç var iterasyon için
        int i = 0, j = 0, k = 0; //i-> left    j-> right    k-> merged array için

        //left veya right da element kalmayana kadar looptayız
        while (i < leftSize && j < rightSize) {
            if (leftHalf[i] <= rightHalf[j]) {
                array[k] = leftHalf[i];
                i++;
            }
            else{
                array[k] = rightHalf[j];
                j++;
            }
            k++;
        }

        //possible leftoversları unutmamak için sıraladık ve sonda 1 eleman kaldı
        while(i < leftSize){
            array[k] = leftHalf[i];
            i++;
            k++;
        }
        while(j < rightSize){
            array[k] = rightHalf[j];
            j++;
            k++;
        }


    }

    public static void printArray(int[] array){
        for (int i=0;i<8;i++){
            System.out.println(array[i] + " ");
        }
    }
}
