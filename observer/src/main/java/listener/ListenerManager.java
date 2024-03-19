package listener;

import java.util.HashMap;
import java.util.Map;

public final class ListenerManager {

    public enum EventType {

        MESSAGE

    }

    Map<Enum<EventType>, Listener> map = new HashMap<>();

    public void subscribe(Enum<EventType> eventTypeEnum, Listener listener) {
        map.put(eventTypeEnum, listener);
    }

    public void unsubscribe(Enum<EventType> eventTypeEnum) {
        map.remove(eventTypeEnum);
    }

    public void notify(Enum<EventType> eventTypeEnum, Long userId) {
        map.get(eventTypeEnum).doEvent(userId);
    }

}
