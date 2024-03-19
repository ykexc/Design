package decision.aggregation;

import decision.tree.TreeNode;
import decision.tree.TreeRoot;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TreeRich {


    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class User {
        String userId;

        String userName;

        String age;

        String gender;
    }

    TreeRoot root;


    Map<String, TreeNode> map;

    User user;

}
