import java.io.InputStream;
import java.util.Properties;

/**
 * 描述:
 * 读取配置文件
 *
 * @author James
 * @create 2018-08-25 下午 12:46
 */
public class LoadProperties {

    static Properties properties;

    static{
        properties = new Properties();
        try {
            InputStream in = ClassLoader.getSystemResourceAsStream("system.properties");
            properties.load(in);
            in.close();
        } catch (Exception e) {
            System.out.print("读取config.properties文件异常!");
            e.printStackTrace();
        }
    }

    public static String getStockHistory() {
        return properties.getProperty("jdbc.host");
    }
}
