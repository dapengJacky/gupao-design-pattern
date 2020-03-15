package gupao.delegate.simple;

/**
 * @author peng.chen12@hand-china.com
 * @description
 * @date 2020/3/15
 */
public class Boss {

    public void command(String task,Leader leader){
        leader.doing(task);
    }
}
