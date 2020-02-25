package gupao.factory.example;


/**
 * @author peng.chen12@hand-china.com
 * @description
 * @date 2020/2/24
 */
public class UnionPayFactory extends DomesticPayFactory {

    @Override
    public void pay() {
        System.out.println("调用银联支付接口实现");
    }

}
