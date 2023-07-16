import java.util.Scanner;

/**
 * RychlostBezce
 */
public class RychlostBezce {

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in, "Windows-1250");
        String kmh= "km/h";  
        System.out.println("Ahoj, jsem Program, který vypočítá průměrnou rychlost běžce.");
        System.out.println("Zadej uběhnutou vzdálenost v metrech: ");
        double metru = scanner.nextDouble();
        System.out.println("Zadej čas ve vteřinách: ");
        double vterin = scanner.nextDouble();
        
        RychlostBezce rb=new RychlostBezce(); 
        double result = rb.prumernaRychlost(metru,vterin);
        scanner.close();

        //System.out.println("Průměrná rychlost: "+result+ " Km/h.");
    }

    private double prumernaRychlost(double metru, double vterin) {
        double vysledek=(metru/vterin)*3.6;
        return vysledek;
    }
}