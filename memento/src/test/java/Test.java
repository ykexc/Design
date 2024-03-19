import caretaker.Admin;
import memento.Txt;
import originator.Editor;

public class Test {

    @org.junit.Test
    public void test() {
        Admin admin = new Admin();
        Editor editor = new Editor();
        editor.setTxt("版本1");
        admin.save(editor.getTxt());
        editor.setTxt("版本2");
        admin.save(editor.getTxt());
        
    }

}
