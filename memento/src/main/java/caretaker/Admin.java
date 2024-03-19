package caretaker;

import memento.Txt;

import java.util.ArrayList;
import java.util.List;

public class Admin {


    List<Txt> versions = new ArrayList<>();
    int cursor = -1;

    public void save(Txt txt) {
        versions.add(txt);
        cursor++;
    }


    public Txt next() {
        if (cursor + 1 >= versions.size()) throw new IllegalStateException("错误");
        return versions.get(++cursor);
    }


    public Txt pre() {
        if (cursor - 1 <= -1) throw new IllegalStateException("错误");
        return versions.get(--cursor);
    }

}
