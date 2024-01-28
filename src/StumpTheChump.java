import java.util.Scanner;

public class StumpTheChump {
    // Initially working program.
    public static void main(String[] args) {
        System.out.println("Hi Chump, can you be stumped?");
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name?");
        String name = scanner.nextLine();

        System.out.print("Hi ");
        System.out.print(name);
        System.out.println(", what year were you born?");

        int yearOfBirth = scanner.nextInt();
        int currentYear = 2024;

        System.out.print(name);
        System.out.print(", you are ");
        System.out.print(currentYear - yearOfBirth);
        System.out.print(" years old!");

    }

}