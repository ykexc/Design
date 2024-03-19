package originator;

import memento.Txt;

public class Editor {

    Txt txt;


    public Txt setTxt(String properties) {
        return this.txt = new Txt(properties);
    }

    public void restore(Txt txt) {
        this.txt = txt;
    }

    public Txt getTxt() {
        return txt;
    }
}
