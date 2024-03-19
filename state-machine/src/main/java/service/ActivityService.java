package service;

import r.ActivityInfo;
import r.Status;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class ActivityService {

    private static final Map<String, Enum<Status>> currentStatus = new HashMap<>();



    public static void init(String activityId, Enum<Status> initStatus) {
        currentStatus.put(activityId, initStatus);
    }

    public static synchronized void execStatus(String activityId, Enum<Status> beforeStatus, Enum<Status> nextStatus) {
        if (!currentStatus.get(activityId).equals(beforeStatus)) return;
        currentStatus.put(activityId, nextStatus);
    }

    public Enum<Status> queryActivityStatus(String activityId) {
        return currentStatus.get(activityId);
    }

    public ActivityInfo queryActivityInfo(String activityId) {
        return new ActivityInfo() {{
            setActivityId(activityId);
            setActivityName("一个活动");
            setBeginTime(new Date());
            setEndTime(new Date());
            setStatus(queryActivityStatus(activityId));
        }};
    }

}
