import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class PrintDateTime {
    public static void main(String[] args) {
        // Get the current date
        LocalDate currentDate = LocalDate.now();
        
        // Define the desired date format
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        
        // Format the current date using the defined format
        String formattedDate = currentDate.format(formatter);
        
        // Print the formatted date
        System.out.println("Formatted date: " + formattedDate);
    }
}
