package state.impl;

import r.DefaultRefuseResult;
import r.Result;
import r.Status;
import service.ActivityService;
import state.State;

public class DoingState implements State {
    @Override
    public Result arraignment(String activityId, Enum<Status> currentStatus) {
        return new DefaultRefuseResult();
    }

    @Override
    public Result checkPass(String activityId, Enum<Status> currentStatus) {
        return new DefaultRefuseResult();
    }

    @Override
    public Result checkRefuse(String activityId, Enum<Status> currentStatus) {
        return new DefaultRefuseResult();
    }

    @Override
    public Result checkRevoke(String activityId, Enum<Status> currentStatus) {
        return new DefaultRefuseResult();
    }

    @Override
    public Result close(String activityId, Enum<Status> currentStatus) {
        ActivityService.execStatus(activityId, currentStatus, Status.Close);
        return new Result("0000", "活动关闭成功");
    }

    @Override
    public Result open(String activityId, Enum<Status> currentStatus) {
        return new DefaultRefuseResult();
    }

    @Override
    public Result doing(String activityId, Enum<Status> currentStatus) {
        return new DefaultRefuseResult();
    }

    @Override
    public Result doDefaultNextAction(String activityId, Enum<Status> currentStatus) {
        return this.close(activityId, currentStatus);
    }
}
