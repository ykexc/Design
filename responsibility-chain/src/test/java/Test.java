import algorithm.Algorithm;
import impl.Alogrithm1;
import impl.Alogrithm2;
import impl.Alogrithm3;

public class Test {


    @org.junit.Test
    public void test() {
        Algorithm alogrithm2 = new Alogrithm2("算法2");
        Algorithm alogrithm3 = new Alogrithm3("算法3");
        Algorithm alogrithm1 = new Alogrithm1("算法1");

        Algorithm.doCalculate("xx");
    }

}
