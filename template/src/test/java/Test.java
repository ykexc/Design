import template.ArrayListOfConsistentHash;
import template.TreeMapOfConsistentHash;

import java.util.List;

public class Test {

    @org.junit.Test
    public void test() {
        ArrayListOfConsistentHash arrayListOfConsistentHash = new ArrayListOfConsistentHash();
        String v1 = arrayListOfConsistentHash.process(List.of("127.0.0.1", "127.9.2.12", "192.168.150.122", "192.168.133.99"), "sd");
        System.out.println(v1);
        String v2 = arrayListOfConsistentHash.process(List.of("127.0.0.1", "127.9.2.12", "192.168.150.122", "192.168.133.99"), "sds");
        System.out.println(v2);
    }

    @org.junit.Test
    public void test1() {
        TreeMapOfConsistentHash treeMapOfConsistentHash = new TreeMapOfConsistentHash();
        String v1 = treeMapOfConsistentHash.process(List.of("127.0.0.1", "127.9.2.12", "192.168.150.122", "192.168.133.99"), "sd");
        System.out.println(v1);
        String v2 = treeMapOfConsistentHash.process(List.of("127.0.0.1", "127.9.2.12", "192.168.150.122", "192.168.133.99"), "sds");
        System.out.println(v2);
    }

}
