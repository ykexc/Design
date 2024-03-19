package decision.logic;

import decision.Strategy;
import decision.tree.TreeLink;

import java.util.List;

public interface Filter {


    String filter(String realVal, List<TreeLink> links);



    boolean judge(String realVal, TreeLink.StrategyType strategyType, String limitVal);

}
