package gupao.singleton.threadlocal;

/**
 * @author peng.chen12@hand-china.com
 * @description ThreadLocal单例
 * 优点：天生线程安全
 * 缺点：不能保证多线程中的线程安全，只能保证单线程
 * @date 2020/2/28
 */
public class ThreadLocalSingleton {

    private static final ThreadLocal<ThreadLocalSingleton> threadLocalInstance = new ThreadLocal<ThreadLocalSingleton>(){
        @Override
        protected ThreadLocalSingleton initialValue() {
            return new ThreadLocalSingleton();
        }
    };

    private ThreadLocalSingleton(){}

    public static ThreadLocalSingleton getInstance(){
        return threadLocalInstance.get();
    }

}
