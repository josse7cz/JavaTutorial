import java.util.Scanner;

public class VypoctiPreponu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in, "Windows-1250");
        System.out.println("Ahoj, jsem Program, který vypočte přeponu.");
        System.out.println("Zadej stranu a: ");
        double a = scanner.nextDouble();
        System.out.println("Zadej stranu b: ");
        double b = scanner.nextDouble();
        
        VypoctiPreponu vp=new VypoctiPreponu(); 
        double result = vp.vypoctiPreponu(a,b);
        System.out.println("Strana c:"+ result);
        scanner.close();
    }

    private double vypoctiPreponu(double a, double b) {
        double c= Math.sqrt((Math.pow(a, 2)+Math.pow(b, 2)));
        return c;
    }
    
}
