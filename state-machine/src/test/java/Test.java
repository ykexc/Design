import org.junit.Assert;
import r.Result;
import r.Status;
import service.ActivityService;
import state.StateMachine;

import static r.Status.*;

public class Test {

    @org.junit.Test
    public void test() {
        String activityId = "0x3f3f3f3f";
        Enum<Status> e = Editing;
        ActivityService.init(activityId, e);
        StateMachine stateMachine = new StateMachine();
        Result r1 = stateMachine.arraignment(activityId, e);
        Assert.assertEquals(new Result("0000", "活动提审成功"), r1);
        Result r2 = stateMachine.checkPass(activityId, Check);
        Assert.assertEquals(new Result("0000", "活动审核通过完成"), r2);
        Result r3 = stateMachine.doDefaultNextAction(activityId, Pass);
        Assert.assertEquals(new Result("0000", "活动变更活动中完成"), r3);
    }


    @org.junit.Test
    public void test1() {
        String activityId = "0x3f3f3f3f";
        Enum<Status> e = Editing;
        ActivityService.init(activityId, e);
        StateMachine stateMachine = new StateMachine();
        Result r1 = stateMachine.doing(activityId, e);
        Assert.assertEquals(new Result("0000", "活动提审成功"), r1);
    }
}
