package practice.factory;

import java.math.BigDecimal;

/**
 * @author peng.chen12@hand-china.com
 * @description
 * @date 2020/3/9
 */
public class BigdecimalUtils {

    public static BigDecimal add(BigDecimal b1,BigDecimal b2){
        return ifNullDefault(b1).add(ifNullDefault(b2));
    }

    private static BigDecimal ifNullDefault(BigDecimal value){
        return value==null?BigDecimal.ZERO:value;
    }
}
