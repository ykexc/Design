package impl;

import algorithm.Algorithm;
import res.R;

public class Alogrithm2 extends Algorithm {

    public Alogrithm2(String _name) {
        super(_name);
    }

    @Override
    public R calculate(String question) {
        boolean condition = true;
        logger.info("执行" + getName() + "算法成功");
        return new R("执行" + getName() + "算法成功", question + "*", condition);
    }
}
