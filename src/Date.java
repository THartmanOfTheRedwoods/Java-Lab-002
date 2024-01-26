public class Date {

    public static void main(String[] args) {

        String day = "Thursday" ;
        int date = 25;
        String month = "January" ;
        int year = 2024;

        System.out.println("Day: " + day);
        System.out.println("Date: " + date);
        System.out.println("Month: " + month);
        System.out.println("Year: " + year);

        System.out.println("American Format: " + day + ", " + month + " " + date + ", " + year);

        System.out.println("European Format: " + date + ", " + month + ", " + year);
    }
}