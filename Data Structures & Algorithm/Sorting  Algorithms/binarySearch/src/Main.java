import java.util.Scanner;
public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int A[] = new int [101];
        int i;
        for(i=1;i<=100;i++){
            A[i-1]=i;
        }


        System.out.println("binary search algo");
        System.out.println("algo will search your key number in 1-99");
        System.out.println("enter the key element:");
        int key =scanner.nextInt();


        System.out.println("searching...");
        binarySearch(A,key);



    }

    static int binarySearch(int[] array,int key){

        int low = array[0];
        int high = array.length-1 ;
        int counter = 0;

        while (low<=high){
            int mid = (low + high)/2;

            if ( mid == key ){
                System.out.println("("+ high + " + " + low + ")" + "/2");
                System.out.println("key = " + mid);
                return mid; // elementi bulduk
            }
            else if ( mid < key ){
                counter++;
                System.out.println(counter + ". sefer oldu mid =" + mid);
                System.out.println("sol tarafı attık");
                low = mid + 1; // sol tarafı attık
                System.out.println("yeni low = " + low);
                System.out.println("------------------");

            }
            else if ( mid > key ){
                counter++;
                System.out.println(counter + ". sefer oldu mid =" + mid);
                System.out.println("sağ tarafı attık");
                high = mid - 1; // sağ tarafı attık
                System.out.println("yeni high = " + high);
                System.out.println("------------------");
            }
        }
        return -1; // element not found
    }

}