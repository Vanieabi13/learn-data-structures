package core.basics.conditional;
import java.util.Scanner;
/**
 * 1. Take Input from the user about marks
 * 2. write the conditions and print the desired result
 */

public class MarksConditionPractice {
    public static void main(String[] args) {
        // Todo: Declare Scanner for taking input
        Scanner sc = new Scanner(System.in);

        /**
         *  = operator , that assigns a value
         *
         *  == operator, that compares a value
         *  >=
         */

        // Take marks as input
        int marks = sc.nextInt();

        if(marks >= 90){
            System.out.println("Wow");
        }
        else if(marks >= 70 && marks < 90){
            System.out.println("good");
        }
        else if(marks >=50 && marks < 70){
            System.out.println("ok");
        }
        else {
            System.out.println("no pocket money");
        }

    }
}
