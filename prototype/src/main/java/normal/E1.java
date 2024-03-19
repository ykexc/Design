package normal;

public class E1 implements Cloneable{

    public String name;
    R obj;

    int v;

    public E1(R _obj, String _name, int _v) {
        this.name = _name;
        this.v = _v;
        this.obj = _obj;
    }


    @Override
    public E1 clone() throws CloneNotSupportedException {
        E1 ret = null;
        ret = (E1) super.clone();
        ret.obj = ret.obj.clone();
        return ret;
    }


    @Override
    public String toString() {
        return "E{" +
                "name='" + name + '\'' +
                ", obj=" + obj +
                ", v=" + v +
                '}';
    }
}


