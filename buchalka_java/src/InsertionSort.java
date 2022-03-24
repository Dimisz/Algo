import java.lang.reflect.Array;
import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {20, 35, -15, 7, 55, 1, -22};
        System.out.println(Arrays.toString(arr));
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void swap(int[] array, int indexToSwap, int lastIndex){
        int temp = array[indexToSwap];
        array[indexToSwap] = array[lastIndex];
        array[lastIndex] = temp;
    }

    public static void insertionSort(int[] array){
        for(int i = 0; i < array.length; i++){
            int firstUnsortedIndex = i + 1;
            for(int j = 0; j < firstUnsortedIndex; j++){
                if(array[i] < array[j]){
                    swap(array, i, j);
                }
            }
        }
    }
}
