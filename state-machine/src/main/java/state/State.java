package state;

import r.Result;
import r.Status;

public interface State {


    /**
     * 活动提审
     *
     * @param activityId    活动ID
     * @param currentStatus 当前状态
     * @return 执行结果
     */
    Result arraignment(String activityId, Enum<Status> currentStatus);

    /**
     * 审核通过
     *
     * @param activityId    活动ID
     * @param currentStatus 当前状态
     * @return 执行结果
     */
    Result checkPass(String activityId, Enum<Status> currentStatus);

    /**
     * 审核拒绝
     *
     * @param activityId    活动ID
     * @param currentStatus 当前状态
     * @return 执行结果
     */
    Result checkRefuse(String activityId, Enum<Status> currentStatus);

    /**
     * 撤审撤销
     *
     * @param activityId    活动ID
     * @param currentStatus 当前状态
     * @return 执行结果
     */
    Result checkRevoke(String activityId, Enum<Status> currentStatus);

    /**
     * 活动关闭
     *
     * @param activityId    活动ID
     * @param currentStatus 当前状态
     * @return 执行结果
     */
    Result close(String activityId, Enum<Status> currentStatus);

    /**
     * 活动开启
     *
     * @param activityId    活动ID
     * @param currentStatus 当前状态
     * @return 执行结果
     */
    Result open(String activityId, Enum<Status> currentStatus);

    /**
     * 活动执行
     *
     * @param activityId    活动ID
     * @param currentStatus 当前状态
     * @return 执行结果
     */
    Result doing(String activityId, Enum<Status> currentStatus);


    default Result doDefaultNextAction(String activityId, Enum<Status> currentStatus) {
        throw new IllegalStateException("没有下一个默认的操作");
    }
}
