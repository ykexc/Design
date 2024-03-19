package decision.engine;

import decision.aggregation.TreeRich;
import decision.logic.BaseFilter;
import decision.res.R;
import decision.tree.TreeNode;
import decision.tree.TreeRoot;
import decision.tree.TreeType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;

public abstract class BaseEngine extends EngineConfig implements Engine {

    public static final Logger logger = LoggerFactory.getLogger(BaseEngine.class);

    @Override
    public abstract R process(TreeRich treeRich);


    public TreeNode doProcess(TreeRich treeRich) {
        TreeRoot root = treeRich.getRoot();
        TreeRich.User user = treeRich.getUser();
        Map<String, TreeNode> treeNodeMap = treeRich.getMap();
        TreeNode node = treeNodeMap.get(root.getTreeId());
        while (node.getTreeType().equals(TreeType.NORMAL)) {
            logger.info("决策到节点{}", node);
            BaseFilter filter = map.get(node.getStrategy());
            String realVal = filter.getRealVal(user);
            String nextTreeId = filter.filter(realVal, node.getLinks());
            if ("-1".equals(nextTreeId)) break;
            node = treeNodeMap.get(nextTreeId);
        }
        return node;
    }

}
