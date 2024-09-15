/*Devlyn Galvan
 * 9/08/2024
 * SDEV200
 * Create a program that uses the gregorian calendar in java to show the user the current date and a specific given date from the project description
 */
import java.util.GregorianCalendar;

public class Main {

    
    public static void main(String[] args) {
        
        MyDate currentDate = new MyDate();
        System.out.println("Current Date: " + currentDate);
        
        long elapsedTime = 34355555133101L; // elapsed time from project description
        MyDate elapsedDate = new MyDate(elapsedTime);
        System.out.println("Date from Elapsed Time: " + elapsedDate);
        
    }
}

class MyDate {

    private int year;
    private int month; // starts at 0 e.g. January = 0
    private int day;

    // No-arg constructor that creates a MyDate object
    public MyDate() {
        GregorianCalendar calendar = new GregorianCalendar(); // creating an instance of GregorianCalendar with current date and time

        this.year = calendar.get(GregorianCalendar.YEAR); // gets current year
        this.month = calendar.get(GregorianCalendar.MONTH); // gets current month
        this.day = calendar.get(GregorianCalendar.DAY_OF_MONTH); // get current day of month
    }

    // Constructor that creates a MyDate object based off elapsed time defined in main
    public MyDate(long elapsedTime) {
        setDate(elapsedTime); // calling set date function to set the date to the elapsed time
    }

    // Constructor that creates a MyDate object with specified year, month, and day
    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear(){
        return year;
    }

    public int getMonth(){
        return month;
    }

    public int getDay(){
        return day;
    }

    public void setDate(long elapsedTime) {
        GregorianCalendar calendar = new GregorianCalendar();
        calendar.setTimeInMillis(elapsedTime);
        this.year = calendar.get(GregorianCalendar.YEAR);
        this.month = calendar.get(GregorianCalendar.MONTH);
        this.day = calendar.get(GregorianCalendar.DAY_OF_MONTH);
    }

    public String toString() {
        return "Year: " + year + " , Month: " + month + ", Day: " + day; // displaying date by string adding 1 to month to get proper month
    }
}