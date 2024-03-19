package decision.engine.impl;

import decision.aggregation.TreeRich;
import decision.engine.BaseEngine;
import decision.res.R;
import decision.tree.TreeNode;
import decision.tree.TreeType;

public class TreeEngine extends BaseEngine {
    @Override
    public R process(TreeRich treeRich) {
        TreeNode treeNode = this.doProcess(treeRich);
        if (treeNode.getTreeType() != TreeType.LEAF) return new R(treeRich.getUser().getUserId(), "未能匹配结果");
        return new R(treeRich.getUser().getUserId(), treeNode.getVal());
    }
}
