import java.util.Scanner;

public class PrevodNaUhel {
   
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in, "Windows-1250");
        System.out.println("Ahoj, jsem Program, který převede radiány na úhel.");
        System.out.println("Zadej hodnotu v  radiánech: ");
        double rad = scanner.nextDouble();
        
        PrevodNaUhel pu=new PrevodNaUhel();        
        System.out.println("Hodnota ve stupních: "+pu.prevedNaUhel(rad)+ " \u00B0.");
        System.out.println("A jeste jednou:"+Math.toDegrees(rad));
        scanner.close(); 
    }

        private double prevedNaUhel(double rad) {
            return rad*(180/Math.PI);
        }
    
}
