package gupao.proxy.staticproxy;

/**
 * @author peng.chen12@hand-china.com
 * @description
 * @date 2020/3/2
 */
public class ZhangSanFather implements IPerson {

    private Zhangsan son;

    public ZhangSanFather(Zhangsan son){
        this.son = son;
    }

    public void findLove() {
        System.out.println("给儿子物色对象");
        son.findLove();
        System.out.println("牵手成功，开始交往");
    }
}
