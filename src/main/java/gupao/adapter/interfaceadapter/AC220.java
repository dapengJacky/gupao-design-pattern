package gupao.adapter.interfaceadapter;

/**
 * @author peng.chen12@hand-china.com
 * @description 家庭220V交流电
 * @date 2020/3/11
 */
public class AC220 {

    public int outputAC220V(){
        int output = 220;
        System.out.println("输出电压"+output+"V");
        return output;
    }
}
