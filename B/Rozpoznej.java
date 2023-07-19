import java.util.Scanner;

public class Rozpoznej {
    public static void main(String[] args) {
        System.out.println("Jsem program, ktery pozna, zda zadany znak je cislo, string, nebo neco jineho.");
        System.out.println("Zadejte znak: ");
        Scanner sc = new Scanner(System.in);
        String znak = sc.next();
        char c = znak.charAt(0);
        sc.close();
        if (Character.isDigit(c)) { 
            System.out.println("Číslo zadáno.");
  
        } else if (Character.isLetter(c)) {
            System.out.println("Zadáno písmeno.");
   
        } else {
            System.out.println("Zadán jíný znak");
        }

       
    }   
    
}
