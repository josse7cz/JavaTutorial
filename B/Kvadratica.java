import static JavaTutorial.MyScanner.*;

public class Kvadratica {
    public static void main(String[] args) {
        System.out.println("Program pro výpočet kořenů kvadraticke rovnice.");
        System.out.println("Zadejte tři hodnoty.... ");
        System.out.println("První hodnota a:");
        double a = scanDouble();
        System.out.println("Druhá hodnota b:");
        double b = scanDouble();
        System.out.println("Třetí hodnota c:");
        double c = scanDouble();
        vypoctiKvadrFce(a, b, c);

    }

    public static double determinant(double a, double b, double c) {
        double result = (b * b) - (4 * a * c);
        return result;
    }

    public static void vypoctiKvadrFce(double a, double b, double c) {
        double determinant = determinant(a, b, c);
        if (determinant < 0) {
            System.out.println("Determinant záporný-není řešení." + "determinant je" + determinant);

        } else if (determinant == 0) {
            System.out.println("Determinant je nula");
            double x1 = (-b + Math.sqrt(determinant)) / 2 * a;
            double x2 = x1;
            System.out.println("x1 = " + x1 + "; " + "x2 = " + x2);

        } else {
            System.out.println("Determinant je " + determinant + ", rovnice bude mít dva kořeny.");
            double x1 = (-b + Math.sqrt(determinant)) / (2 * a);
            double x2 = (-b - Math.sqrt(determinant)) / (2 * a);
            System.out.println("Řešením rovnice je:" + "\n" + "x1: " + x1 + "\n" + "x2: " + x2);
        }
    }
}
