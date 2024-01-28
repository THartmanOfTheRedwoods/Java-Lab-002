public class Date {
    public static void main(String[] args) {

        String day;
        String month;
        int date;
        int year;
        //Define variables

        day = "Saturday";
        month = "January";
        date = 27;
        year = 2024;
        // Assign values to represent today's date.

        System.out.println(day);
        System.out.println(month);
        System.out.println(date);
        System.out.println(year);
        //Display each variable's value on separate lines for initial verification.

        //Compile and run

        System.out.printf("%s, %s %d, %d\n", day, month, date, year);
        //Display the date in standard American format.

        System.out.printf("%s, %d %s %d", day, date, month, year);
    }
}