package gupao.facade;

/**
 * @author peng.chen12@hand-china.com
 * @description
 * @date 2020/3/5
 */
public class Test {

    public static void main(String[] args) {
        GiftInfo info = new GiftInfo();
//        info.setInv(0);
//        info.setScore(11);
        OrderLogistic logistic = new OrderLogistic();
        OrderPay pay = new OrderPay();
        OrderQualify qualify = new OrderQualify();

        if(qualify.qualifyScoreAndInv(info)){
            if(pay.pay(info)){
                String num=logistic.shippingProd(info);
                System.out.println("物流订单号:"+num);
            }
        }

    }
}
