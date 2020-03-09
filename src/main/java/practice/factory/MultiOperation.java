package practice.factory;


import java.math.BigDecimal;

/**
 * @author peng.chen12@hand-china.com
 * @description
 * @date 2020/3/9
 */
public class MultiOperation extends Operation {


    @Override
    public Double operationResult() {
        return new BigDecimal(numberA).add(new BigDecimal(numberB)).doubleValue();
    }
}
