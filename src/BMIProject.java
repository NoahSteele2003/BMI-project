import java.util.Scanner;

public class BMIProject {

    public static void main(String[] args){

        Scanner keyboard;
        keyboard = new Scanner(System.in);
        //BMI = kg/m^2
        // 1lb = .453592kg

        int feet,inches,inchesTotal,pounds;
        double meters, kilograms, BMI;

        System.out.println("What is your height?(only number of feet)");
        feet = keyboard.nextInt();
        System.out.println("How many inches above "+feet+" feet are you?");
        inches = keyboard.nextInt();

        inchesTotal = (inches +(feet*12));
        meters =(inchesTotal*.0254);

        System.out.println("How many pounds do you weigh?");
        pounds = keyboard.nextInt();

        kilograms = (pounds*.453592);
        BMI = (kilograms/(meters*meters));
        System.out.println("Your BMI is "+BMI);


    }
}
