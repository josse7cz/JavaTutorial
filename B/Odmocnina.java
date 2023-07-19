import java.util.Scanner;

public class Odmocnina {
    public static void main(String[] args) {
        System.out.println("Program na odmocninu.");
        Scanner sc = new Scanner(System.in);
        System.out.println("Zadejte číslo pro odmocnění.");
            
        try {
            int mocnenec = sc.nextInt();
            if(mocnenec>0){
               double result = Math.sqrt(mocnenec);
               System.out.println("Výsledek: "+result); 
            }else{
                System.out.println("Záporné číslo nelze odmocnit");
            }
            


        } catch (Exception e) {
            System.out.println("Záporné číslo nelze odmocnit"+e);// TODO: handle exception
        }
        
    
        

       
    
    }
    
}
