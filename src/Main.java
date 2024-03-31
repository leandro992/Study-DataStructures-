import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        // Existing LocalDate
        LocalDate originalDate = LocalDate.now();
        System.out.println("Original Date: " + originalDate);

        // Change only the date (keeping the same year and month)
        int newDayOfMonth = 15; // Change this to the desired day
        LocalDate newDate = originalDate.withDayOfMonth(newDayOfMonth);
        System.out.println("Changed Date: " + newDate);
    }
}