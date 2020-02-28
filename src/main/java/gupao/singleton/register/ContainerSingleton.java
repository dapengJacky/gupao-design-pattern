package gupao.singleton.register;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author peng.chen12@hand-china.com
 * @description 容器式单例
 * 优点：适用于实例非常多的情况，便于管理
 * 缺点：线程不安全
 * @date 2020/2/28
 */
public class ContainerSingleton {

    private static Map<Class,Object> instanceMap = new ConcurrentHashMap<Class,Object>();

    private ContainerSingleton(){}

    public static Object getInstance(Class clazz){
        if(!instanceMap.containsKey(clazz)){
            try {
                Object instance = clazz.newInstance();
                instanceMap.put(clazz,instance);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        return instanceMap.get(clazz);
    }

}
