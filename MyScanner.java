package JavaTutorial;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MyScanner {
    static Scanner scan = new Scanner(System.in);

    public static String scan() {
        return scan.next();
    }

    public static String scanLine() {
        return scan.nextLine();
    }

    public static int scanInt() {
        return scan.nextInt();
    }
    public static double scanDouble() {
        return scan.nextDouble();
    }

    public static List<String> scanLinesList(int j) {
        List<String> list = new ArrayList<String>();
        for (int i = 0; i <= j; i++) {
            String input = scanLine();

            if (!input.isEmpty()) {
                list.add(input);
            }
            System.out.println("Zadej další hodnotu: ");

        }
        return list;
    }
}
