package state;

import r.Result;
import r.Status;
import state.impl.*;

import java.util.HashMap;
import java.util.Map;


public class StateMachine {

    private static final Map<Enum<Status>, State> stateMap = new HashMap<>();


    static {
        stateMap.put(Status.Check, new CheckState());     // 待审核
        stateMap.put(Status.Close, new CloseState());     // 已关闭
        stateMap.put(Status.Doing, new DoingState());     // 活动中
        stateMap.put(Status.Editing, new EditingState()); // 编辑中
        stateMap.put(Status.Open, new OpenState());       // 已开启
        stateMap.put(Status.Pass, new PassState());       // 审核通过
        stateMap.put(Status.Refuse, new RefuseState());   // 审核拒绝
    }


    public Result arraignment(String activityId, Enum<Status> currentStatus) {
        return stateMap.get(currentStatus).arraignment(activityId, currentStatus);
    }

    public Result checkPass(String activityId, Enum<Status> currentStatus) {
        return stateMap.get(currentStatus).checkPass(activityId, currentStatus);
    }

    public Result checkRefuse(String activityId, Enum<Status> currentStatus) {
        return stateMap.get(currentStatus).checkRefuse(activityId, currentStatus);
    }

    public Result checkRevoke(String activityId, Enum<Status> currentStatus) {
        return stateMap.get(currentStatus).checkRevoke(activityId, currentStatus);
    }

    public Result close(String activityId, Enum<Status> currentStatus) {
        return stateMap.get(currentStatus).close(activityId, currentStatus);
    }

    public Result open(String activityId, Enum<Status> currentStatus) {
        return stateMap.get(currentStatus).open(activityId, currentStatus);
    }

    public Result doing(String activityId, Enum<Status> currentStatus) {
        return stateMap.get(currentStatus).doing(activityId, currentStatus);
    }

    public Result doDefaultNextAction(String activityId, Enum<Status> currentStatus) {
        return stateMap.get(currentStatus).doDefaultNextAction(activityId, currentStatus);
    }

}
