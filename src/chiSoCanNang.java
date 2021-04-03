
import java.util.Scanner;

public class chiSoCanNang {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.println("Enter your weight (kg): ");
        double weight = number.nextDouble();
        System.out.println("Enter your height (m): ");
        double height = number.nextDouble();
        double bmi = weight / height / height;
        if (bmi < 18.5) {
            System.out.printf("BMI is: %-20.2f%s",bmi,"Underweight");
        } else if (bmi >= 18.5 && bmi < 25) {
            System.out.printf("BMI is: %-20.2f%s",bmi,"Normal");
        } else if (25.0 <= bmi && bmi < 30) {
            System.out.printf("BMI is: %-20.2f%s",bmi,"Overweight");
        } else if (30.0 <= bmi) {
            System.out.printf("BMI is: %-20.2f%s",bmi,"Obese");
        }
    }
}
