package ele;

public interface Visitor {
  void visit(Leader leader);
  void visit(Employee employee);
  void visit(OutsourcedEmployee outsourcedEmployee);
}