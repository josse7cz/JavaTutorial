import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class JmenoVyska {
    public static void main(String[] args) {
        System.out.println("Program, který načte jméno a výšku žáka a vypíše vypíše vyššího.");
        HashMap<String, Integer> zaci = new HashMap<String, Integer>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Zadejte jméno:");
        String jmeno = sc.nextLine();
        System.out.println("Zadejte výšku:");
        int vyska = sc.nextInt();
        zaci.put(jmeno, vyska);
        // Skip the newline 
        sc.nextLine();
        System.out.println("Zadejte jméno druhého žáka:");
        jmeno = sc.nextLine();
        System.out.println("Zadejte výšku druhého žáka:");
        vyska = sc.nextInt();
        zaci.put(jmeno, vyska);
        sc.close();
        System.out.println("Nejvyšší chlapec: "+Collections.max(zaci.entrySet(), Map.Entry.comparingByValue()).getKey());
        System.out.println("Menší chlapec: "+Collections.min(zaci.entrySet(), Map.Entry.comparingByValue()).getKey());
    }
}
