package gupao.factory.example;

/**
 * @author peng.chen12@hand-china.com
 * @description
 * @date 2020/2/24
 */
public class PaySceneTest {

    public static void main(String[] args) {
        DomesticPayFactory factory = new AliPayFactory();
        factory.pay();

        CrossBorderPayFactory crossBorderPayFactory = new ApplePayFactory();
        crossBorderPayFactory.pay();
    }
}
