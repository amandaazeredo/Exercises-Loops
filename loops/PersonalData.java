import java.util.Scanner;

public class PersonalData {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        boolean info = false;
        String name, gender, civilStatus;
        int age;
        double salary;

        do {
            System.out.println("Name: ");
            name = sc.next();

            if (name.length() >= 3) {
                info = true;
            } else {
                System.out.println("Invalid! Your name must have 3 or more characters.");
            }
        } while (!info);

        info = false;

        do {
            System.out.println("Age: ");
            age = sc.nextInt();

            if (age >= 0 && age <= 150) {
                info = true;
            } else {
                System.out.println("Invalid! Your age must be between 0-150.");
            }
        } while (!info);

        info = false;

        do {
            System.out.println("Salary: ");
            salary = sc.nextDouble();

            if (salary > 0) {
                info = true;
            } else {
                System.out.println("Invalid! Your salary must be greater than 0.");
            }
        } while (!info);

        info = false;

        do {
            System.out.println("Gender('f' female, 'm' male, 'o' other: ");
            gender = sc.next();

            if (gender.equalsIgnoreCase("f") ||
                    gender.equalsIgnoreCase("m") ||
                    gender.equalsIgnoreCase("o")) {
                info = true;
            } else {
                System.out.println("Invalid! Your gender must be 'f', 'm' or 'o'");
            }
        } while (!info);

        info = false;

        do {
            System.out.println("Civil Status('s' single, 'm' married, 'd' divorced, 'w' widowed: ");
            civilStatus = sc.next();

            if (civilStatus.equalsIgnoreCase("s") ||
                    (civilStatus.equalsIgnoreCase("m") ||
                            (civilStatus.equalsIgnoreCase("d") ||
                                    (civilStatus.equalsIgnoreCase("w"))))) {
                info = true;
            } else {
                System.out.println(
                        "Invalid! Your civil status must be 's'single, 'm' married, 'd' divorced, 'w' widowed.");
            }
        } while (!info);

        System.out.println("The following information was collected: ");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
        System.out.println("Gender: " + gender);
        System.out.println("Civil Status: " + civilStatus);

        sc.close();
    }

}
