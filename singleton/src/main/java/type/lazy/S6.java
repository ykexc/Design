package type.lazy;

import java.util.concurrent.atomic.AtomicReference;

/**
 * 懒汉，使用Atomic,乐观锁
 */
public class S6 {

    private static final AtomicReference<S6> INSTANCE = new AtomicReference<>();


    public static S6 getInstance() {
        S6 s6 = INSTANCE.get();
        if (s6 != null) return s6;
        INSTANCE.compareAndSet(null, new S6());
        return INSTANCE.get();
    }


}
