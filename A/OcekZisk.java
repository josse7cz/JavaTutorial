import java.util.Scanner;

public class OcekZisk {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ahoj, jsem Program, který vypočte procenta zisku.");
        System.out.print ("Zadejte očekávanou hodnotu: ");
        double ocekavana = scanner.nextDouble();

        System.out.print ("Zadejte skutecnou hodnotu: ");
        double skutecna = scanner.nextDouble();
        double vysledek =(skutecna/ocekavana)*100;
        String formatovanyVysledek = String.format("%.2f", vysledek);

        System.out.print ("Výsledek je: "+formatovanyVysledek+"%.");
        scanner.close();
      
    }
    
}
