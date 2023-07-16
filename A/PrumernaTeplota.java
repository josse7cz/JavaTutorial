import java.util.Scanner;

/**
 * PrumernaTeplota
 */
public class PrumernaTeplota {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in, "Windows-1250");
        System.out.println("Ahoj, jsem Program, který vypočte průměrnou teplotu daného dne.");
        System.out.println("Zadej teplotu ráno: ");
        float rano = scanner.nextFloat();
        System.out.println("Napiš počet hodin: ");
        System.out.println("Zadej teplotu v poledne: ");
        float poledne = scanner.nextFloat();
        System.out.println("Zadej teplotu vecer: ");
        float vecer = scanner.nextFloat();
        
        PrumernaTeplota pt=new PrumernaTeplota();        
        System.out.println("Průměrná denní teplota byla: "+pt.vypoctiPrumernouTeplotu(rano, poledne, vecer)+ " \u00B0C.");
        scanner.close();
    }

public float vypoctiPrumernouTeplotu(float rano, float poledne, float vecer){

    float result = (rano+poledne+vecer)/3;
    return result;
}

}