import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        float heightBielecki, weightBielecki, bmi ;

        System.out.println("Enter your height in meters then press enter( example: 1.80): ");
        heightBielecki = scanner.nextFloat();

        System.out.println("Enter your weight in kilograms then press enter (example 85): ");
         weightBielecki = scanner.nextFloat();


         bmi = weightBielecki / (float) Math.pow(heightBielecki, 2);


        String category;

        if (bmi < 16)
        {
            category = "starvation";
        }

        else if (bmi < 17) {
            category = "emaciation";
        }

        else if (bmi < 18.5)
        {
            category = "underweight";
        }

        else if (bmi < 23) {
            category = "normal, low range";
        }

        else if (bmi < 25)
        {
            category = "normal, high range";
        }

        else if (bmi < 27.5)
        {
            category = "overweight, low range";
        }

        else if (bmi < 30)
        {
            category = "overweight, high range";
        }

        else if (bmi < 35)
        {
            category = "1st degree obesity";
        }

        else if (bmi < 40)
        {
            category = "2nd degree obesity";
        }

        else {
            category = "3rd degree obesity";
        }


        System.out.printf("Your BMI is %.2f. According to the BMI category, you are in the '%s' range.\n", bmi, category);
    }

    }
