package pay.impl;

import pay.IPayMode;

public class FacePayMode implements IPayMode {
    @Override
    public boolean checkSecurity(String uid) {
        //业务逻辑
        System.out.println("面容校验");
        return true;
    }
}
