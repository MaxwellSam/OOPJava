package test;
import domain.valueobjects.*;

class testDeva {
    public static void main(String[] args) {

        // test print date Concert
        int[] date = new int[]{ 2021,12,2,23,00 };
        Concert test = new Concert("concert test",date);
        System.out.println(test.getDate());
        //System.out.printf("Name: %s\tDate: %s\n",test.getName(), test.getStrDateFormatted());
        
        // test print date TheaterPlay
        // ArrayList<Calendar> arr = new ArrayList<Calendar>();
        // Calendar c = new GregorianCalendar(2013,1,28,13,24,56);
        // arr.add(c);
        // arr.add(c);
        // arr.add(c);
        // arr.add(c);
        // arr.add(c);

        // TheaterPlay testTeatre = new TheaterPlay("tp",arr);
        // testTeatre.getDateFormatted();
    }
    
}