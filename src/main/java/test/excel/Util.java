package test.excel;

/**
 * @author lvmeijuan
 * @create 2019-04-17 19:20
 */
public class Util {

    /**
     * 15      * get postfix of the path
     * 16      * @param path
     * 17      * @return
     * 18
     */
    public static String getPostfix(String path) {
        if (path == null || Common.EMPTY.equals(path.trim())) {
            return Common.EMPTY;
        }
        if (path.contains(Common.POINT)) {
            return path.substring(path.lastIndexOf(Common.POINT) + 1, path.length());
        }
        return Common.EMPTY;
    }
}
