import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = { 20, 35, -15, 7, 55, 1, -22};
        System.out.println("Before sorting...");
        System.out.println(Arrays.toString(array));
        System.out.println("After sorting...");
        bubbleSort(array);
        System.out.println(Arrays.toString(array));
    }

    public static void swap(int[] array, int i, int j){
        if(array.length > 1 && i != j){
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
    }

    public static void bubbleSort(int[] array){
        if(array.length > 1){

            for(int lastUnsortedIndex = array.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--){
                for(int i = 0; i < lastUnsortedIndex; i++){
                    if(array[i] > array[i+1]){
                        swap(array, i, i+1);
                    }
                }
            }
        }
    }
}
