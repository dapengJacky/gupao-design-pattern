package gupao.adapter.objectadapter;

/**
 * @author peng.chen12@hand-china.com
 * @description
 * @date 2020/3/11
 */
public class PowerAdapter  implements DC5 {

    private AC220 ac220;

    public PowerAdapter(AC220 input){
        this.ac220=input;
    }

    @Override
    public int output5V() {
        int input = ac220.outputAC220V();
        int adapterOutput = input/44;
        System.out.println("使用适配器输入交流电电压"+input+"V,输入直流电电压"+adapterOutput+"V");
        return adapterOutput;
    }
}
