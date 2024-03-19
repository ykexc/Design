package decision.logic;

import decision.Strategy;
import decision.aggregation.TreeRich;
import decision.tree.TreeLink;

import java.util.List;

public abstract class BaseFilter implements Filter {

    @Override
    public String filter(String realVal, List<TreeLink> links) {
        for (var link : links) {
            if (judge(realVal, link.getStrategyType(), link.getLimitVal())) return link.getToTreeId();
        }
        return "-1";
    }


    public abstract String getRealVal(TreeRich.User user);


    @Override
    public boolean judge(String realVal, TreeLink.StrategyType strategyType, String limitVal) {
        switch (strategyType) {
            case EQ -> {
                return realVal.equals(limitVal);
            }
            case GT -> {
                return Double.parseDouble(realVal) >= Double.parseDouble(limitVal);
            }
            case LT -> {
                return Double.parseDouble(realVal) <= Double.parseDouble(limitVal);
            }
            default -> {
                return false;
            }
        }
    }
}
