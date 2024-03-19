import com.cm.ICommand;
import com.cm.Invoker;
import com.cm.Light;
import com.cm.impl.TurnOnCommand;

public class Test {

    @org.junit.Test
    public void test() {

        ICommand turnOnCommand = new TurnOnCommand(new Light());
        Invoker invoker = new Invoker(turnOnCommand::execute);
        invoker.invoke();
    }

}
