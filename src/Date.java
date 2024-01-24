public class Date {

public static void main(String[] args) {
    int day=24;
    String date;
    int month=1;
    int year=2024;
    String today="Thursday";
    String month1="January";
date = month+","+day+","+2024;
System.out.println("Display each variable's value on separate lines for initial verification.");
    System.out.println(day);
    System.out.println(month);
    System.out.println(year);
    System.out.println(date);
    System.out.println("===========================");
    System.out.println("Modify the program to display the date in standard American format");
    System.out.printf("%d %s %d %n",day,month1,year);
   //System.out.println(today+", "+month1+","+day+", "+year);
    System.out.println("===========================");
    System.out.println("modify the program to display the date in European forma");
    System.out.printf("%d %d %d %n",day,month,year);

}
    }
