package r;

import java.util.Objects;

public class Result {

    private String code; // 编码
    private String info; // 描述

    public Result(String code, String info) {
        this.code = code;
        this.info = info;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }


    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Result result) {
            return Objects.equals(this.code, result.code) && this.info.equals(result.info);
        }
        return false;
    }
}
