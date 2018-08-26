
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
     * String 转换为 TimeStamp
     * @param value 待转换的String，格式必须为 yyyy-mm-dd hh:mm:ss[.f...] 这样的格式，中括号表示可选，否则报错
     * @return
     */
    public static Timestamp string2Timestamp(String value){
        if(value == null && !"".equals(value.trim())){
            return null;
        }
        Timestamp ts = new Timestamp(System.currentTimeMillis());
        ts = Timestamp.valueOf(value);
        return ts;
    }

    /**
     * date 转换成 timestamp
     * @param date
     * @return Timestamp
     */
    public static Timestamp date2Timestamp(Date date){
        if(date == null){
            return null;
        }
        return new Timestamp(date.getTime());
    }

    /**
     * Timestamp转换为Date
     * @param time
     * @return Date
     */
    public static Date timestamp2Date(Timestamp time){
        return time == null ? null : time;
    }

}
