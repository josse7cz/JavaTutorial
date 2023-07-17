import java.text.DecimalFormat;
import java.util.Scanner;

public class RychlejsiAuto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat();
        df.setMaximumFractionDigits(2);
        System.out.println("Program vypíše rychlejší auto a rozdíl v rychlosti.");
        System.out.println("Zadejte cas ve vterinách prvního auta: ");
        int cas1 = sc.nextInt();
        sc.nextLine();
        System.out.println("Zadejte dráhu prvního auta v metrech: ");
        int draha1 = sc.nextInt();
        sc.nextLine();
        System.out.println("Zadejte čas ve vterinách druhého auta: ");
        int cas2 = sc.nextInt();
        sc.nextLine();
        System.out.println("Zadejte dráhu prvního auta v metrech: ");
        int draha2 = sc.nextInt();
        sc.nextLine();
        sc.close();

        RychlejsiAuto ra=new RychlejsiAuto();
        double auto1 = ra.vypoctiRychlost(draha1, cas1);
        double auto2 = ra.vypoctiRychlost(draha2, cas2);
        System.out.println("Auto1 jelo "+df.format(auto1)+" km/h a auto2: "+df.format(auto2)+" km/h.");
        if(auto1==auto2){
            System.out.println("Obě auta jeli stejnou rychlostí "+ df.format(auto1) +" km/h.");

        }else if(auto1>auto2){
            System.out.println("auto2 je pomalejší než auto1 o "+df.format(auto1-auto2)+" km/h.");
        }else{
            System.out.println("auto1 jelo" + auto1+"a je pomalejší o "+df.format(auto2-auto1)+" km/h.");
        }
        

    }
    public double vypoctiRychlost(double draha, double cas){
        double pom=(draha/cas)*3.6;
        return pom;

    }
}
