package LintCode;

/**
 * Created by t-tiyou on 9/2/2016.
 */
public class LintCode204 {
    private static LintCode204 instance;

    private LintCode204() {

    }

    /**
     * @return: The same instance of this class every time
     */
    public static LintCode204 getInstance() {
        // write your code here
        if (instance == null)
            instance = new LintCode204();
        return instance;
    }
}


