package normal;

import java.io.*;

public class E2 implements Serializable {

    private final R obj;

    public final String name;


    private final int k;


    public E2(R _obj, String _name, int _k) {
        this.obj = _obj;
        this.name = _name;
        this.k = _k;
    }


    @Override
    public String toString() {
        return "E2{" +
                "obj=" + obj +
                ", name='" + name + '\'' +
                ", k=" + k +
                '}';
    }


    public E2 cloneBySerializable() throws IOException, ClassNotFoundException {
        try (
                var buf = new ByteArrayOutputStream();
                var oos = new ObjectOutputStream(buf)
        ) {
            oos.writeObject(this);
            try (
                    var in = new ObjectInputStream(new ByteArrayInputStream(buf.toByteArray()))
                    ) {
                return (E2) in.readObject();
            }
        }
    }
}
