package hw13;

public class BubbleSort {
    public static void bubbleSort (int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]){
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public static void main (String[] args) {
        int[] array = {10, 69, 70, 25, 26, 36};
        bubbleSort (array);
        System.out.println ("Sorted array: ");
        for (int i : array) {
            System.out.print (i + " ");
        }
    }
}

