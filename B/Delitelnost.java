import java.util.Scanner;

public class Delitelnost {
    public static void main(String[] args) {
    System.out.println("Program, který zjistí, zda jsou zadaná čísla dělitelná.");
    Scanner sc = new Scanner(System.in);
    System.out.println("Zadejte první číslo: ");
    int a = sc.nextInt();
    System.out.println("Zadejte druhé číslo: ");
    int b = sc.nextInt();
    sc.close();
    if(a%b==0){
        System.out.println("Jsou dělitelná.");
    }else{
        System.out.println("Nedělitelná.");
    }



    }
    
}
