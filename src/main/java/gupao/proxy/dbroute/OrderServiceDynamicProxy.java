package gupao.proxy.dbroute;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author peng.chen12@hand-china.com
 * @description
 * @date 2020/3/3
 */
public class OrderServiceDynamicProxy implements InvocationHandler {

    private SimpleDateFormat yearFormat=new SimpleDateFormat("yyyy");
    private Object target;

    public Object getInstance(Object target){
        this.target = target;
        Class<?> clazz = target.getClass();
        return Proxy.newProxyInstance(clazz.getClassLoader(),clazz.getInterfaces(),this);
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before(args[0]);
        Object o = method.invoke(this.target, args);
        after();
        return o;
    }

    private void after() {
        System.out.println("Proxy after method");
    }

    private void before(Object target) {
        try{
            System.out.println("Proxy before method");
            Long time=(Long)target.getClass().getMethod("getCreateTime").invoke(target);
            Integer dbRouter=Integer.valueOf(yearFormat.format(new Date(time)));
            System.out.println("动态代理类自动分配到【DB_"+dbRouter+"】数据源处理数据");
            DynamicDataSourceEntry.set(dbRouter);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
