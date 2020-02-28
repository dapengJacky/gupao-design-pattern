package gupao.singleton.lazy;

/**
 * @author peng.chen12@hand-china.com
 * @description
 * @date 2020/2/27
 */
public class LazySingleton {

    private static LazySingleton instance;
    private LazySingleton(){}

    /**
     * 存在线程安全问题
     * 使用类的时候才实例化，防止内存资源浪费
     * @return
     */
    public static LazySingleton getInstance(){
        if(instance==null){
            instance=new LazySingleton();
        }
        return instance;
    }

}
