package pay.impl;

import pay.IPayMode;

public class FingerPayMode implements IPayMode {
    @Override
    public boolean checkSecurity(String uid) {
        //业务逻辑
        System.out.println("指纹校验");
        return true;
    }
}
