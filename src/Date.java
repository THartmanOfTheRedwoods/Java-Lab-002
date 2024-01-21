/**
 * @author James Ward
 * @since 1.1
 */

import java.util.Calendar;
// Importing Java Calendar for weekday functionality.
public class Date {
    public static void main(String[] args) {

        String weekday, monthName;
        int day, month, year, dayOfWeekInt;
        // Declaring variables.

        day = 21;
        month = 0;
        year = 2024;
        //Assigning values for Java Calendar to pull weekday for final concat. Java Calendar assigns months 0-11.

        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month, day);
        dayOfWeekInt = calendar.get(Calendar.DAY_OF_WEEK);
        // Getting day of week integer from Java Calendar.

        String[] weekdayArray = {"Forbiddenday", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        String[] monthNameArray = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        //Created an array of the weekdays and month names.
        //Keeping in mind that the output of calendar.DAY_OF_WEEK is 1-7, I added a cheeky Forbiddenday in the place of 0 in the array. This is not the case for months.

        weekday = weekdayArray[dayOfWeekInt];
        monthName = monthNameArray[month];

        System.out.printf("%nToday's date in American format is %s, %s %d, %d.%n", weekday, monthName, day, year);
        System.out.printf("%nThe current date in European format is %s, %d %s %d.%n", weekday, day, monthName, year);
        //Because printf doesn't include a new line like println, I added %n at the end of each format.
        //With this setup, if I were to add an input, this program could take a fully numerical date and translate it to the final strings. Would need to add a decrement to the month input.
    }
}