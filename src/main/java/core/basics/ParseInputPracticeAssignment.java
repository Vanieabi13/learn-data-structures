package core.basics;
import java.util.Scanner;

public class ParseInputPracticeAssignment {


    static int takeIntegerInput(){
        int a = -1;

        /**
         * TODO 1: Declare Scanner object
         */
        Scanner hk = new Scanner(System.in);


        /**
         * TODO 2: Store solution to variable a
         */
        a = hk.nextInt();

        System.out.println("Received Input "+a);
        return a;
    }

    static float takeFloatInput(){
        float a = -1;

        /**
         * TODO 1: Declare Scanner object
         */
        Scanner sc = new Scanner(System.in);

        /**
         * TODO 2: Store solution to variable a
         */
        a = sc.nextFloat();

        System.out.println("Received Input "+a);
        return a;
    }

    static double takeDoubleInput(){
        double a = -1;

        /**
         * TODO 1: Declare Scanner object
         */
        Scanner sc = new Scanner(System.in);

        /**
         * TODO 2: Store solution to variable a
         */
        a = sc.nextDouble();


        System.out.println("Received Input "+a);
        return a;
    }

    static boolean takeBooleanInput(){
        boolean a = false;

        /**
         * TODO 1: Declare Scanner object
         */
        Scanner sc = new Scanner(System.in);

        /**
         * TODO 2: Store solution to variable a
         */
        a = sc.nextBoolean();

        System.out.println("Received Input "+a);
        return a;
    }

    static String takeStringInput() {
        String a = "";

        /**
         * TODO 1: Declare Scanner object
         */
        Scanner sc = new Scanner(System.in);
        /**
         * TODO 2: Store solution to variable a
         */
        a = sc.next();

        System.out.println("Received Input "+a);
        return a;
    }

    public static void main(String[] args) {
        System.out.println("Give integer input:");
        takeIntegerInput();

        System.out.println("Give float input:");
        takeFloatInput();

        System.out.println("Give boolean input:");
        takeBooleanInput();

        System.out.println("Give double input:");
        takeDoubleInput();

        System.out.println("Give string input:");
        takeStringInput();
    }
}
