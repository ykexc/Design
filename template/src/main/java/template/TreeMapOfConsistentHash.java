package template;

import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapOfConsistentHash extends BaseConsistentHash{


    private final TreeMap<Long, String> treeMap = new TreeMap<>();


    private static final int NODE_SIZE = 2;

    /**
     * 加入一些虚拟节点
     * @param key key
     * @param value value
     */
    @Override
    protected void add(long key, String value) {
        for (int i = 0; i < NODE_SIZE; i++) {
            treeMap.put(super.hash("node" + key + i), value);
        }
        treeMap.put(super.hash(String.valueOf(key)), value);
    }

    /**
     * @param key key
     * @return value
     */
    @Override
    protected String getFirstNodeValue(String key) {

        Long hash = super.hash(key);
        SortedMap<Long, String> last = treeMap.tailMap(hash);  //这个方法返回从这里开始向后的元素(包含这个)
        if (!last.isEmpty()) {
            return last.get(last.firstKey());
        }
        if (treeMap.isEmpty()) throw new IllegalStateException("not support");
        return treeMap.firstEntry().getValue();
    }

    /**
     *
     */
    @Override
    protected void processBefore() {
        treeMap.clear();
        logger.info("只需arraylist实现的一致性hash");
    }
}
