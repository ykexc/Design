package normal;

public class E3 implements Cloneable{

    String s;

    Immutable immutable;

    public E3(Immutable _immutable, String _s) {
        immutable = _immutable;
        s = _s;
    }

    @Override
    public E3 clone() throws CloneNotSupportedException {
        return (E3) super.clone();
    }


    public static void main(String[] args) throws CloneNotSupportedException {
        E3 e3 = new E3(new Immutable(5), "ykexc");

        E3 clone = e3.clone();

        System.out.println(clone.immutable);
        System.out.println(e3.immutable);
        System.out.println(clone.immutable == e3.immutable);


        System.out.println(clone.s);
        System.out.println(e3.s);
        System.out.println(e3.s == clone.s);
    }
}
