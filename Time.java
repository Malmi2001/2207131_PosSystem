import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Time {

    public void updateTimeDate(){
LocalDateTime dateTime=LocalDateTime.now();
DateTimeFormatter formatter = DateTimeFormatter.ofPattern("YYYY-MM-dd     HH:mm:ss");
String updatedTimeDate = dateTime.format(formatter);
System.out.println(updatedTimeDate);
    }
}
