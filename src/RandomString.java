
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Random;
import java.util.UUID;
/**
 * 描述:
 * 生成随机的工具类
 *
 * @author James
 * @create 2018-09-01 上午 10:43
 */
public class RandomString {

    /**
     * 获取随机字符串 a-z,A-Z,0-9
     * @param length    长度
     * @return
     */
    public static String getRandomString(int length) {
        String str = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        Random random = new Random(23);
        StringBuffer sb = new StringBuffer();

        for (int i = 0; i < length; ++i) {
            //int number = random.nextInt(62);// [0,62)
            sb.append(str.charAt(random.nextInt(62)));
        }
        return sb.toString();
    }

    /**
     * JAVA获得0-9,a-z,A-Z范围的随机数
     *
     * @param length 随机数长度
     * @return String
     */
    public static String getRandomChar(int length) {
        char[] chr = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
                'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z',
                'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z' };
        Random random = new Random(27);
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < length; i++) {
            sb.append(chr[random.nextInt(62)]);
        }
        return sb.toString();
    }

    /**
     * 获取随机字符串 a-z
     * @param length    长度
     * @return
     */
    public static String getLowerLetter(int length) {
        String str = "abcdefghijklmnopqrstuvwxyz";
        Random random = new Random();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < length; ++i) {
            sb.append(str.charAt(random.nextInt(26)));
        }
        return sb.toString();
    }

    /**
     * 获取随机字符串 0-9
     * @param length    长度
     * @return
     */
    public static String getNumber(int length) {
        String str = "0123456789";
        Random random = new Random(31);
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < length; ++i) {
            sb.append(str.charAt(random.nextInt(10)));
        }
        return sb.toString();
    }

    /**
     * 获取随机字符串 0-9,a-z,0-9
     * 有两遍0-9，增加数字概率
     * @param length    长度
     * @return
     */
    public static String getLowerLetterNumber(int length) {
        String str = "0123456789abcdefghijklmnopqrstuvwxyz0123456789";
        Random random = new Random(23);
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < length; ++i) {
            sb.append(str.charAt(random.nextInt(46)));
        }
        return sb.toString();
    }

    /**
     * 获取随机密码，lLength位小写英文+nLength位数字
     * @param lLength   字母长度
     * @param nLength   数字长度
     * @return
     */
    public static String getPasswordSimple(int lLength, int nLength) {
        return getLowerLetter(lLength)+getNumber(nLength);
    }

    /**
     * 获取随机密码，包含英文和数字
     * @param length 密码长度
     * @return
     */
    public static String getPasswordComplex(int length) {
        String password;
        while(true){
            password = getLowerLetterNumber(6);
            //必须包含字母和数字
            if (password.matches("(?![0-9]+$)(?![a-zA-Z]+$)[0-9A-Za-z]{6,20}")) {
                return password;
            }
        }
    }

    /**
     * 产生一个32位的GUID
     * @return
     */
    public static String newGUID() {
        UUID uuid = UUID.randomUUID();
        return uuid.toString().replace("-", "");
    }

    /**
     * 获取32位GUID
     *
     * @return
     */
    public static String getId() {
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            UUID uuid = UUID.randomUUID();
            String guidStr = uuid.toString();
            md.update(guidStr.getBytes(), 0, guidStr.length());
            return new BigInteger(1, md.digest()).toString(16);
        } catch (NoSuchAlgorithmException e) {
            return null;
        }
    }
}
