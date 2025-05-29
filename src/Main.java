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

        Random random = new Random();

        boolean isHeads;
        isHeads = random.nextBoolean();

        if(isHeads){
            System.out.println("Coin landed HEADS!");
        }
        else{
            System.out.println("Coin landed TAILS!");
        }

        int gamba;
        gamba = random.nextInt(1,21);






        System.out.println(gamba);

    }
}
