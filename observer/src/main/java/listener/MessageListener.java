package listener;

public class MessageListener implements Listener{
    @Override
    public void doEvent(Long userId) {
        System.out.println(userId + "成功购买了一张票， 发个短信通知下他");
    }
}
