import java.util.Arrays;
import java.util.Comparator;

public class MergeSort {

    public static <T extends Comparable<T>> void mergeSort(T[] array) {
        int inputLength = array.length;
        if (inputLength < 2) {
            return;
        }

        int midIndex = inputLength / 2;
        T[] leftHalf = Arrays.copyOfRange(array, 0, midIndex);
        T[] rightHalf = Arrays.copyOfRange(array, midIndex, inputLength);

        mergeSort(leftHalf);
        mergeSort(rightHalf);
        merge(array, leftHalf, rightHalf);
    }

    public static <T> void mergeSort(T[] array, Comparator<T> comparator) {
        int inputLength = array.length;
        if (inputLength < 2) {
            return;
        }

        int midIndex = inputLength / 2;
        T[] leftHalf = Arrays.copyOfRange(array, 0, midIndex);
        T[] rightHalf = Arrays.copyOfRange(array, midIndex, inputLength);

        mergeSort(leftHalf, comparator);
        mergeSort(rightHalf, comparator);
        merge(array, leftHalf, rightHalf, comparator);
    }


    private static <T extends Comparable<T>> void merge(T[] array, T[] leftHalf, T[] rightHalf) {
        int leftSize = leftHalf.length;
        int rightSize = rightHalf.length;

        int i = 0, j = 0, k = 0;

        while (i < leftSize && j < rightSize) {
            if (leftHalf[i].compareTo(rightHalf[j]) >= 0) {
                array[k] = leftHalf[i];
                i++;
            } else {
                array[k] = rightHalf[j];
                j++;
            }
            k++;
        }

        while (i < leftSize) {
            array[k] = leftHalf[i];
            i++;
            k++;
        }
        while (j < rightSize) {
            array[k] = rightHalf[j];
            j++;
            k++;
        }
    }

    private static <T> void merge(T[] array, T[] leftHalf, T[] rightHalf, Comparator<T> comparator) {
        int leftSize = leftHalf.length;
        int rightSize = rightHalf.length;

        int i = 0, j = 0, k = 0;

        while (i < leftSize && j < rightSize) {
            if (comparator.compare(leftHalf[i], rightHalf[j]) <= 0)  {
                array[k] = leftHalf[i];
                i++;
            } else {
                array[k] = rightHalf[j];
                j++;
            }
            k++;
        }

        while (i < leftSize) {
            array[k] = leftHalf[i];
            i++;
            k++;
        }
        while (j < rightSize) {
            array[k] = rightHalf[j];
            j++;
            k++;
        }
    }
}
