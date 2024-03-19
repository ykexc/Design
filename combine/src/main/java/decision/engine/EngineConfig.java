package decision.engine;

import decision.Strategy;
import decision.logic.BaseFilter;
import decision.logic.impl.UserAgeFilter;
import decision.logic.impl.UserGenderFilter;

import java.util.concurrent.ConcurrentHashMap;

public class EngineConfig {

    static final ConcurrentHashMap<Strategy, BaseFilter> map = new ConcurrentHashMap<>();



    static {
        map.put(Strategy.AGE, new UserAgeFilter());
        map.put(Strategy.GENDER, new UserGenderFilter());
    }


}
