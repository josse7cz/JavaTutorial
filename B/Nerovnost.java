//Určete, zda dvě zadaná čísla x,y čísla splňují nerovnost x+3<5y-1

import java.util.Scanner;

public class Nerovnost {
    int x;
    int y;

    Nerovnost(int x, int y){
        this.x=x;
        this.y=y;
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in,"utf-8")) {
            System.out.println("Program, který vyhodnotí výraz x+3<5y-1 s Vámi zadaným x a y.");
            System.out.println("Zadejte x:");
            int x=sc.nextInt();
            System.out.println("Zadejte y:");
            int y=sc.nextInt();
            sc.close();

            
            
            Nerovnost ner=new Nerovnost(x,y);
            System.out.println(ner.porovnej());
        }
        
    }
    public boolean porovnej(){
        System.out.println(x+"+3<(5*"+y+"-1)");
        if(x+3<(5*y-1)){
            return true;
        }else{
            return false;
        }
    }

    
}
