import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int[] numbers = null;
        int n = 0;
        char wybor;

        do {
            Menu.menu();
            wybor = scanner.next().charAt(0);

            if (wybor == '1') {
                System.out.println("Podaj ilość liczb w tablicy: ");
                n = scanner.nextInt();
                numbers = new int[n];

                System.out.println("______________________________________________________________");
                System.out.println("1 - Wprowadź dane ręcznie");
                System.out.println("2 - Wypełnij tablicę losowymi liczbami (1 - 99)");
                System.out.println("______________________________________________________________");
                int t = scanner.nextInt();

                if (t == 1) {
                    for (int i = 0; i < n; i++) {
                        System.out.println("Podaj liczbę nr " + (i + 1) + ": ");
                        numbers[i] = scanner.nextInt();
                    }
                } else if (t == 2) {
                    for (int i = 0; i < n; i++) {
                        numbers[i] = random.nextInt(99) + 1;
                        System.out.println("Liczba nr " + (i + 1) + ": " + numbers[i]);
                    }
                } else {
                    System.out.println("Zły wybór!");
                }

            } else if (wybor == '2') {
                if (numbers == null) {
                    System.out.println("Tablica pusta!");
                } else {
                    for (int i = 0; i < n; i++) {
                        System.out.println(numbers[i]);
                    }
                }

            } else if (wybor == '3') {
                if (numbers == null) {
                    System.out.println("Tablica pusta!");
                } else {
                    Menu.menu3();
                    int p = scanner.nextInt();

                    if (p == 1) {
                        Menu.menu2();
                        int alg = scanner.nextInt();
                        if (alg == 1) {
                            Algorytmy.quickSort(numbers);
                        } else if (alg == 2) {
                            Algorytmy.insertionSort(numbers);
                        } else if (alg == 3) {
                            Algorytmy.bubbleSort(numbers);
                        } else {
                            System.out.println("Nieprawidłowy wybór!");
                        }

                    } else if (p == 2) {
                        Menu.menu2();
                        int alg = scanner.nextInt();
                        if (alg == 1) {
                            Algorytmy.quickSortInverted(numbers);
                        } else if (alg == 2) {
                            Algorytmy.insertionSortInverted(numbers);
                        } else if (alg == 3) {
                            Algorytmy.bubbleSortInverted(numbers);
                        } else {
                            System.out.println("Nieprawidłowy wybór!");
                        }
                    }

                }
            }

        } while (wybor != 'Z' && wybor != 'z');

        scanner.close();
    }
}
