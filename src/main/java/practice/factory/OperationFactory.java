package practice.factory;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author peng.chen12@hand-china.com
 * @description
 * @date 2020/3/9
 */
public class OperationFactory {

    private Operation operation;

    private static Map<Class,Operation> map = new ConcurrentHashMap<Class, Operation>();

    public static Operation getOperation(Class<? extends Operation> clazz){
        if(!map.containsKey(clazz)){
            synchronized (map){
                try {
                    Operation o = clazz.newInstance();
                    map.put(clazz,o);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        return map.get(clazz);

    }
}
