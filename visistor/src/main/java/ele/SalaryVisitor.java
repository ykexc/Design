package ele;

public class SalaryVisitor implements Visitor {
  
  @Override
  public void visit(Leader leader) {
    // 假定领导有2倍的基础薪水和额外的奖金
    int salary = leader.monthlySalary * 2 + 1000;
    System.out.println("Pay " + salary + " to leader");
  }

  @Override
  public void visit(Employee employee) {
    int salary = employee.monthlySalary;
    System.out.println("Pay " + salary + " to employee");
  }

  @Override
  public void visit(OutsourcedEmployee outsourcedEmployee) {
    // 假定外包员工按小时支付，每月工作160小时
    int salary = outsourcedEmployee.hourlyRate * 160;
    System.out.println("Pay " + salary + " to outsourced employee");
  }
}