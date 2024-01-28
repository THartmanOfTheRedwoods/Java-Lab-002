//Kelten Stowe
//Trevor Hartman

//1/27/23

import java.time.LocalDate;

class Date {
    public static void main(String[] args) {
        // Step 1: Define variables
        String day, date, month, year;

        // Step 2: Get today's date
        LocalDate today = LocalDate.now();

        // Step 3: Convert date components to strings
        day = today.getDayOfWeek().toString().substring(0, 3);
        date = Integer.toString(today.getDayOfMonth());
        month = today.getMonth().toString().substring(0, 3);
        year = Integer.toString(today.getYear());

        // Step 4: Display date in a specific format
        System.out.println("Day: " + day);
        System.out.println("Date: " + date);
        System.out.println("Month: " + month);
        System.out.println("Year: " + year);

        // Step 5: Display date in standard American format
        System.out.println(month + ("/") + date + ("/") + year);

        // Step 6: Display date in European format
        System.out.println(date + ("/") + month + ("/") + year);

        // Editors Note here I wanted to make a universal clock not just a standard one so it was consistant and my stubborness got the better of me which is why I'm submitting this last minute
        // I ended up looking a lot of stuff online because everything I tried wasn't working and troubleshooting and I was running outta patience so I started looking up stuff online and every example I kept seeing used stuff built into the program so I gave in a used them
        // Thanks for reading this and sorry for the wait I'll try and get this in earlier next time I know you guys don't like when people submit things last minute.
    }
}