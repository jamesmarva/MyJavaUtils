import java.text.SimpleDateFormat;

/**
 * 描述:
 * date format
 *
 * @author James
 * @create 2018-08-26 下午 2:13
 */
public class DateFormatUtils {
    /** yyyy:年 */
    public static final String DATE_YEAR = "yyyy";

    /** MM：月 */
    public static final String DATE_MONTH = "MM";

    /** DD：日 */
    public static final String DATE_DAY = "dd";

    /** HH：时 */
    public static final String DATE_HOUR = "HH";

    /** mm：分 */
    public static final String DATE_MINUTE = "mm";

    /** ss：秒 */
    public static final String DATE_SECONDES = "ss";

    /** yyyy-MM-dd */
    public static final String DATE_FORMAT_yyyy_MM_dd = "yyyy-MM-dd";

    /** yyyy-MM-dd hh:mm:ss */
    public static final String DATE_FORMAT_yyyy_MM_dd_HH_mm_ss = "yyyy-MM-dd HH:mm:ss";

    /** yyyy-MM-dd hh:mm:ss|SSS */
    public static final String TIME_FORMAT_SSS = "yyyy-MM-dd HH:mm:ss|SSS";

    /** yyyyMMdd */
    public static final String DATE_NOFUll_FORMAT = "yyyyMMdd";

    /** yyyyMMddhhmmss */
    public static final String TIME_NOFUll_FORMAT = "yyyyMMddHHmmss";

//    public static String formatDate(String value){
//        return getFormat(DATE_FORMAT2).format(DateUtils.string2Date(value, DATE_FORMAT2));
//    }

    protected static SimpleDateFormat getFormat(String format){
        if(format == null || "".equals(format)){
            format = DATE_FORMAT_yyyy_MM_dd_HH_mm_ss;
        }
        return new SimpleDateFormat(format);
    }
}
