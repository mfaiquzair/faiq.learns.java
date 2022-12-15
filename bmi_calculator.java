import java.util.Scanner;

public class bmi_calculator{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double height, weight, bmi;

        System.out.print("Enter your height: ");
        height = input.nextDouble();

        System.out.print("Enter your weight: ");
        weight = input.nextDouble();

        bmi = weight/(height*height);

        if (bmi < 15)
        {
            System.out.print("Your BMI is very severe underweight");
        }
        else if (bmi >=15 && bmi<=16)
        {
            System.out.print("Your BMI is severe underweight");
        }
        else if (bmi >16 && bmi <= 18.5)
        {
            System.out.print("You BMI is underweight");
        }
        else if (bmi >18.5 && bmi <= 25)
        {
            System.out.print("Your BMI is normal");
        }
        else if (bmi >25 && bmi <= 30)
        {
            System.out.print("Your BMI is overweigth");
        }
        else if (bmi >30 && bmi <= 35)
        {
            System.out.print("Your BMI is moderately obese");
        }
        else if (bmi >35 && bmi<= 40)
        {
            System.out.print("Your BMI is severely obese");
        }
        else
        {
            System.out.print("Your BMI is very severely obese");
        }



        
    }
}