import java.util.Scanner;

public class Vyraz {
    public static void main(String[] args) {
        System.out.println("Program, který vrátí výsledek výrazu 1/(x.y).");
        Scanner sc = new Scanner(System.in);
        System.out.println("Zadejte hodnotu a: ");
        double a = sc.nextDouble();
        System.out.println("Zadejte hodnotu b: ");
        double b = sc.nextDouble();
        sc.close();
        if (a==0||b==0){
            System.out.println("Nulou nelze dělit");

        }else{
            System.out.println("Výsledek: "+1/(b*a));
        }
    }
    
}
