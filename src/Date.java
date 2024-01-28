/**
 * @author Trevor Hartman
 * @author Alexei Iachkov
 * @date 1-27-24
 * @version Lost count finally got it though xD
 */
public class Date {
        static String day = "Saturday";
        static String month = "January";
        static int monthnumerical = 01;
        static int year = 2024;
        static int currentdate = 27;

    public static void main(String[] args) {

        System.out.println("Welcome to the seventh dimension Neo!");
        System.out.println("Enjoy your stay!");

        System.out.println("American Date Format: " + day + ", " + month + " " + currentdate + ", " + year);
        System.out.println("European Date Format: " + day + ", " + currentdate + "/" + monthnumerical + "/"+ year );
    }
}
