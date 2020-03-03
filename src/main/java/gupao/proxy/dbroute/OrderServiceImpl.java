package gupao.proxy.dbroute;

/**
 * @author peng.chen12@hand-china.com
 * @description 静态代理实现数据库路由动态切换
 * @date 2020/3/3
 */
public class OrderServiceImpl implements IOrderService {

    private OrderDao orderDao;

    public OrderServiceImpl(){
        //spring中通过注解注入
        this.orderDao=new OrderDao();
    }

    public int createOrder(Order order) {
        System.out.println("OrderService调用OrderDao创建订单");
        return orderDao.createOrder(order);
    }
}
