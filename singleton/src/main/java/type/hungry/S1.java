package type.hungry;

/**
 * 线程安全, 此种类型也可以不要获取实例方法
 */
public class S1 {

    public static final S1 INSTANCE = new S1();

    public static S1 getInstance() {
        return INSTANCE;
    }

}
