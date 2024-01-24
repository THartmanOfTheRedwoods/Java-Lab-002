public class Date {
    public static void main(String[] args) {

        System.out.println("Hello World!");

        int day = 24;
        int month = 1;
        int year = 2024;
        String date;


        System.out.println(day);
        System.out.println(month);
        System.out.println(year+"\n");

        System.out.println(day+"\n"+month+"\n"+year+"\n");

        date = "Wednesday, " + month + "-" + day + "-" + year;
        System.out.println("Today's date is: "+date + "\n");

        System.out.println("In European format:" +day + "-" + month + "-" + year);



    }

}



