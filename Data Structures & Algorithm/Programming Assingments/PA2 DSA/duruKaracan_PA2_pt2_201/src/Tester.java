import java.util.Arrays;

public class Tester {

    public static void main(String[] args) {
        Tester tester = new Tester();

        //for random array testing 
        System.out.println("RANDOM arrays:\n\n");
        
        int[] array1 = tester.generateRandomArray(10);
        tester.testSort1(Arrays.copyOf(array1, array1.length));

        int[] array2 = tester.generateRandomArray(10);
        tester.testSort2(Arrays.copyOf(array2, array2.length));

        int[] array3 = tester.generateRandomArray(10);
        tester.testSort3(Arrays.copyOf(array3, array3.length));

        int[] array4 = tester.generateRandomArray(10);
        tester.testSort4(Arrays.copyOf(array4, array4.length));

        int[] array5 = tester.generateRandomArray(10);
        tester.testSort5(Arrays.copyOf(array5, array5.length));
        
        System.out.println("*******************************************");
        System.out.println();
        
        
        
        //for ascending array testing
        System.out.println("ASCENDING arrays:\n\n");
        
        int[] ascendingArray = tester.generateAscendingArray(10);
        tester.testSort1(Arrays.copyOf(ascendingArray, ascendingArray.length));
        tester.testSort2(Arrays.copyOf(ascendingArray, ascendingArray.length));
        tester.testSort3(Arrays.copyOf(ascendingArray, ascendingArray.length));
        tester.testSort4(Arrays.copyOf(ascendingArray, ascendingArray.length));
        tester.testSort5(Arrays.copyOf(ascendingArray, ascendingArray.length));
        
        System.out.println("*******************************************");
        System.out.println();

        
        
        //for descending array testing
        System.out.println("DESCENDING arrays:\n\n");
        
        int[] descendingArray = tester.generateDescendingArray(10);
        tester.testSort1(Arrays.copyOf(descendingArray, descendingArray.length));
        tester.testSort2(Arrays.copyOf(descendingArray, descendingArray.length));
        tester.testSort3(Arrays.copyOf(descendingArray, descendingArray.length));
        tester.testSort4(Arrays.copyOf(descendingArray, descendingArray.length));
        tester.testSort5(Arrays.copyOf(descendingArray, descendingArray.length));
        
        System.out.println("********************************************");
        System.out.println();
        
    }

    private void testSort1(int[] arrayCopy) {
        long startTime = System.nanoTime();
        
        System.out.println("Original Array:");
        printArray(arrayCopy);
        System.out.println();
        
        sorter.sort1(arrayCopy);
        
        long endTime = System.nanoTime();
        long duration = (endTime - startTime);
        
        System.out.println("Sorted version:");
        printArray(arrayCopy);
        
        System.out.println();
        System.out.println("SORT 1 took: " + duration );
        
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - -");
    }

    private void testSort2(int[] arrayCopy) {
        long startTime = System.nanoTime();
        
        System.out.println("Original Array:");
        printArray(arrayCopy);
        System.out.println();
        
        sorter.sort2(arrayCopy);
        
        long endTime = System.nanoTime();
        long duration = (endTime - startTime);
        System.out.println("Sorted version:");
        printArray(arrayCopy);
        
        System.out.println();
        System.out.println("SORT 2 took: " + duration );
        
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - -");
    }

    private void testSort3(int[] arrayCopy) {
        long startTime = System.nanoTime();
        
        System.out.println("Original Array:");
        printArray(arrayCopy);
        System.out.println();
        
        sorter.sort3(arrayCopy);
        
        long endTime = System.nanoTime();
        long duration = (endTime - startTime) ;
        
        System.out.println("Sorted version:");
        printArray(arrayCopy);
        
        System.out.println();
        System.out.println("SORT 3 took: " + duration );
        
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - -");
    }

    private void testSort4(int[] arrayCopy) {
        long startTime = System.nanoTime();
        
        System.out.println("Original Array:");
        printArray(arrayCopy);
        System.out.println();
        
        sorter.sort4(arrayCopy);
        
        long endTime = System.nanoTime();
        long duration = (endTime - startTime);
        
       
        System.out.println("Sorted version:");
        printArray(arrayCopy);
        
        System.out.println();
        System.out.println("SORT 4 took: " + duration );
        
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - -");
    }

    private void testSort5(int[] arrayCopy) {
        long startTime = System.nanoTime();
        
        System.out.println("Original Array:");
        printArray(arrayCopy);
        System.out.println();
        
        sorter.sort5(arrayCopy);
        
        long endTime = System.nanoTime();
        long duration = (endTime - startTime);
        
        
        System.out.println("Sorted version:");
        printArray(arrayCopy);
        
        System.out.println();
        System.out.println("SORT 5 took: " + duration  );
        
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - -");
    }

    
    
    
    private int[] generateRandomArray(int size) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = (int) (Math.random() * 10);
        }
        return array;
    }

    private int[] generateAscendingArray(int size) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = i + 1;
        }
        return array;
    }

    private int[] generateDescendingArray(int size) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = size - i;
        }
        return array;
    }
    
    
    
    
    private void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
