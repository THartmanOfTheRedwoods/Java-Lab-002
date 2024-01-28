public class Date {
    // Initially working program.
    public static void main(String[] args) {
        String day, date, month, year;

        day = "Friday";
        date = "27";
        month = "January";
        year = "2024";

        System.out.println("Date.java");
        System.out.println("Day: " + day);
        System.out.println("Date: " + date);
        System.out.println("Month: " + month);
        System.out.println("Year: " + year);

        System.out.println("American Format:");
        System.out.println(day + ", " + month + " " + date + ", " + year);

        System.out.println("European Format:");
        System.out.println(date + " " + month + " " + year);

    }
}
