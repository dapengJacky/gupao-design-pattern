package gupao.proxy.dbroute;

/**
 * @author peng.chen12@hand-china.com
 * @description
 * @date 2020/3/3
 */
public class OrderDao {

    public int createOrder(Order order) {
        System.out.println("OrderDao创建订单成功");
        return 1;
    }
}
