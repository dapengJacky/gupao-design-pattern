package gupao.proxy.dbroute;

import lombok.Data;

/**
 * @author peng.chen12@hand-china.com
 * @description
 * @date 2020/3/3
 */
@Data
public class Order {

    private Object orderInfo;

    private Long createTime;

    private String id;


}
