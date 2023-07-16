import java.util.Scanner;
public class DruhaMocninaCisla {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DruhaMocninaCisla druha = new DruhaMocninaCisla();
        System.out.println("Zadejte číslo, které chcete převést na druhou");
        double n= sc.nextDouble();
        System.out.println(druha.vratMocninu(n));
        sc.close();
             
    }
    
    public double vratMocninu(double mocnenec){
        double m=2;
        return Math.pow(mocnenec,m);
    }
    
}
