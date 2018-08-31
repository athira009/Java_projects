package third;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Created by expert on 7/24/18.
 */
    /**
     * Created by expert on 7/24/18.
     */
    public class DateFormat {

        public static void main(String[] args) {
            Date today;
            SimpleDateFormat sdf;
            today=new Date();
            sdf=new SimpleDateFormat("MM/dd/YYYY");//MM shud be in caps
            System.out.println(sdf.format(today));
            LocalDate date1=LocalDate.now();
            System.out.println(date1);
            LocalTime time1=LocalTime.now();
            System.out.println(time1);


            GregorianCalendar cal=new GregorianCalendar();
            int year=cal.get(cal.YEAR);
            System.out.println(cal.getTime());
            System.out.println(year);

        }
    }


