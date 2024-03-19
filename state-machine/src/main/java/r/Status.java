package r;

public enum Status {

    // 1创建编辑、2待审核、3审核通过(任务扫描成活动中)、4审核拒绝(可以撤审到编辑状态)、5活动中、6活动关闭、7活动开启(任务扫描成活动中)
    Editing {
        @Override
        public Status defaultNextStatus(Status status) {
            return Check;
        }
    },
    Check {
        @Override
        public Status defaultNextStatus(Status status) {
            return Pass;
        }
    },
    Pass {
        @Override
        public Status defaultNextStatus(Status status) {
            return Doing;
        }
    },
    Refuse,
    Doing {
        @Override
        public Status defaultNextStatus(Status status) {
            return Close;
        }
    },
    Close,
    Open;

    public Status defaultNextStatus(Status status) {
        throw new IllegalStateException("未定义默认下一个状态");
    }

}
