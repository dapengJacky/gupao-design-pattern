package gupao.proxy.dynamicproxy.cglibproxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author peng.chen12@hand-china.com
 * @description 继承关系，代理类无需实现同一接口
 * @date 2020/3/2
 */
public class CglibMeipo implements MethodInterceptor {


    public Object getProxyInstance(Class clazz){
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(clazz);
        enhancer.setCallback(this);
        return enhancer.create();
    }

    private void after() {
        System.out.println("确立关系，开始交往");

    }

    private void before() {
        System.out.println("我是媒婆，开始物色对象");
    }

    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        before();
        Object result = methodProxy.invokeSuper(o, objects);
        after();
        return result;
    }
}
