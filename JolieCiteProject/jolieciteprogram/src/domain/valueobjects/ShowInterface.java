package domain.valueobjects;
import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public interface ShowInterface {
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy MMM dd HH:mm"); // for formating dates to print
    
    public boolean checkDate(Calendar date);
    public String getName();
    public String getType();
    public ArrayList<Calendar> getDate();
    public ArrayList<String> getDateFormatted();
}
