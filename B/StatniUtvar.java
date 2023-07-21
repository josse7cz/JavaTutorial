import java.util.Scanner;

public class StatniUtvar {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Zadejte letopočet (od roku 1600): ");
        int rok = scanner.nextInt();
        scanner.close();
        String statniUtvar = zjistiStatniUtvar(rok);

        System.out.println("V roce " + rok + " jsme se nacházeli ve státním útvaru: " + statniUtvar);
    }

    public static String zjistiStatniUtvar(int rok) {
        if (rok >= 1600 && rok < 1867) {
            return "Rakousko";
        } else if (rok >= 1867 && rok < 1918) {
            return "Rakousko-Uhersko";
        } else if (rok >= 1918 && rok < 1939) {
            return "Československá republika";
        } else if (rok >= 1939 && rok < 1945) {
            return "Protektorát Böhmen und Mähren";
        } else if (rok >= 1945 && rok < 1993) {
            return "Československá socialistická republika";
        } else if (rok >= 1993) {
            return "Česká republika";
        } else {
            return "Neznámý státní útvar";
        }
    }
}

