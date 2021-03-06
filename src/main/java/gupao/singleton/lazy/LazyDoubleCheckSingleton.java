package gupao.singleton.lazy;

/**
 * @author peng.chen12@hand-china.com
 * @description 双重锁懒汉单例
 * @date 2020/2/28
 */
public class LazyDoubleCheckSingleton {

    private volatile static LazyDoubleCheckSingleton instance;//volatile是解决CPU指令重排序的问题

    private LazyDoubleCheckSingleton(){
        //代码不够优雅
        if(instance !=null){
            throw new RuntimeException("不能创建多个实例");
        }
    }

    /**
     * 解决了线程安全问题，但是代码不优雅
     * 存在被反射和序列化攻击的问题
     * @return
     */
    public static LazyDoubleCheckSingleton getInstance(){
        //第一次校验是否已经实例化，减缓线程阻塞压力
        if(instance==null){
            synchronized (LazySingleton.class){
                //第二次校验防止被多次实例化替换，浪费资源
                if (instance==null){
                    instance = new LazyDoubleCheckSingleton();
                    //1.分配内存给这个对象
                    //2.初始化对象
                    //3.设置 lazy 指向刚分配的内存地址
                }
            }
        }
        return instance;
    }

}
