package core.basics.operators;

import java.util.Scanner;

public class OperatorsExample {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        String s= sc.next();

        for(int i=0; i< s.length(); i++){
            char c = s.charAt(i);

            if(c=='a' || c=='e' ||
                    c=='i' || c=='o' || c=='i'){
                continue;
            }

            System.out.print(c);

        }
    }
}
