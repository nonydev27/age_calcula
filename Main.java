import java.util.Scanner;
// import java.util.Date;
// import java.awt.*;

public class Main{
    public static void main(String[] args){
        // System.out.println("Hello");
        // Date now = new Date();
        // System.out.println(now);

        //not working

        // Point p1 = new Point(x:1, y:1);
        // Point p2 = p1;

        // System.out.println(p2);

        String message = "Hello World" + "!!";
    
        System.out.println(message);

        int myNum = 13;
        char myLetter = 'D';
        float deci = 23.45f;
        boolean myBool = false;

        System.out.println(myLetter);
        System.out.println(myNum);
        System.out.println(deci);
        System.out.println(myBool);

            String x = "water";
            String y = "kool-aid";

        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name?");

        String name = scanner.nextLine();
        System.out.println("welcome "+name);
    };
}


