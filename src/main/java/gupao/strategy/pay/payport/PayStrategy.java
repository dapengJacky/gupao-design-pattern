package gupao.strategy.pay.payport;

import org.apache.commons.lang.StringUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * @author peng.chen12@hand-china.com
 * @description
 * @date 2020/3/15
 */
public class PayStrategy {

    private static final Map<String,Payment> PAY_MAP = new HashMap<String, Payment>();

    static {
        PAY_MAP.put(PayKey.ALI_PAY,new AliPay());
        PAY_MAP.put(PayKey.WECHAT_PAY,new WechatPay());
        PAY_MAP.put(PayKey.JD_PAY,new JDPay());
        PAY_MAP.put(PayKey.UNION_PAY,new UnionPay());
    }
    public static Payment getPayWay(String payKey){
        return PAY_MAP.containsKey(payKey)?PAY_MAP.get(payKey):getDefaultPayWay();
    }

    private static Payment getDefaultPayWay(){
        return PAY_MAP.get(PayKey.ALI_PAY);
    }

    public interface PayKey{
        String ALI_PAY = "ALI_PAY";
        String WECHAT_PAY = "WECHAT_PAY";
        String JD_PAY = "JD_PAY";
        String UNION_PAY = "UNION_PAY";

    }

}
