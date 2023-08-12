
    public class BinarySearch {

        public static void binarySearch(int[] arr, int target) {
            int left = 0;
            int right = arr.length - 1;

            while (left <= right) {
                int mid = left + (right - left) / 2;

                if (arr[mid] == target) {
                    System.out.printf("Element index is: %d\n", mid);
                    return;
                }

                if (arr[mid] < target)
                    left = mid + 1;

                else
                    right = mid - 1;
            }

            System.out.printf("Element %d not found\n", target);
        }
    }


