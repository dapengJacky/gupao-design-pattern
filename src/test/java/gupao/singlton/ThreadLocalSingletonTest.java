package gupao.singlton;

/**
 * @author peng.chen12@hand-china.com
 * @description 测试线程安全
 * @date 2020/2/28
 */
public class ThreadLocalSingletonTest {

    public static void main(String[] args) {

        Thread t1 = new Thread(new ExecutorThread());
        Thread t2 = new Thread(new ExecutorThread());
        Thread t3 = new Thread(new ExecutorThread());

        t1.start();
        t2.start();
        t3.start();
        System.out.println("ThreadLocal Test");
    }
}
