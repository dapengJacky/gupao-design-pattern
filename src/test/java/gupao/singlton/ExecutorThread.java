package gupao.singlton;

import gupao.singleton.hungry.HungrySingleton;
import gupao.singleton.lazy.LazyDoubleCheckSingleton;
import gupao.singleton.lazy.LazySingleton;
import gupao.singleton.lazy.LazyStaticInnerClassSingleton;
import gupao.singleton.threadlocal.ThreadLocalSingleton;

/**
 * @author peng.chen12@hand-china.com
 * @description
 * @date 2020/2/27
 */
public class ExecutorThread implements Runnable {

    public void run() {
//        HungrySingleton instance = HungrySingleton.getInstance();
//        LazySingleton instance=LazySingleton.getInstance();
//        LazyDoubleCheckSingleton instance=LazyDoubleCheckSingleton.getInstance();
//        LazyStaticInnerClassSingleton instance=LazyStaticInnerClassSingleton.getInstance();

        ThreadLocalSingleton instance1= ThreadLocalSingleton.getInstance();
        ThreadLocalSingleton instance2= ThreadLocalSingleton.getInstance();
        ThreadLocalSingleton instance3= ThreadLocalSingleton.getInstance();
        ThreadLocalSingleton instance4= ThreadLocalSingleton.getInstance();
        System.out.println(Thread.currentThread().getName()+":"+instance1);
        System.out.println(Thread.currentThread().getName()+":"+instance2);
        System.out.println(Thread.currentThread().getName()+":"+instance3);
        System.out.println(Thread.currentThread().getName()+":"+instance4);
    }
}
