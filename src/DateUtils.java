import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 描述:
 * date
 *
 * @author James
 * @create 2018-08-26 下午 2:21
 */
public class DateUtils {

    /**
     * 根据指定格式获取当前时间
     * @param format
     * @return String
     */
    public static String getCurrentTime(String format){
        SimpleDateFormat sdf = DateFormatUtils.getFormat(format);
        Date date = new Date();
        return sdf.format(date);
    }

    /**
     * 获取当前时间，格式为：yyyy-MM-dd HH:mm:ss
     * @return String
     */
    public static String getCurrentTime(){
        return getCurrentTime(DateFormatUtils.DATE_FORMAT_yyyy_MM_dd_HH_mm_ss);
    }


    /**
     * 获取指定格式的当前时间：为空时格式为yyyy-mm-dd HH:mm:ss
     * @param format
     * @return Date
     */
    public static Date getCurrentDate(String format){
        SimpleDateFormat sdf = DateFormatUtils.getFormat(format);
        String dateS = getCurrentTime(format);
        Date date = null;
        try {
            date = sdf.parse(dateS);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }


    /**
     * 获取当前时间，格式为yyyy-MM-dd HH:mm:ss
     * @return Date
     */
    public static Date getCurrentDate(){
        return getCurrentDate(DateFormatUtils.DATE_FORMAT_yyyy_MM_dd_HH_mm_ss);
    }
}
