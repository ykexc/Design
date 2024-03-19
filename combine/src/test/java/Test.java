import decision.Strategy;
import decision.aggregation.TreeRich;
import decision.engine.Engine;
import decision.engine.impl.TreeEngine;
import decision.res.R;
import decision.tree.TreeLink;
import decision.tree.TreeNode;
import decision.tree.TreeRoot;
import decision.tree.TreeType;

import java.util.Collections;
import java.util.List;
import java.util.Map;

public class Test {


    @org.junit.Test
    public void test() {

        TreeNode treeNode001 = new TreeNode(
                "1",
                "001",
                TreeType.NORMAL,
                null,
                List.of(
                        new TreeLink("1", "001", "002", "60",
                                TreeLink.StrategyType.GT
                        ),
                        new TreeLink("1", "001", "003", "59",
                                TreeLink.StrategyType.LT)),
                Strategy.AGE);

        TreeNode treeNode002 = new TreeNode(
                "1",
                "002",
                TreeType.NORMAL,
                null,
                List.of(
                        new TreeLink("1", "002", "004", "男",
                                TreeLink.StrategyType.EQ
                        ),
                        new TreeLink("1", "002", "005", "女",
                                TreeLink.StrategyType.EQ)),
                Strategy.GENDER);

        TreeNode treeNode003 = new TreeNode(
                "1",
                "003",
                TreeType.NORMAL,
                null,
                List.of(
                        new TreeLink("1", "003", "006", "男",
                                TreeLink.StrategyType.EQ
                        ),
                        new TreeLink("1", "003", "007", "女",
                                TreeLink.StrategyType.EQ)),
                Strategy.GENDER);

        TreeNode treeNode004 = new TreeNode(
                "1",
                "004",
                TreeType.LEAF,
                "123",
                Collections.emptyList(), null
        );

        TreeNode treeNode005 = new TreeNode(
                "1",
                "005",
                TreeType.LEAF,
                "124",
                Collections.emptyList(),
                null);


        TreeNode treeNode006 = new TreeNode(
                "1",
                "006",
                TreeType.LEAF,
                "125",
                Collections.emptyList(),
                null
        );

        TreeNode treeNode007 = new TreeNode(
                "1",
                "007",
                TreeType.LEAF,
                "126",
                Collections.emptyList(),
                null);


        TreeRich treeRich = new TreeRich(
                new TreeRoot("001", "1号决策树", "中老年决策", "1"), Map.of(
                "001", treeNode001, "002", treeNode002, "003", treeNode003,
                "004", treeNode004, "005", treeNode005, "006", treeNode006, "007", treeNode007
        ), new TreeRich.User("111", "小花", "75", "男"));

        Engine engine = new TreeEngine();
        R process = engine.process(treeRich);
        System.out.println(process);
    }

}
