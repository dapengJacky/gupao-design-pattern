package gupao.chain.general;

/**
 * @author peng.chen12@hand-china.com
 * @description
 * @date 2020/3/15
 */
public abstract class Handler {

    protected Handler nextHandler;

    public void next(Handler nextHandler){
        this.nextHandler = nextHandler;
    }
    protected abstract void dealRequest(String request);
}
