
public class Main {

	public static void main(String[]args) {
		
		int[] array = {12, 45, 23, 76, 29, 6, 52, 38, 67, 47};
		sorter.sort1(array);
        printArray(array);
        
        sorter.sort2(array);
        printArray(array);
        
        sorter.sort3(array);
        printArray(array);
        
        sorter.sort4(array);
        printArray(array);
        
        sorter.sort5(array);
        printArray(array);
	}
	
	public static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
