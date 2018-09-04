import java.util.Scanner;

public class BMIProject {

    public static void main(String[] args){

        Scanner keyboard;
        keyboard = new Scanner(System.in);


        int meters,kilograms,feet,inches,inchesTotal;

        System.out.println("What is your height?(only number of feet)");
        feet = keyboard.nextInt();
        System.out.println("How many inches above "+feet+" are you?");
        inches = keyboard.nextInt();

        System.out.println(meters);
    }
}
