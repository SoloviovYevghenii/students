import java.util.Random;

public class QuickSort {
    public static void quickSort(int[] array) {
        int low = 0;
        int high = array.length - 1;
        quickSort(array, low, high);
    }

    private static void quickSort(int[] array, int low, int high) {
        if (low < high) {
            int partitionIndex = partition(array, low, high);
            quickSort(array, low, partitionIndex - 1);
            quickSort(array, partitionIndex + 1, high);
        }
    }

    private static int partition(int[] array, int low, int high) {
        // select random pivot
        Random random = new Random();
        int randomIndex = random.nextInt(high - low + 1) + low;
        swap(array, randomIndex, high);

        int pivot = array[high]; // pivot element
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (array[j] <= pivot) {
                i++;
                swap(array, i, j);
            }
        }
        swap(array, i + 1, high);
        return i + 1;
    }

    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}