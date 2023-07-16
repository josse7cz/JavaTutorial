import java.util.Scanner;

/**
 * PocetLitru
 */
public class PocetLitru {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print ("Zadejte pocet sudů: ");
        int pocet = scanner.nextInt();
        System.out.print ("Zadejte pocet litru jednoho sudu: ");
        int objem = scanner.nextInt();

        System.out.println(vypoctiObjem(pocet, objem));
    
    }

    private static int vypoctiObjem(int pocet, int objem) {
        return pocet*objem;
    }
}