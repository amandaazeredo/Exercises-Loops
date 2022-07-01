import java.util.Scanner;

public class ValidValue {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter you grade (0-10): ");
        double i = sc.nextDouble();

        boolean validGrade = false;

        do {

            if (i >= 0 && i <= 10) {
                System.out.println("Valid grade");
            } else
                System.out.println("Invalid grade. Enter a valid grade: ");
            i = sc.nextDouble();

        } while (!validGrade);

        sc.close();
    }

}
