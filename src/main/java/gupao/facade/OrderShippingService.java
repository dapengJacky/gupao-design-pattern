package gupao.facade;

/**
 * @author peng.chen12@hand-china.com
 * @description 物流
 * @date 2020/3/5
 */
public class OrderShippingService {

    public String shippingProd(GiftInfo info){
        System.out.println(info.getName()+"商品进入物流系统");
        return "666";//返回物流单号
    }
}
