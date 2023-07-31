import java.util.Arrays;

public class QuickSort {

    public static void main(String args[]) {
        int[] sortArr = {12, 6, 4, 1, 15, 85, 10};
        System.out.println("Не сортированный массив");
        printArray(sortArr);
        quickSort(sortArr, 0, sortArr.length - 1);
        System.out.println("\nОтсортированный массив");
        printArray(sortArr);
    }

    public static void quickSort(int[] sortArr, int low, int high) {
        //завершить,если массив пуст или уже нечего делить
        if (sortArr.length == 0 || low >= high) return;

        //выбираем опорный элемент
        int middle = low + (high - low) / 2;
        int border = sortArr[middle];

        //разделияем на подмассивы и меняем местами
        int i = low, j = high;
        while (i <= j) {
            while (sortArr[i] < border) i++;
            while (sortArr[j] > border) j--;
            if (i <= j) {
                int swap = sortArr[i];
                sortArr[i] = sortArr[j];
                sortArr[j] = swap;
                i++;
                j--;
            }
        }

        //рекурсия для сортировки левой и правой части
        if (low < j) quickSort(sortArr, low, j);
        if (high > i) quickSort(sortArr, i, high);
    }

    // Вспомогательная функция для печати массива размера n
    private static void printArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; ++i){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}