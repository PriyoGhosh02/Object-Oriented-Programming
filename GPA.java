
package ExceptionHandling;
 import java.util.Scanner;

   

class AgeOutOfRangeException extends Exception {
    public AgeOutOfRangeException(String message) {
        super(message);
    }
}

class LowGpaException extends Exception {
    public LowGpaException(String message) {
        super(message);
    }
}

public class GPA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter your age: ");
            int age = scanner.nextInt();
            validateAge(age);

            System.out.print("Enter your GPA: ");
            double gpa = scanner.nextDouble();
            validateGpa(gpa);

            System.out.println("Your application is accepted and is under study.");
        } catch (AgeOutOfRangeException e) {
            System.out.println("Your application is rejected due to age limit: " + e.getMessage());
        } catch (LowGpaException e) {
            System.out.println("Your application is rejected due to low GPA: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Invalid input. Please try again.");
        } 
    }

    private static void validateAge(int age) throws AgeOutOfRangeException {
        if (age > 25) {
            throw new AgeOutOfRangeException("Age must be 25 or below.");
        }
    }

    private static void validateGpa(double gpa) throws LowGpaException {
        if (gpa < 2.5) {
            throw new LowGpaException("GPA must be 2.5 or above.");
        }
    }
    
}


