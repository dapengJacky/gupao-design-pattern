package gupao.flyweight.general;

import java.util.HashMap;
import java.util.Map;

/**
 * @author peng.chen12@hand-china.com
 * @description 享元工厂
 * @date 2020/3/8
 */
public class FlyWeightFacotry {

    private static Map<String,IFlyWeight> pool = new HashMap<String, IFlyWeight>();

    // 因为内部状态具备不变性，因此作为缓存的键
    public static IFlyWeight getFlyWeight(String intrinsicState){
        if(!pool.containsKey(intrinsicState)){
            ConcreteFlyWeight flyWeight = new ConcreteFlyWeight(intrinsicState);
            pool.put(intrinsicState,flyWeight);
        }
        return pool.get(intrinsicState);
    }
}
