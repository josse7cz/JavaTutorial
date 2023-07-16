import java.util.Scanner;

public class VypocetKruhu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print ("Zadejte průměr kruhu: ");
        double prumer = scanner.nextDouble();

        double plocha = vypocetPlochy(prumer);
        double obvod = vypocetObvodu(prumer);

        System.out.println("Plocha kruhu je: " + plocha);
        System.out.println("Obvod kruhu je: " + obvod);
        scanner.close();
    }

    public static double vypocetPlochy(double prumer) {
        double polomer = prumer / 2;
        double plocha = Math.PI * Math.pow(polomer, 2);
        return plocha;
    }

    public static double vypocetObvodu(double prumer) {
        double obvod = Math.PI * prumer;
        return obvod;
    }
}
