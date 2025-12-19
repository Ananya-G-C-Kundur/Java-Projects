import java.util.Scanner;

public class PasswordValidation{

    public static void passwardChecker(String passward)
    {
        boolean isValid = true;

        // length must be 8 character
        if (passward.length() < 8)
        {
            System.out.println("Password must be at least 8 characters long");
            isValid = false;
        }

        // checks uppercase in the passward
        if (!passward.matches(".*[A-Z].*"))
        {
            // . --- Any Character
            // * --- Zero or more times
            // [A-Z] --- Any uppercase letter
            System.err.println("Invalid passward ! Atleat it should contain one Uppercase letter" );
            isValid = false;
        }

        // check the digit
        if (!passward.matches(".*[0-9].*"))
        {
            System.out.println("Invalid passward ! Passward should contain atleast one digit");
            isValid = false;
        }

        // check the special character
        if (!passward.matches(".*[@!#$%^&*].*"))
        {
            System.out.println("Invalid passward ! Passward should contain atleast one special character");
            isValid = false;
        }

        // check if passward contains space
        if(passward.contains(" "))
        {
            System.out.println("passward should not contain space");
            isValid = false;
        }

        if(isValid)
        {
            System.out.println("Passward is Valid and Strong");
        }
    }
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter your Passward : ");
        String passward = obj.nextLine();

        passwardChecker(passward);

        obj.close();
    }
}