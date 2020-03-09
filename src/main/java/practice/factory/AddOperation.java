package practice.factory;

import java.math.BigDecimal;

/**
 * @author peng.chen12@hand-china.com
 * @description
 * @date 2020/3/9
 */
public class AddOperation extends Operation {

    @Override
    public Double operationResult() {
        return BigdecimalUtils.add(new BigDecimal(numberA),new BigDecimal(numberB)).doubleValue();
    }
}
