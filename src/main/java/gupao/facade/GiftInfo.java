package gupao.facade;

import lombok.Data;

/**
 * @author peng.chen12@hand-china.com
 * @description
 * @date 2020/3/5
 */
@Data
public class GiftInfo {

    private Integer score = 5;

    private Integer inv = 1;

    private String name;

    public GiftInfo(String name) {
        this.name = name;
    }
}
