package gupao.strategy.pay;

import lombok.Data;

/**
 * @author peng.chen12@hand-china.com
 * @description
 * @date 2020/3/15
 */
@Data
public class MsgResult {

    private String msg;
    private Object data;
    private Integer code;

    public MsgResult(Integer code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    @Override
    public String toString() {
        return "MsgResult{" +
                "msg='" + msg + '\'' +
                ", data=" + data +
                ", code=" + code +
                '}';
    }
}
