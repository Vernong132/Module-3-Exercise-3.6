import java.util.Scanner;

public class BMICheck {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

       //Prompt user to input weight, and height (feet and inches)
       System.out.print( " Please input weight in pounds: ");
       double weight = input.nextDouble();
       System.out.print(" Please enter the feet value for your height (excluding the inches): ");
       double feet = input.nextDouble();
       System.out.print( " Please enter inches: ");
       double inches = input.nextDouble();

       //Compute BMI = (weight(lb)/height(in)^2*703
       double height = ((feet*12) + inches);
       double BMI = weight / Math.pow(height, 2) * 703;
       
       //Print Result
       System.out.println("BMI is " + BMI);
        if (BMI < 18.5)
            System.out.println("Underweight");
        else if (BMI < 25)
            System.out.println("Normal");
            else if  (BMI < 30)
            System.out.println("Overweight");
            else
            System.out.println("Obese");
        input.close();
    
    }
}
// Psudocode
// START

   
   // DECLARE weight, feet, inches, height, BMI AS REAL

   // PRINT "Please input weight in pounds: "
   // READ weight
   // PRINT "Please enter the feet value for your height (excluding the inches): "
   // READ feet
   // PRINT "Please enter inches: "
   // READ inches
   
   //  height = (feet * 12) + inches

   // BMI = (weight / (height * height)) * 703

   // PRINT "BMI is ", BMI

   // IF BMI < 18.5 THEN
      // PRINT "Underweight"
   // ELSE IF BMI < 25 THEN
      // PRINT "Normal"
   // ELSE IF BMI < 30 THEN
      // PRINT "Overweight"
   // ELSE
      // PRINT "Obese"

  // CLOSE input
// END