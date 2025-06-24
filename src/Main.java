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
//        String name = "Bobby";
//        double temperature = -12.5;
//        char letter = 'a';
//        boolean inSeason = true;
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

//        String name = "Spongebob";
//        char firstLetter = 'S';
//        int age = 30;
//        double height = 60.5;
//        boolean isEmployed = true;
//
//        System.out.printf("Hello %s\n", name);
//        System.out.printf("Your name starts with a %c\n", firstLetter);
//        System.out.printf("You are %d years old\n",age);
//        System.out.printf("You are %f inches tall\n",height);
//        System.out.printf("Employed: %b\n",isEmployed);
//        System.out.printf("%s is %d years old",name, age);

//        double price1 = 9000.99;
//        double price2 = 100000.15;
//        double price3 = -54000.01;
//
//        System.out.printf("%+.2f\n",price1);
//        System.out.printf("%,.2f\n",price2);
//        System.out.printf("%, .2f\n",price3);

//        int id1 = 1;
//        int id2 = 24;
//        int id3 = 345;
//        int id4 = 2356;
//
//        System.out.printf("%-4d\n",id1);
//        System.out.printf("%4d\n",id2);
//        System.out.printf("%04d\n",id3);
//        System.out.printf("%4d\n",id4);


//        boolean isStudent = false;
//        boolean isSenior = true;
//        double price = 9.99;
//
//        if(isStudent){
//            if(isSenior){
//                System.out.println("You get a senior discount of 20%");
//                System.out.println("You get a student discount of 10%");
//                price *= 0.7;
//            }
//            else {
//                System.out.println("You get a student discount of 10%");
//                price *= 0.9;
//            }
//        }
//        else{
//            if(isSenior){
//                System.out.println("You get a senior discount of 20%");
//                price *= 0.8;
//            }else{
//                price *= 1;
//            }
//        }
//        System.out.printf("The price of a ticket is: $%.2f",price);
//
//

        String name = "Isac";
//        int length = name.length();
//        char letter = name.charAt(2);
//        int index = name.indexOf("c");
//        int lastIndex = name.lastIndexOf("a");
//        name = name.toUpperCase();
//        name = name.toLowerCase();
//        name = name.trim();
//        name = name.replace("a","i");

//        if(name.isEmpty()){
//            System.out.println("Your name is empty");
//        }else{
//            System.out.println("Your name is: " + name);
//        }

//        if(name.contains(" ")){
//            System.out.println("Your name has a space in it");
//        }
//        else{
//            System.out.println("Your name DOESNT have a space in it");
//        }
//
//        System.out.println(name);
//
//        if(name.equalsIgnoreCase("password")){
//            System.out.println("Your name cant be password");
//        }
//        else{
//            System.out.println("Hello "+ name);
//        }


        //.substring(start, end)
//        Scanner scanner = new Scanner(System.in);
//        String email;
//        String username;
//        String domain;
//        System.out.print("Enter your email");
//
//        email = scanner.nextLine();
//        if(email.contains("@")){
//            username = email.substring(0,email.indexOf("@"));
//            domain = email.substring(email.indexOf("@"));
//            System.out.println(username);
//            System.out.println(domain);
//        }
//        else{
//            System.out.println("Email must contain  @");
//        }

//        String username = email.substring(0,4);
//        String domain = email.substring(4,14); // or could do (4)  and will do all the characters after until the end.

        //ternary operator ? = return 1 of 2 values if a condition is true

        //variable = (condition) ? ifTrue : ifFalse;

//        int score = 80;
//        if(score >= 60){
//            System.out.println("Pass");
//        }
//        else{
//            System.out.println("FAIL");
//        }
//        String passOrFail = (score >= 60 )? "PASS" : "FAIL";
//        int number = 20;

//        String evenOrOdd = (number % 2 == 0) ? "Even" : "Odd";

//        int hours = 15;
//        String timeOfDay = (hours < 12) ? "A.M." : "P.M.";

//        int income = 90000;
//        double taxRate = (income >= 40000)? 0.25 : 0.15;
//
//
//        System.out.println(taxRate);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the day of the week: ");
        String day = scanner.nextLine();

        switch(day){
//            case "Monday" -> System.out.println("Its a weekday :(");
//            case "Tuesday" -> System.out.println("Its a weekday :(");
//            case "Wednesday" -> System.out.println("Its a weekday :(");
//            case "Thurdsday" -> System.out.println("Its a weekday :(");
//            case "Friday" -> System.out.println("Its a weekday :(");
//            case "Saturday" -> System.out.println("Its the weekend! :(");
//            case "Sunday" -> System.out.println("Its the weekend! :(");
            case "Monday", "Tuesday","Wednesday","Thursday", "Friday" -> System.out.println("Its a weekday :(");
            case "Saturday", "Sunday" -> System.out.println("Its the weekend!");
            default -> System.out.println(" Is not a day");


        }




    }
}
