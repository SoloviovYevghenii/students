public class MergeSort {

    public static void main(String[] args) {
        int[] arr = { 12, 11, 13, 5, 6, 7 };
        System.out.println("Не сортированный массив");
        printArray(arr);

        MergeSort ob = new MergeSort();
        ob.sort(arr, 0, arr.length - 1);

        System.out.println("\nОтсортированный массив");
        printArray(arr);
    }

   private void merge(int[] arr, int l, int m, int r) {
        int n1 = m - l + 1;
        int n2 = r - m;
        //  временные массиви
        int[] first = new int[n1];
        int[] second = new int[n2];
        // Копировать данные во временные массивы
        for (int i = 0; i < n1; ++i)
            first[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            second[j] = arr[m + 1 + j];
        // Объединить временные массивы
        // Начальные индексы первого и второго подмассивов
        int i = 0, j = 0;
        //Начальный индекс объединенного массива подмассивов
        int k = l;
        while (i < n1 && j < n2) {
            if (first[i] <= second[j]) {
                arr[k] = first[i];
                i++;
            }
            else {
                arr[k] = second[j];
                j++;
            }
            k++;
        }
        // Скопируйте оставшиеся элементы first[], если они есть
        while (i < n1) {
            arr[k] = first[i];
            i++;
            k++;
        }
        // Скопируйте оставшиеся элементы second[], если они есть
        while (j < n2) {
            arr[k] = second[j];
            j++;
            k++;
        }
    }

    // Основная функция, которая сортирует arr[l..r] с помощью
    // объединить()
    void sort(int[] arr, int l, int r){
        if (l < r) {
            // Найдите среднюю точку
            int m = l + (r - l) / 2;
            // Сортировать первую и вторую половины
            sort(arr, l, m);
            sort(arr, m + 1, r);
            // Объединить отсортированные половинки
            merge(arr, l, m, r);
        }
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