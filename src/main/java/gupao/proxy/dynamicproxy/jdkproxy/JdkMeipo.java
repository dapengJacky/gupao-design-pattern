package gupao.proxy.dynamicproxy.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author peng.chen12@hand-china.com
 * @description
 * @date 2020/3/2
 */
public class JdkMeipo implements InvocationHandler {

    private IPerson target;

    public IPerson getProxyInstance(IPerson target){
        this.target = target;
        Class clazz = target.getClass();
        return (IPerson) Proxy.newProxyInstance(clazz.getClassLoader(),clazz.getInterfaces(),this);
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        Object result = method.invoke(this.target, args);
        after();
        return result;
    }

    private void after() {
        System.out.println("确立关系，开始交往");

    }

    private void before() {
        System.out.println("我是媒婆，开始物色对象");
    }
}
