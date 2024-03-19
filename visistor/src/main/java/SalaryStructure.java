import ele.Element;
import ele.Employee;
import ele.Leader;
import ele.OutsourcedEmployee;
import ele.Visitor;

import java.util.ArrayList;
import java.util.List;

public class SalaryStructure {
  private List<Element> elements;

  public SalaryStructure() {
    elements = new ArrayList<>();
    // 这部分可以根据实际需求来生成对象
    elements.add(new Leader());
    elements.add(new Employee());
    elements.add(new OutsourcedEmployee());
  }

  public void show(Visitor visitor) {
    for (Element element : elements) {
      element.accept(visitor);
    }
  }
}