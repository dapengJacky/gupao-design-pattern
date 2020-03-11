package gupao.adapter.interfaceadapter;


/**
 * @author peng.chen12@hand-china.com
 * @description
 * @date 2020/3/11
 */
public class Test {

    public static void main(String[] args) {
        PowerAdapter adapter =new PowerAdapter(new AC220());
        adapter.output5V();
        adapter.output10V();
    }
}
