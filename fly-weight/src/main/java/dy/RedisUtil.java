package dy;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class RedisUtil {

    private static ScheduledExecutorService executorService = Executors.newScheduledThreadPool(1);


    private static AtomicInteger stock = new AtomicInteger();

    static {
        executorService.scheduleAtFixedRate(() -> {
            stock.addAndGet(1);
        }, 0, 100000, TimeUnit.MICROSECONDS);
    }


    public static Integer getStock(Integer id) {
        return stock.get();
    }

}
