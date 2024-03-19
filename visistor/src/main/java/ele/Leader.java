package ele;

public class Leader implements Element {

  int monthlySalary = 5000;
  int bonus = 100;
  
  @Override
  public void accept(Visitor visitor) {
      visitor.visit(this);
  }

}