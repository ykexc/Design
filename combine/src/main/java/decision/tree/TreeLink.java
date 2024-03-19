package decision.tree;

import decision.Strategy;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TreeLink {


    public enum StrategyType {
        EQ,

        GT,

        LT
    }

    String treeRootId;


    String fromTreeId;


    String toTreeId;

    String limitVal;

    StrategyType strategyType;

}
