import food.Builder;
import food.IMenu;

public class Test {



    @org.junit.Test
    public void test() {
        IMenu iMenu1 = new Builder().levelOne();
        System.out.println(iMenu1.ofDetail());
        IMenu iMenu2 = new Builder().levelTwo(2);
        System.out.println(iMenu2.ofDetail());
    }

}
