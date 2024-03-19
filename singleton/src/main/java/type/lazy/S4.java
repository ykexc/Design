package type.lazy;

/**
 * 效率较高且安全的懒汉式
 */
public class S4 {
    public static volatile S4 s4;

    public static S4 getInstance() {
        if (s4 != null) return s4;
        synchronized (S4.class) {
            if (s4 != null) {
                s4 = new S4();
            }
        }
        return s4;
    }
}
