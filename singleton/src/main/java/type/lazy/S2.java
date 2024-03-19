package type.lazy;

/**
 * 懒汉式线程不安全
 */
public class S2 {
    public static S2 s2;


    public static S2 getInstance() {
        if (s2 == null) s2 = new S2();
        return s2;
    }

}
