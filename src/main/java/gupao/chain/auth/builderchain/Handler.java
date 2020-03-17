package gupao.chain.auth.builderchain;

import gupao.chain.auth.Member;

/**
 * @author peng.chen12@hand-china.com
 * @description
 * @date 2020/3/15
 */
public abstract class Handler<T> {

    protected Handler next;

    private void nextHandler(Handler next){
        this.next = next;
    }

    public abstract void doHandler(Member member);

    public static class Builder<T>{
        private Handler<T> head;
        private Handler<T> tail;

        public Builder<T> addHandler(Handler<T> next){
            if(head==null){
                this.head = this.tail=next;
                return this;
            }
            this.tail.nextHandler(next);
            this.tail = next;
            return this;
        }

        public Handler<T> build(){
            return this.head;
        }

    }

}
