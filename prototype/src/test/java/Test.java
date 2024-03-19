import normal.E1;
import normal.E2;
import normal.R;

import java.io.IOException;

public class Test {


    @org.junit.Test
    public void test0() throws CloneNotSupportedException {
        E1 e = new E1(new R(), "huya", 123);
        long t1 = System.currentTimeMillis();
        E1 clone = e.clone();
        long t2 = System.currentTimeMillis();
        System.out.println(t2 - t1);
        System.out.println(e);
        System.out.println(clone);
        System.out.println(e.name == clone.name); //输出true

    }

    @org.junit.Test
    public void test1() throws IOException, ClassNotFoundException {
        E2 e = new E2(new R(), "huya", 123);
        long t1 = System.currentTimeMillis();
        E2 clone = e.cloneBySerializable();
        long t2 = System.currentTimeMillis();
        System.out.println(t2 - t1);
        System.out.println(e);
        System.out.println(clone);
        System.out.println(e.name == clone.name); //输出false
    }




}
