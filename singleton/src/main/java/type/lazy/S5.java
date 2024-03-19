package type.lazy;

/**
 * 线程安全，无锁，比较推荐
 */
public class S5 {

    private static final class S5Holder {
        static final S5 s5 = new S5();
    }


    public static S5 getInstance() {
        return S5Holder.s5;
    }

}

