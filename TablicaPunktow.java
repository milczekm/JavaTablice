package tablice;

import java.util.Scanner;

public class TablicaPunktow {

    static void przesun(Punkt[] tp, double dx, double dy) {
        for (int i = 0; i < tp.length; i++) {
            tp[i].przesun(dx, dy);
        }
    }

    static Punkt max(Punkt[] punkty) {

        Punkt p = new Punkt(punkty[0]);
        for (int i = 1; i < punkty.length; i++) {
            if (punkty[i].getX() > p.getX()) {
                p.setX(punkty[i].getX());
            }

            if (punkty[i].getY() > p.getY()) {
                p.setY(punkty[i].getY());
            }
        }

        return p;
    }

    public static void main(String[] args) {

        Punkt[] tab = {new Punkt(0, 0), new Punkt(10, 0), new Punkt(5, 5)};

        for (int i = 0; i < tab.length; i++) {
            System.out.println("tab[" + i + "]" + "=" + tab[i].toString());
        }
        Scanner scanner = new Scanner(System.in, "cp1250");
        Punkt p = new Punkt();
        System.out.print("Podaj wspolrzedna x wektora o jaki przesunac elementy tablicy: ");
        p.setX(scanner.nextInt());

        System.out.print("Podaj wspolrzedna y wektora o jaki przesunac elementy tablicy: ");
        p.setY(scanner.nextInt());

        przesun(tab, p.getX(), p.getY());

        System.out.println("Nowa tablica przesunieta o zadany wektor: ");

        for (int i = 0; i < tab.length; i++) {
            System.out.println("tab[" + i + "]" + "=" + tab[i].toString());
        }
        Punkt p1 = new Punkt(max(tab));
        System.out.println("Punkt z tablicy o najwiekszych wspolrzednych x i y sposrod punktow tablicy: " + p1.toString());
    }
}
