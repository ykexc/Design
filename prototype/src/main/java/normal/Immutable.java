package normal;

public final class Immutable {

    private final int val;

    public Immutable(int _val) {
        val = _val;
    }

    public Immutable add(Immutable immutable) {
        return new Immutable(immutable.val + val);
    }
}
