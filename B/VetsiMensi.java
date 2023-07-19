import java.util.Scanner;

public class VetsiMensi {
    public static void main(String[] args) {
        System.out.println("Vyhodnoceni, které číslo je větší.");
        System.out.println("Zadejte číslo 1: ");
        Scanner sc = new Scanner(System.in);
        int cislo = sc.nextInt();
        System.out.println("Zadejte číslo 2: ");
        sc.nextLine();
        int cislo2 = sc.nextInt();
        sc.close();
        if (cislo>cislo2){
            System.out.println("Číslo zadané jako první je větší.");

        }else if (cislo2>cislo){
            System.out.println("Číslo zadané jako druhé je větší.");

        }else{
            System.out.println("Čísla jsou stejná.");
        }


    }
    
}
