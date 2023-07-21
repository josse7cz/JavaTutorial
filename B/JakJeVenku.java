import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static JavaTutorial.MyScanner.*;

public class JakJeVenku {

    public static void main(String[] args) {
        List<String> list = new ArrayList<String>(
                Arrays.asList("Seznam možností: ","1) úmorné vedro", "2) zima", "3) déšť", "4) mlha", "5) tma", "6) chumelenice"));

        System.out.println("Program ");
        System.out.println("Vyberte jednu z variant číslem." + list);
        int i  = scanInt();
        String str = list.get(i);
        jakJeVenku(str);
    }

    public static void jakJeVenku(String key) {
        switch (key) {
            case "1) úmorné vedro":
            System.out.println("Vzít si plavky");

                break;
            case "ě) zima":
            System.out.println("Vezmi kulich");

                break;
            case "3) déšť":
            System.out.println("Vezmi deštník");

                break;
            case "4) mlha":
            System.out.println("Trochu mlha");

                break;
            case "5) tma":
            System.out.println("Vezmi baterku je tma");

                break;
            case "6) chumelenice":
            System.out.println("Lepší být doma.");

                break;

            default:
            System.out.println("Ani jedna z variant.");
                break;
        }
    }
}
