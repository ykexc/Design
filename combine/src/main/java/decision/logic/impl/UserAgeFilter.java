package decision.logic.impl;

import decision.aggregation.TreeRich;
import decision.logic.BaseFilter;

public class UserAgeFilter extends BaseFilter {
    @Override
    public String getRealVal(TreeRich.User user) {
        return user.getAge();
    }
}
