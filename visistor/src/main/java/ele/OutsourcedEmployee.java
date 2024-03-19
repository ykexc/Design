package ele;

public class OutsourcedEmployee implements Element {

  int hourlyRate = 100;

  int bonus = 30;
  
  @Override
  public void accept(Visitor visitor) {
    visitor.visit(this);
  }

}