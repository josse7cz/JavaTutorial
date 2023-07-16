import java.util.Scanner;

public class VahaBazen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Zadejte průměr bazénu v metrech: ");
        double prumer = scanner.nextDouble();

        System.out.print("Zadejte výšku bazénu v metrech: ");
        double vyska = scanner.nextDouble();

        double objemM3 = vypocetObjemu(prumer, vyska);
        double objemTuny = objemM3;
        scanner.close();
        System.out.println("Do bazénu se vejde " + objemTuny + " tun vody.");
    }

    public static double vypocetObjemu(double prumer, double vyska) {
        double polomer = prumer / 2;
        double objemM3 = Math.PI * Math.pow(polomer, 2) * vyska;
        return objemM3;
    }
}
    
        

