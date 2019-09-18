package tablice;

public class DlugoscLamanej {

    static double dlugoscLamanej(Punkt[] lamana) {
        double dlugosc = 0.0;
        for (int i = 0; i < lamana.length - 1; i++) {
            dlugosc += lamana[i].odleglosc(lamana[i + 1]);
        }
        return dlugosc;
    }

    public static void main(String[] args) {

        Punkt[] trojkat = {
            new Punkt(0, 0),
            new Punkt(3, 0),
            new Punkt(3, 4),
            new Punkt(0, 0)
        };

        System.out.println(dlugoscLamanej(trojkat));

    }

}
