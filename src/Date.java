public class Date {

    public static void main(String[] args) {
        System.out.println("The Date is,");
    String day, date, month, year; //defining variables

    day = "Friday";
    date = "26"; // Assigning a value to each variable
    month = "January";
    year = "2024";

    //System.out.println(day); //checking to see if all variables print correctly
    //System.out.println(date); //printing Day, Date, Month, Year
    //System.out.println(month);
    //System.out.println(year);

   // System.out.println("Day: " + day);
    //System.out.println("Date: " + date); //printing Variable and the corresponding date
    //System.out.println("Month: " + month);
    //System.out.println("Year: " + year);

    System.out.println("Standard American Format: " + day +", " + month + " " + date +", " + year);
    //displaying American format

    System.out.println("European Format: " + date +", " + month +", " + year);
    //displaying European format
    }

}
