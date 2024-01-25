import java.util.Scanner;
public class StumpTheChump {
    // Initially working program.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("I will tell you a story, but first I need some Info");
        System.out.println("What is your Name?");
        String first = scanner.nextLine();
        System.out.println("What is your Job?");
        String second = scanner.nextLine();


        System.out.println("Here is the story: Once upon a time there was " + first + " who was a " + second);
        System.out.println("On the way to work, " + first + " refelcted on AI");
        System.out.println(" Perhaps, " + first + " Will not be a " + second + " forever...");
    }
}

