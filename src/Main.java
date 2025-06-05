import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        //note
        /*
        multi line
        comment

         */
//        System.out.println("yo ");
//        System.out.print("i want pizza now");
//        System.out.println();
//        System.out.println();
//
//        int age = 30;
//        double price = 19.99;
//        double gpa = 3.5;
//        double temperature = -12.5;
//        char letter = 'a';
//        boolean inSeason = false;
//        String rig = "Texas rig";
//        String bait = "Craw";
//        String fish = " Largemouth Bass";
//
//        System.out.println("Hello " + name);
//        System.out.println("The temperature today is " + temperature );
//
//        System.out.println("You're throwing a " + rig + " "+ bait + " hoping to get a" + fish);
//
//        if(inSeason){
//            System.out.println(fish + " are in season, good luck!");
//        }else{
//            System.out.println(fish+ " arent in season :(, try targeting a different species...");
//        }

//
//        int z = 10;
//        int y = 200;
//        int c;
//        c = z * y;
//        int age = ;
//
//        if(age >= 18){
//            System.out.println("You are an adult!");
//
//        }else if(age < 0){
//            System.out.println("Youre a baby");
//        }
//        else{
//            System.out.println("You are a child!");
//        }

//        Random random = new Random();
//
//        boolean isHeads;
//        isHeads = random.nextBoolean();
//
//        if(isHeads){
//            System.out.println("Coin landed HEADS!");
//        }
//        else{
//            System.out.println("Coin landed TAILS!");
//        }
//
//        int gamba;
//        gamba = random.nextInt(1,21);




//    double result;
//    result = Math.pow(2, 4);
//    result = Math.min(5, 200);
//    result = Math.max(5, 200);
//   result = Math.sqrt(9);
//      result = Math.ceil(2.12);
//      result = Math.floor(59.2222);
//        System.out.println(result);

        //hypotenuse c = Math.sqrt(a² + b²)

//        Scanner scanner = new Scanner(System.in);
//
//        double a;
//        double b;
//        double c;
//
//        System.out.print("Enter the length of side A:" );
//        a = scanner.nextDouble();
//
//        System.out.print("Enter the length of side B:" );
//        b = scanner.nextDouble();
//
//        c = Math.sqrt(Math.pow(a,2) + Math.pow(b,2));
//
//        System.out.println("The Hypotenuse (side c) is: " + c);
//        scanner.close();


//        Scanner scanner = new Scanner(System.in);
//
//        double radius;
//        double circumference;
//        double area;
//        double volume;
//        System.out.print("Enter the radius: ");
//        radius = scanner.nextDouble();
//
//        // c = 2 π r
//        circumference = 2 * Math.PI * radius;
//        //a = π r²
//        area = Math.PI * Math.pow(radius,2);
//        //v = 4/3 π r³
//        volume = (4.0 / 3.0) * Math.PI * Math.pow(radius,3);
//
//
//        System.out.printf("The circumference is: %.1fcm\n" , circumference);
//        System.out.printf("The area is: %.1fcm²\n" , area );
//        System.out.printf("The volume is: %.1fcm³\n" , volume);
//
//
//        scanner.close();

        String name = "Spongebob";
        char firstLetter = 'S';
        int age = 30;
        double height = 60.5;
        boolean isEmployed = true;

        System.out.printf("Hello %s\n", name);
        System.out.printf("Your name starts with a %c\n", firstLetter);
        System.out.printf("You are %d years old\n",age);
        System.out.printf("You are %f inches tall\n",height);
        System.out.printf("Employed: %b\n",isEmployed);
        System.out.printf("%s is %d years old",name, age);
    }
}
