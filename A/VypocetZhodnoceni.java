import java.util.Scanner;

public class VypocetZhodnoceni {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Zadejte částku peněz v bance: ");
        double castka = scanner.nextDouble();

        System.out.print("Zadejte úrok (v procentech): ");
        double urok = scanner.nextDouble();

        System.out.print("Zadejte délku uložení (v dnech): ");
        int doba = scanner.nextInt();

        double konecnaCastka = vypocetKonecneCastky(castka, urok, doba);

        System.out.println("Po uplynutí " + doba + " dní bude v bance " + konecnaCastka + " Kč.");
    }

    public static double vypocetKonecneCastky(double castka, double urok, int doba) {
        double urokDecimal = urok / 100.0;
        double urokDenne = urokDecimal / 365.0;
        double konecnaCastka = castka * Math.pow(1 + urokDenne, doba);
        return konecnaCastka;
    }
}
