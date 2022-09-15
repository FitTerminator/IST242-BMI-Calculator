import java.util.Scanner;
public class BMI {
    public static void main(String[] Strings) {
        Scanner input = new Scanner(System.in);
        
char Cont = 'a';
do {
        System.out.println("Enter weight (in pounds): ");
        double weight = input.nextDouble();
        System.out.println("Enter height (in inches): ");
        double inches = input.nextDouble();
        double BMI = (weight * 703) / (inches * inches);
        System.out.printf("BMI: %.2f \n", BMI);
        System.out.println("Enter any key to continue ('q' to 
quit): ");
        System.out.println(" ");
        Cont = input.next().charAt(0);
 }
while(Cont != 'q');
   }
}
