import java.util.Scanner;

class PocetDnuAHodin{
    int dnu;
    int hodin;

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in, "Windows-1250")) {
            System.out.println("Ahoj, jsem Program, který převede počet dnů a hodin na hodiny!");
            System.out.println("Napiš počet dnů: ");
            
            int dny = scanner.nextInt();
            System.out.println("Napiš počet hodin: ");
            
            int hodiny=scanner.nextInt();
            PocetDnuAHodin pocet=new PocetDnuAHodin();        
            System.out.println("Výsledek je: "+pocet.pocetHodin(dny,hodiny)+ " hodin.");
            scanner.close();
        }
        
    }
    public int pocetHodin(int dnu, int hodin){
        int result=hodin+dnu*24;
        return result;
    }
    



}