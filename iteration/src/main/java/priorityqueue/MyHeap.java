package priorityqueue;

import java.util.Comparator;
import java.util.Iterator;

/**
 * 堆是一个完全二叉树
 * 小根堆的最小为根
 * 大根堆的最大为根
 * 存储: 使用一个数组来存, 1号点为根, 左儿子为2x,右儿子为2x+1
 * 两个基本操作: down(x), up(x)
 * 删除的时候有技巧: 用最后一个元素覆盖第一个元素, 然后删除最后一个元素
 */
public class MyHeap<T> implements Iterable<T>{


    private Comparator<? super T> comparator;

    private final T[] array;

    private int size;

    private int sum;

    public MyHeap(int initSize, Comparator<T> comparator) {
        this.comparator = comparator;
        array = (T[]) new Object[initSize + 1];
    }

    public MyHeap(int maxSize) {
        array = (T[]) new Object[maxSize + 1];
    }


    /**
     *
     * @param maxSize 最大容量
     * @param heapifyArray 需要被heapify的数组
     * 时间复杂度O(n)
     */
    public MyHeap(int maxSize, T[] heapifyArray) {
        array = (T[]) new Object[maxSize + 1];
        System.arraycopy(heapifyArray, 1, array, 1, heapifyArray.length - 1);
        size = heapifyArray.length;
        for (int i = heapifyArray.length / 2; i >= 1; i--) down(i);
    }

    private int compare(T a, T b) {
        if (comparator != null) return comparator.compare(a, b);
        if (a instanceof Comparable<?>) return ((Comparable<? super T>) a).compareTo(b);
        throw new UnsupportedOperationException("必须有一个比较规则");
    }

    /**
     * 核心算法: 向下调整
     * @param u 从此节点开始down
     */
    private void down(int u) {
        int t = u;
        if (u * 2 <= size && compare(array[u * 2], array[u]) < 0) t = u * 2;
        if (u * 2 + 1 <= size && compare(array[u * 2 + 1], array[t]) < 0) t = u * 2 + 1;
        if (u != t) {
            swap(u, t);
            down(t);
        }
    }

    /**
     * 核心算法: 向上调整
     * @param u 从此节点开始up
     */
    private void up(int u) {
        while (u / 2 > 0 && compare(array[u / 2], array[u]) > 0) {
            swap(u, u / 2);
            u /= 2;
        }
    }

    private void swap(int i, int j) {
        T temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public T poll() {
        if (size == 0) throw new IllegalStateException("堆是空的!");
        T ret = array[1];
        array[1] = array[size];
        size--;
        down(1);
        if (ret instanceof Integer av) {
            sum -= av;
        }
        return ret;
    }

    public void add(T v) {
        if (size == array.length -1) throw new IllegalStateException("堆满了!");
        size++;
        array[size] = v;
        up(size);
        if (v instanceof Integer av) {
            sum += av;
        }

    }

    public boolean isEmpty() {
        return size == 0;
    }

    public T peek() {
        return array[1];
    }

    public int size() {
        return size;
    }

    public int getSum() {
        return sum;
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {

            int it = 1;

            @Override
            public boolean hasNext() {
                return it <= size();
            }

            @Override
            public T next() {
                if (!hasNext()) throw new IllegalStateException("已经到尾了");
                return array[it++];
            }
        };
    }
}
