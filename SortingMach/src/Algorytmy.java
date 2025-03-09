public class Algorytmy {

    public static int innerPivot(int[] innerTab) {
        int suma = 0;
        for (int i = 0; i < innerTab.length; i++) {
            suma += innerTab[i];
        }
        return suma / innerTab.length;
    }

    public static int[] quickSort(int[] tab) {
        long startTime = System.nanoTime();
        quickSortRecursive(tab, 0, tab.length - 1);
        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        System.out.println("QuickSort rosnąco - Posortowano w: " + duration + " ns.");
        return tab;
    }

    public static void quickSortRecursive(int[] tab, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(tab, low, high);
            quickSortRecursive(tab, low, pivotIndex - 1);
            quickSortRecursive(tab, pivotIndex + 1, high);
        }
    }

    public static int partition(int[] tab, int low, int high) {
        int pivot = tab[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (tab[j] <= pivot) {
                i++;
                int box = tab[i];
                tab[i] = tab[j];
                tab[j] = box;
            }
        }
        int box = tab[i + 1];
        tab[i + 1] = tab[high];
        tab[high] = box;
        return i + 1;
    }

    public static int[] quickSortInverted(int[] tab) {
        long startTime = System.nanoTime();
        quickSortRecursiveInverted(tab, 0, tab.length - 1);
        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        System.out.println("QuickSort malejąco - Posortowano w: " + duration + " ns.");
        return tab;
    }

    public static void quickSortRecursiveInverted(int[] tab, int low, int high) {
        if (low < high) {
            int pivotIndex = partitionInverted(tab, low, high);
            quickSortRecursiveInverted(tab, low, pivotIndex - 1);
            quickSortRecursiveInverted(tab, pivotIndex + 1, high);
        }
    }

    public static int partitionInverted(int[] tab, int low, int high) {
        int pivot = tab[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (tab[j] >= pivot) {
                i++;
                int box = tab[i];
                tab[i] = tab[j];
                tab[j] = box;
            }
        }
        int box = tab[i + 1];
        tab[i + 1] = tab[high];
        tab[high] = box;
        return i + 1;
    }

    public static void readNumbers(int[] tab) {
        for (int i = 0; i < tab.length; i++) {
            System.out.println(tab[i]);
        }
    }

    public static int[] insertionSort(int[] tab) {
        long startTime = System.nanoTime();

        int box;
        for (int i = 1; i < tab.length; i++) {
            box = tab[i];
            int j = i - 1;

            while (j >= 0 && tab[j] > box) {
                tab[j + 1] = tab[j];
                j--;
            }

            tab[j + 1] = box;
        }

        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        System.out.println("InsertionSort rosnąco - Posortowano w: " + duration + " ns.");

        return tab;
    }

    public static int[] insertionSortInverted(int[] tab) {
        long startTime = System.nanoTime();

        int box;
        for (int i = 1; i < tab.length; i++) {
            box = tab[i];
            int j = i - 1;

            while (j >= 0 && tab[j] < box) {
                tab[j + 1] = tab[j];
                j--;
            }

            tab[j + 1] = box;
        }

        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        System.out.println("InsertionSort malejąco - Posortowano w: " + duration + " ns.");

        return tab;
    }

    public static int[] bubbleSort(int[] tab) {
        long startTime = System.nanoTime();
        int box;
        int i, j;
        for (j = 0; j < tab.length - 1; j++) {
            for (i = 0; i < tab.length - 1 - j; i++) {
                if (tab[i] > tab[i + 1]) {
                    box = tab[i];
                    tab[i] = tab[i + 1];
                    tab[i + 1] = box;
                }
            }
        }
        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        System.out.println("Bubblesort rosnąco - Posortowano w: " + duration + " ns.");
        return tab;
    }

    public static int[] bubbleSortInverted(int[] tab) {
        long startTime = System.nanoTime();
        int box;
        int i, j;
        for (j = 0; j < tab.length - 1; j++) {
            for (i = 0; i < tab.length - 1 - j; i++) {
                if (tab[i] < tab[i + 1]) {
                    box = tab[i];
                    tab[i] = tab[i + 1];
                    tab[i + 1] = box;
                }
            }
        }
        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        System.out.println("Bubblesort malejąco - Posortowano w: " + duration + " ns.");
        return tab;
    }
}
