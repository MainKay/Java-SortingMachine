public class Menu {

    public static void menu() {
        System.out.println("______________________________________________________________");
        System.out.println("Ten program służy do sortowania liczb całkowitych,");
        System.out.println("a także porównywania czasu ich sortowania.");
        System.out.println("Wybierz opcję:");
        System.out.println("1. Wczytaj liczby.");
        System.out.println("2. Stan tablicy.");
        System.out.println("3. Sortuj liczby.");
        System.out.println("______________________________________________________________");
        System.out.println();
        System.out.println("Wciśnij 'z', aby zakończyć program.");
    }

    public static void menu2() {
        System.out.println("______________________________________________________________");
        System.out.println("Wybierz algorytm sortujący:");
        System.out.println("1. Quick Sort, złożoność:");
        System.out.println("Negatywna: O(n²), Średnia: O(n log n), Pozytywna: O(n log n)");
        System.out.println();
        System.out.println("2. Insertion Sort, złożoność:");
        System.out.println("Negatywna: O(n²), Średnia: O(n²), Pozytywna: O(n)");
        System.out.println();
        System.out.println("3. Bubble Sort, złożoność:");
        System.out.println("Negatywna: O(n²), Średnia: O(n²), Pozytywna: O(n)");
        System.out.println("______________________________________________________________");
        System.out.println();
    }

    public static void menu3() {
        System.out.println("______________________________________________________________");
        System.out.println("Wybierz, rodzaj sortowania:");
        System.out.println("1. Rosnąco");
        System.out.println("2. Malejąco");
        System.out.println("______________________________________________________________");
        System.out.println();
    }
}
