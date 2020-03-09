package practice.factory;

import lombok.Data;

/**
 * @author peng.chen12@hand-china.com
 * @description
 * @date 2020/3/9
 */
@Data
public abstract class Operation {
    protected String numberA;
    protected String numberB;

    public abstract Double operationResult();
}
