
public class Main{
    public static void main(String[] args){
        // System.out.println("Hello");
        // Date now = new Date();
        // System.out.println(now);

        //not working

        // Point p1 = new Point(x:1, y:1);
        // Point p2 = p1;

        // System.out.println(p2);

    //     String message = "Hello World" + "!!";
    
    //     System.out.println(message);

    //     int myNum = 13;
    //     char myLetter = 'D';
    //     float deci = 23.45f;
    //     boolean myBool = false;

    //     System.out.println(myLetter);
    //     System.out.println(myNum);
    //     System.out.println(deci);
    //     System.out.println(myBool);

    //         String x = "water";
    //         String y = "kool-aid";

     
    //  //creating a user input to take in the name and then display to output
    //  Scanner scanner = new Scanner(System.in);
    // System.out.println("What is your name?");
    // String name = scanner.nextLine();

    // System.out.println("Oh! Hey "+name+ " Welcome to this java program");


    //  // using scanner for int data types
    // System.out.println("What is your age ? ");
    //  int age = scanner.nextInt();
    //  scanner.nextLine();
 
    // System.out.println("Woah!!, " +name+ " you are "+age+ " years old? that's cool!");


    //dialog box(GUI)
    //to import, use this: import javax.swing.JOptionPane;

    // //using string
    // String fname = JOptionPane.showInputDialog("Enter your name");
    // JOptionPane.showMessageDialog(null, "Hello "+fname);


    // //using integer
    // int age = Integer.parseInt( JOptionPane.showInputDialog("Enter your age"));
    // JOptionPane.showMessageDialog(null, "Nice, you are "+age+" years old!");

    // //using double
    // double height = Double.parseDouble( JOptionPane.showInputDialog("What is your height?"));
    // JOptionPane.showMessageDialog(null, "Cool, you are "+height+" cm tall!");
   
   
   //random values
   // import using this: import java.util.Random
//    Random random = new Random(); 

//     int x = random.nextInt(9)+1;
   
//     double y = random.nextDouble();
//     boolean z = random.nextBoolean();

//     System.out.println(y); 
   
    //creating if statements


//    int age = 20;
//    if(age > 18){
//     System.out.println("true");
//    } else {
//     System.out.println("false");
//    }


// creating switches
String day = "Monday";

switch(day) {
    case "Sunday": System.out.println("It is Sunday");
    break;

     case "Monday": System.out.println("It is Monday");
    break;

     case "Tuesday": System.out.println("It is Tuesday");
    break;

     case "Wednesday": System.out.println("It is Wednesday");
    break;

     case "Thursday": System.out.println("It is Thursday");
    break;

     case "Friday": System.out.println("It is Friday");
    break;

     case "Saturday": System.out.println("It is Saturday");
    break;


    default: System.out.println(day+" is not a day");
}
   
    };
}


