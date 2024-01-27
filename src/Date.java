public class Date {
    static String hello = "Hello World!";
    static String day = "Thursday";
    static int date = 25;
    static String month = "January";

    static int monthEU = 1;
    static int year = 2024;


    public static void main(String[] args) {


        System.out.println(hello);
        System.out.println("American:" + day + ", " + month + " " + date + ", " + year);
        System.out.println("European:" + year + "-" + monthEU + "-" + date);
    }
}