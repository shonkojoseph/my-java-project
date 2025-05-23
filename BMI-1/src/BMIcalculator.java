import java.util.Scanner;
public class BMIcalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your weight in kg: ");
        double weight = scanner.nextDouble();
        System.out.print("Enter your height in meters: ");
        double height = scanner.nextDouble();
        
        double bmi = weight / (height * height);
        System.out.printf("Your BMI is: %.2f\n", bmi);
        
        if (bmi < 18.5) {
            System.out.println("You are underweight.");
        } else if (bmi < 24.5) {

            System.out.println("You have a normal weight.");
        } else if (bmi < 29.5) {
            System.out.println("You are overweight.");
        } else {
            System.out.println("You are obese.");
        }
        

        scanner.close();
    }
}