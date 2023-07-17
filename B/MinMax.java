import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        System.out.println("Program, který načte tři čísla a vypíše minimum a maximum.");
        List<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Zadejte první číslo:");
        list.add(sc.nextInt());
        System.out.println("Zadejte druhé číslo:");
        list.add(sc.nextInt());
        System.out.println("Zadejte třetí číslo:");
        list.add(sc.nextInt());
        System.out.println("Obsah listu:"+list.toString());
        sc.close();
        System.out.println("Maximum: "+Collections.max(list));
        System.out.println("Minimum: "+Collections.min(list));
    }
    
}
