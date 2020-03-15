package gupao.chain.auth.optimizer;

import gupao.chain.auth.Member;

/**
 * @author peng.chen12@hand-china.com
 * @description
 * @date 2020/3/15
 */
public abstract class Handler {

    protected Handler next;

    public void nextHandler(Handler next){
        this.next = next;
    }

    public abstract void doHandler(Member member);
}
