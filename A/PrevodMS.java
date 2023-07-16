import java.util.Scanner;

/**
 * PrevodMS
 */
public class PrevodMS {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in, "Windows-1250");
        System.out.println("Ahoj, jsem Program, který převede m/s na km/h.");
        System.out.println("Zadej rychlost v m/s: ");
        float ms = scanner.nextFloat();
                
        PrevodMS pms=new PrevodMS();       
        System.out.println("Rychlost byla: "+pms.prevodNaKmH(ms)+ " km/h.");
        
        
    }
    public float prevodNaKmH(float ms){

        return ms*3.6f;

    }

}