package sell;

import listener.ListenerManager;
import listener.MessageListener;

public class SellImpl implements Sell{

    ListenerManager manager;

    public SellImpl() {
        manager = new ListenerManager();
        manager.subscribe(ListenerManager.EventType.MESSAGE, new MessageListener());
    }

    @Override
    public void sell(Long userId) {
        System.out.println("成功卖票");
        manager.notify(ListenerManager.EventType.MESSAGE, userId);
    }
}
