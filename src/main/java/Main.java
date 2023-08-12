import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = { 5, 9, 3, 1, 8, 6, 2, 7, 4 };
        System.out.printf("Array: %s\n", Arrays.toString(array));

        // Quick Sort
        quickSort(array);
        System.out.printf("Quick Sort: %s\n", Arrays.toString(array));

        // Merge Sort
        MergeSort.mergeSort(array);
        System.out.printf("Merge Sort: %s\n", Arrays.toString(array));

        // Binary Search
        int target = 7;
        binarySearch(array, target);

        // Simple Tree
        SimpleTree tree = new SimpleTree();
        tree.add(8);
        tree.add(3);
        tree.add(10);
        tree.add(1);
        tree.add(6);
        tree.add(14);
        tree.add(4);

        tree.add(7);
        tree.add(13);

        System.out.println("Depth First Traversal:");
        tree.traverseDepthFirst();
        System.out.println();

        System.out.println("Breadth First Traversal:");
        tree.traverseBreadthFirst();
        System.out.println();
    }

    private static void quickSort(int[] array) {
    }

    private static void binarySearch(int[] array, int target) {
    }
}