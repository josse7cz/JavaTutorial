import static JavaTutorial.MyScanner.*;
public class ObvodObsah {
    public static void main(String[] args) {
        System.out.println("Program, který zkoumá, zda se jedná o obdélník, či čtverec a vrátí jejich objem a obsah");
        System.out.println("zadejte výšku v cm: ");
        int a = scanInt();
        System.out.println("zadejte šířku v cm: ");
        scanLine();
        int b = scanInt();
        
        if (a==b){
            System.out.println("Čtverec má obvod "+vypoctiObvod(a,b)+"cm");
            System.out.println("Čtverec má objem "+vypoctiObsah(a,b)+"cm\u00B2");

        }else{
            System.out.println("Obdélník má obvod "+vypoctiObvod(a,b)+ "cm");
            System.out.println("Obdélník má objem "+vypoctiObsah(a,b)+"cm\u00B2") ;

        }
    }
    public static int vypoctiObvod(int a, int b){
        return 2*(a)+2*(b);
    }
    public static int vypoctiObsah(int a, int b){
        return (a*b);
    }
    
}
