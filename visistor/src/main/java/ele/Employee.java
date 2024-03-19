package ele;

public class Employee implements Element {

  int monthlySalary = 3000;

  int bonus = 500;
  
  @Override
  public void accept(Visitor visitor) {
      visitor.visit(this);
  }

}