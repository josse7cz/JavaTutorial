import java.util.Scanner;

/**
 * JitPlavat
 */
public class JitPlavat {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in,"UTF-8");
        System.out.println("Ahoj, jsem program, ktery na základe zadanych informaci vyhodnoti zda jít plavat.");
        System.out.println("Je dnes horko?: A/N: ");
        String horko = sc.nextLine();
        //String horko1=horko.toUpperCase();
        System.out.println("Je den?: A/N: a");
        String den = sc.nextLine();
        //String den1=den.toUpperCase();
        boolean denObsahujePouzeA = den.matches("[aA]+");
        boolean horkoObsahujePouzeA = horko.matches("[aA]+");
        sc.close();

        if(denObsahujePouzeA&&horkoObsahujePouzeA){
            System.out.println("Je čas jít plavat.");
        } 
        else {
            System.out.println("Žádné plavání..");
        }

    }
}