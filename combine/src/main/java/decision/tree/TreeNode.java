package decision.tree;

import decision.Strategy;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TreeNode {


    String rootId;

    String treeId;


    TreeType treeType;


    String val;

    List<TreeLink> links;

    Strategy strategy;

}
