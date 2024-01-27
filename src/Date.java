public class Date {

    public static void main(String[] args) {
        String day, month;
        int date, year;

        day = "Saturday";
        date = 27;
        month = "January";
        year = 2024;

        System.out.println("Day: " + day);
        System.out.println("Date: " + date);
        System.out.println("Month: " + month);
        System.out.println("Year: " + year);

        System.out.println("\nStandard American Format:");
        System.out.println(day + ", " + month + " " + date + ", " + year);

        System.out.println("\nEuropean Format:");
        System.out.println(date + " " + month + " " + year);
    }
}
