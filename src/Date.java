
public class Date {
    public static void main(String[] args) {
        int day= 24;
        String date;
        int month= 1;
        int year= 2024;
        System.out.println(day+"\n"+month+"\n"+year);
        date = day+"-"+month+"-"+year;
        System.out.println(date);
        date = month+"-"+day+"-"+year;
        System.out.println(date);
    }
}
