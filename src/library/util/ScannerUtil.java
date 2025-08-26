package library.util;

import java.util.Scanner;

public class ScannerUtil {
    public static Scanner SCANNER_NUM = new Scanner(System.in);

    public static int getAction() {
        System.out.print("Enter action : ");
        return SCANNER_NUM.nextInt();
    }
}
