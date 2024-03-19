package pay.impl;

import pay.IPayMode;

public class CyPayMode implements IPayMode {
    @Override
    public boolean checkSecurity(String uid) {
        //  业务逻辑
        System.out.println("密码校验");
        return false;
    }
}
