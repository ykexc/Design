package ele;

public class BonusVisitor implements Visitor {
    @Override
    public void visit(Leader leader) {
        System.out.println("Pay " + leader.bonus + " to leader");
    }

    @Override
    public void visit(Employee employee) {
        System.out.println("Pay " + employee.bonus + " to employee");
    }

    @Override
    public void visit(OutsourcedEmployee outsourcedEmployee) {
        System.out.println("Pay " + outsourcedEmployee.bonus + " to outsourcedEmployee");
    }
}
