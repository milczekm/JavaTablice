package tablice;

import java.util.Arrays;
import java.util.Scanner;

public class TablicaKwadratow {

    public static void wyswietl(int[] tab) {
        System.out.println("Rozmiar tablicy : " + tab.length);
        for (int i = 0; i < tab.length; i++) {
            System.out.println("Element " + i + ": " + tab[i]);
        }
    }

    public static void zwieksz(int[] tab, int wartosc) {
        for (int i = 0; i < tab.length; i++) {
            tab[i] = tab[i] + wartosc;
        }
    }

    public static int[] zwiekszona(int[] tab, int wartosc) {
        int[] tab1 = new int[tab.length];
        for (int i = 0; i < tab1.length; i++) {
            tab1[i] = tab[i] + wartosc;
        }
        return tab1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in, "cp1250");

        System.out.print("Podaj dlugosc tablicy: ");
        int n = scanner.nextInt();

        int[] tab = new int[n];

        for (int i = 0; i < tab.length; i++) {
            tab[i] = i * i;
        }

        System.out.println("Tablica kwadrat.");

        wyswietl(tab);

        System.out.print("Podaj o ile zwiekszyc‡ tablice: ");
        int wartosc = scanner.nextInt();

        zwieksz(tab, wartosc);
        wyswietl(tab);

        System.out.print("Podaj o ile zwiekszyc‡ nowoutworzona tablice: ");
        wartosc = scanner.nextInt();

        System.out.println("Tablica nowo utworzona: " + Arrays.toString(zwiekszona(tab, wartosc)));

        System.out.println("Tablica niezmieniona: " + Arrays.toString(tab));

    }

}
