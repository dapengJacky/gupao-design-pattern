package gupao.composite.homework;

/**
 * @author peng.chen12@hand-china.com
 * @description
 * @date 2020/3/8
 */
public class Leaf extends Tree {

    public Leaf(String name) {
        super(name);
    }

    @Override
    public void show() {
        System.out.println(this.name);
    }
}
