package gupao.chain.general;

/**
 * @author peng.chen12@hand-china.com
 * @description
 * @date 2020/3/15
 */
public class ConcreteHanlderB extends Handler {
    @Override
    protected void dealRequest(String request) {
        if("requestB".equals(request)){
            System.out.println(getClass().getSimpleName()+" deal with request "+request);
        }
        if(this.nextHandler!=null){
            this.nextHandler.dealRequest(request);
        }
    }
}
