package template;

import java.util.ArrayList;
import java.util.Comparator;

public class ArrayListOfConsistentHash extends BaseConsistentHash {

    record Pair(
            Long key,
            String value
    ) {
    }

    private final ArrayList<Pair> list = new ArrayList<>();

    @Override
    protected void sort() {
        list.sort(Comparator.comparing(Pair::key).thenComparing(Pair::value));
    }

    @Override
    protected void add(long key, String value) {
        //先搞几个虚拟节点
        int NODE_SIZE = 2;
        for (int i = 0; i < NODE_SIZE; i++) {
            list.add(new Pair(super.hash("node" + i + key), value));
        }
        list.add(new Pair(key, value));
    }

    @Override
    protected String getFirstNodeValue(String key) {
        //基于二分实现
        Long hash = hash(key);
        int l = 0, r = list.size();
        while (l < r) {
            int mid = l + r >> 1;
            if (list.get(mid).key >= hash) r = mid;
            else l = mid + 1;
        }
        return list.get(l).value;
    }

    @Override
    protected void processBefore() {
        list.clear();
        logger.info("只需arraylist实现的一致性hash");
    }
}
