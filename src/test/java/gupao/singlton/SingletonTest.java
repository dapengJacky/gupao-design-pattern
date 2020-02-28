package gupao.singlton;


/**
 * @author peng.chen12@hand-china.com
 * @description
 * @date 2020/2/27
 */
public class SingletonTest {

    public static void main(String[] args) {
        Thread thread1=new Thread(new ExecutorThread());
        Thread thread2=new Thread(new ExecutorThread());

        thread1.start();
        thread2.start();

        System.out.println("End");
    }
}
