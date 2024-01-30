// selection sort genel olarak
// array de index 0, i ye eşit ve min index olarak başlatıyorsun
// teker teker elementleri arayıp min sayıyı içeren indexi buluyorsun
// ve i nin olduğu index e koyuyorsun

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A[] = new int[9];

        System.out.println("selection sort algo");
        System.out.println("enter a 9 element for a create an array:");
        for(int a=0;a<9;a++){
            A[a]=scanner.nextInt();
        }
        System.out.println("sorting....");
        selectionSort(A);

    }

    public static void selectionSort(int[] array){
        int n = array.length;
        System.out.println("array in ilk hali:");
        for (int i=0; i<n;i++){
            System.out.print(array[i] + " ");
        }
        System.out.println("\n--------------------");
        for (int i=0; i<n ; i++){

            int minIndex = i;
            for(int j=i+1; j<n ; j++){
                if ( array[j] < array[minIndex] ){
                    minIndex = j;
                }
            }

            /*yeri değişenler print
            System.out.println(i + ".index =" +array[i]+ " ile " + minIndex + ".index =" + array[minIndex] + " yeri değişti"); */


            //tüm her yer ile karşılaştırdı
            // şimdi bulduğu min indexdeki sayı ile i nin olduğu indexdeki sayıları swap edicek
            int temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;

            //print kısmı
            System.out.println(i + ". indexi doğru yerine yerleştirdik.");
            for (int a=0; a<n;a++){
                System.out.print(array[a] + " ");
            }
            System.out.println("\n--------------------");

        }

        System.out.println("array in son hali:");
        for (int i=0; i<n;i++){
            System.out.print(array[i] + " ");
        }


    }
}