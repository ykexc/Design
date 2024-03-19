package impl;

import algorithm.Algorithm;
import res.R;

public class Alogrithm1 extends Algorithm {


    public Alogrithm1(String _name) {
        super(_name);
    }

    @Override
    public R calculate(String question) {
        boolean condition = false;
        logger.info("执行" + getName() + "算法成功");
        return new R("执行" + getName() + "算法成功", question + "*", condition);
    }
}
