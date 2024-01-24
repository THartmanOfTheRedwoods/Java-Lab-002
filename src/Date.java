// Quinn McKay
// 1/24/2024
// Java-Lab-002 : Date.java




public class Date {
    public static void main(String[] args){

        int day = 24;
        int month = 1;
        int year = 2024;
        String date =("Date: " + month + "/" + day + "/" + year);

        System.out.println("Day: " + day);
        System.out.println("Month: " + month);
        System.out.println("Year: " + year);
        System.out.println(date);

        String dayword =("Wednesday");
        String monthword = ("January");

        System.out.print("American Format: ");
        System.out.println(dayword + ", " + monthword + " " + day + ", " + year);

        String month2 =("01");
        System.out.print("European Format: ");
        System.out.println(day + "." + month2 + "." + year);






    }
}
