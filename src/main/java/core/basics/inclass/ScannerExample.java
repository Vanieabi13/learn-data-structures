package core.basics.inclass;
import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int a = -1; a = 2;
        System.out.println("Please give value for a");
        int a = sc.nextInt();
        System.out.println("a="+a);

        float f = sc.nextFloat();
        System.out.println("f="+f);
    }
}
