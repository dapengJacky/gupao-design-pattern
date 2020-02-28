package gupao.singleton.lazy;

/**
 * @author peng.chen12@hand-china.com
 * @description 静态内部类
 * @date 2020/2/28
 */
public class LazyStaticInnerClassSingleton {

    private LazyStaticInnerClassSingleton(){
        //代码不够优雅
        if(LazyHolder.LAZY !=null){
            throw new RuntimeException("不能创建多个实例");
        }
    }

    public static final LazyStaticInnerClassSingleton getInstance(){
        return LazyHolder.LAZY;
    }
    //LazyStaticInnerClassSingleton类加载的时候不会加载LazyHolder
    //LazyStaticInnerClassSingleton@LazyHolder
    private static class LazyHolder{
        private static final LazyStaticInnerClassSingleton LAZY = new LazyStaticInnerClassSingleton();
    }
}
