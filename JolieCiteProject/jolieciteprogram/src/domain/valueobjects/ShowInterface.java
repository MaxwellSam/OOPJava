package domain.valueobjects;
import java.util.Calendar;
import java.util.ArrayList;

public interface ShowInterface {
    public boolean checkDate(Calendar date);
    public String getName();
    public ArrayList<Calendar> getDate();
}
