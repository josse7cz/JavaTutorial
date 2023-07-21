import java.util.Scanner;

public class Odmocnina {
    public static void main(String[] args) {
        System.out.println("Program na odmocninu.");
        Scanner sc = new Scanner(System.in);
        System.out.println("Zadejte číslo pro odmocnění.");

        int mocnenec = sc.nextInt();
        sc.close();
        if (mocnenec > 0) {
            double result = Math.sqrt(mocnenec);
            System.out.println("Výsledek: " + result);
        } else {
            System.out.println("Záporné číslo nelze odmocnit");
        }
    }

}
