package gupao.proxy.dbroute;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author peng.chen12@hand-china.com
 * @description
 * @date 2020/3/3
 */
public class Test {

    public static void main(String[] args) {
        try {
            Order order = new Order();
            SimpleDateFormat sdf=new SimpleDateFormat("yyyy/MM/dd");
            Date date=sdf.parse("2018/02/01");
            order.setCreateTime(date.getTime());

//            IOrderService orderService = new OrderServiceImpl();
//            IOrderService orderService = new OrderServiceStaticProxy(new OrderServiceImpl());
            IOrderService orderService = (IOrderService) new OrderServiceDynamicProxy().getInstance(new OrderServiceImpl());
            orderService.createOrder(order);
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
