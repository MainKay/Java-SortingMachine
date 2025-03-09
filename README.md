To jest program sortujący i porównujący czas sortowania dla poszczególnych układów i długości tablicy.

Dostępne algorytmy:
1. Quick Sort - Złożoności:
Negatywna: O(n²), Średnia: O(n log n), Pozytywna: O(n log n)

2. Insertion Sort - Złożoności: 
Negatywna: O(n²), Średnia: O(n²), Pozytywna: O(n)

3. Bubble Sort - Złożoności:
Negatywna: O(n²), Średnia: O(n²), Pozytywna: O(n)

Planowane jest poszerzenie tej listy, jak i wprowadzenie testów jednostkowych dla programu.

Ewentualne wprowadzenie opcji (oblicz średnią dla danej liczby sortowań).

Przeprowadzone testy porównawcze dla złożoności:
N - negatywna, Ś - średnia, P - pozytywna;
_____________________________________
A) Dla - 10 losowych liczb w tablicy:

Quick Sort:
N: 11200 ns; Ś: 7800 ns; P: 2800 ns;

Insertion Sort:
N: 2100 ns; Ś: 1900 ns; P: 900 ns;

Bubble Sort:
N: 2600 ns; Ś: 2400 ns; P: 1700 ns;
_____________________________________
B) Dla - 100 losowych liczb w tablicy:

Quick Sort:
N: 64200 ns; Ś: 46900 ns; P: 24500 ns;

Insertion Sort:
N: 100700 ns; Ś: 95300 ns; P: 2600 ns;

Bubble Sort:
N: 424700 ns; Ś: 234000 ns; P: 82800 ns;
_____________________________________
C) Dla - 1000 losowych liczb w tablicy:

Quick Sort:
N: 2055900 ns; Ś: 511600 ns; P: 482800 ns;

Insertion Sort:
N: 3484900 ns; Ś: 2232500 ns; P: 18000 ns;

Bubble Sort:
N: 5096700 ns; Ś: 4601700 ns; P: 855200 ns;
_____________________________________

Wnioski: Quicksort działa szybciej dla dużych tablic, wolniej dla małych (ze względu na większą skomplikowaność, rekurencja itp.).
Próg rekurencyjny - do danej wielkości tablicy używany jest prostszy algorytm, np. Insertion Sort, powyżej Quick Sort.
