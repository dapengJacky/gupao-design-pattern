package gupao.adapter.login;

import lombok.Data;

/**
 * @author peng.chen12@hand-china.com
 * @description
 * @date 2020/3/11
 */
@Data
public class ResultMsg {

    private int code;
    private String msg;
    private Object data;

    public ResultMsg(int code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }   public ResultMsg(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public ResultMsg() {
        this.code = 200;
    }
}
