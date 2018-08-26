
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
 * 描述:
 * Timestamp
 *
 * @author James
 * @create 2018-08-26 下午 4:45
 */
public class TimestampUtils {


    /**
     *
     * @param date
     * @return Timestamp
     */
    public static Timestamp date2Timestamp(Date date){
        if(date == null){
            return null;
        }
        return new Timestamp(date.getTime());
    }


}
