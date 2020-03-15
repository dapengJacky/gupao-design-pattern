package gupao.chain.general;

/**
 * @author peng.chen12@hand-china.com
 * @description
 * @date 2020/3/15
 */
public class Test {

    public static void main(String[] args) {
        Handler handlerA = new ConcreteHanlderA();
        Handler handlerB = new ConcreteHanlderB();

        handlerA.next(handlerB);
        handlerA.dealRequest("requestA");
    }
}
