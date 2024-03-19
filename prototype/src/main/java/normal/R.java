package normal;

import java.io.Serializable;

public class R implements Cloneable, Serializable {


    @Override
    protected R clone() throws CloneNotSupportedException {
        return (R) super.clone();
    }
}
