package algorithm;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import res.R;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class Algorithm {
    public static List<Algorithm> chain = new ArrayList<>();

    protected static Logger logger = LoggerFactory.getLogger(Algorithm.class);

    String name;



    public Algorithm(String _name) {
        name = _name;
        chain.add(this);
    }

    public String getName() {return this.name;}

    public abstract R calculate(String question);

    public static R doCalculate(String question) {
        for (var e : chain) {
            R res = e.calculate(question);
            if (res.haveNext()) question = res.answer();
            else return res;
        }
        return new R(null,null, null);
    }

    public static void buildAlgorithmChain(Algorithm ... algorithms) {
        chain.addAll(Arrays.asList(algorithms));
    }

}
