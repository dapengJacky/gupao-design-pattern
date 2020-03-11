package gupao.adapter.classadapter;

/**
 * @author peng.chen12@hand-china.com
 * @description
 * @date 2020/3/11
 */
public class PowerAdapter extends AC220 implements DC5{

    @Override
    public int output5V() {
        int input = super.outputAC220V();
        int adapterOutput = input/44;
        System.out.println("使用适配器输入交流电电压"+input+"V,输入直流电电压"+adapterOutput+"V");
        return adapterOutput;
    }
}
