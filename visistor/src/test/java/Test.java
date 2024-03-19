import ele.BonusVisitor;
import ele.SalaryVisitor;

public class Test {


    @org.junit.Test
    public void test() {
        SalaryStructure structure = new SalaryStructure();
        structure.show(new SalaryVisitor());
        System.out.println("---------------");
        structure.show(new BonusVisitor());
    }
}
