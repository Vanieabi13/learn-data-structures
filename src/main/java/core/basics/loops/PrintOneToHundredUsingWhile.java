package core.basics.loops;

public class PrintOneToHundredUsingWhile {
    public static void main(String[] args) {
        /**
         * Write a program to print numbers from
         * 1 to 100.
         *
         *
         * Easy way but huh too much work..
         */

        /**
        System.out.println(1);
        System.out.println(2);
        System.out.println(3);
        /**
         *
         *  . ........
         * */
        /**
        System.out.println(98);
        System.out.println(99);
        System.out.println(100);
        */

        // Solving this code using while loop
        System.out.println("Code before initialization");
        int i = 1;

        while (i <= 100){
            // This block of code will continue
            // executing as long as the condition
            // is true.
            System.out.println(i);
            i++;
        }
        System.out.println("Code after loop");
    }
}
