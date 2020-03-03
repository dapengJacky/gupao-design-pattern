package gupao.proxy.dbroute.proxy;

import gupao.proxy.dbroute.db.DynamicDataSourceEntry;
import gupao.proxy.dbroute.IOrderService;
import gupao.proxy.dbroute.Order;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author peng.chen12@hand-china.com
 * @description
 * @date 2020/3/3
 */
public class OrderServiceStaticProxy implements IOrderService {

    private IOrderService orderService;

    private SimpleDateFormat sdf = new SimpleDateFormat("yyyy");

    public OrderServiceStaticProxy(IOrderService orderService){
        this.orderService = orderService;
    }
    public int createOrder(Order order) {
        before();
        Long time = order.getCreateTime();
        Integer dbRouter = Integer.valueOf(sdf.format(new Date(time)));
        System.out.println("静态代理类自动分配到【DB_"+dbRouter+"】"+"数据源处理数据");
        DynamicDataSourceEntry.set(dbRouter);
//        System.out.println(DynamicDataSourceEntry.get());
        orderService.createOrder(order);
        DynamicDataSourceEntry.restore();
//        System.out.println(DynamicDataSourceEntry.get());
        after();
        return 0;
    }

    private void after() {
        System.out.println("Proxy after method");
    }

    private void before() {
        System.out.println("Proxy before method");
    }
}
