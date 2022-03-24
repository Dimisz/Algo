import java.lang.reflect.Array;
import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {20, 55, 35, -15, 7, -22, 1};
        System.out.println(Arrays.toString(arr));
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void swap(int[] array, int indexToSwap, int lastIndex){
        int temp = array[indexToSwap];
        array[indexToSwap] = array[lastIndex];
        array[lastIndex] = temp;
    }

    public static void selectionSort(int[] array){ //O(n^2)
    // only one swap per iteration
        // a bit more efficient than bubble sort
        for(int lastIndex = array.length - 1; lastIndex > 0; lastIndex--) {
            int maxIndex = 0;
            for (int i = 0; i <= lastIndex; i++) {
                if (array[i] > array[maxIndex]) {
                    maxIndex = i;
                }
            }
            if (array[maxIndex] > array[lastIndex]) {
                swap(array, maxIndex, lastIndex);
            }
        }
    }
}
