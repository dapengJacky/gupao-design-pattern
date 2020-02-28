package gupao.singlton;

import gupao.singleton.lazy.LazyDoubleCheckSingleton;
import gupao.singleton.lazy.LazySingleton;
import gupao.singleton.lazy.LazyStaticInnerClassSingleton;
import gupao.singleton.register.EnumSingleton;

import java.lang.reflect.Constructor;

/**
 * @author peng.chen12@hand-china.com
 * @description 反射破坏单例测试
 * @date 2020/2/28
 */
public class ReflectDestroyTest {

    public static void main(String[] args) {
        try {
            //饿汉单例破坏
//            Class<LazySingleton> clazz = LazySingleton.class;
//            Constructor<LazySingleton> constructor = clazz.getDeclaredConstructor();
//            //强吻
//            constructor.setAccessible(true);
//            LazySingleton instance1=constructor.newInstance();
//            LazySingleton instance2 = LazySingleton.getInstance();//false

            //懒汉单例破坏
//            Constructor<LazyDoubleCheckSingleton> constructor = LazyDoubleCheckSingleton.class.getDeclaredConstructor();
//            //强吻
//            constructor.setAccessible(true);
//            LazyDoubleCheckSingleton instance2 = LazyDoubleCheckSingleton.getInstance();
//            LazyDoubleCheckSingleton instance1 = constructor.newInstance();
//            System.out.println(instance1==instance2);

//            Constructor<LazyStaticInnerClassSingleton> constructor = LazyStaticInnerClassSingleton.class.getDeclaredConstructor();
//            //强吻
//            constructor.setAccessible(true);
//            LazyStaticInnerClassSingleton instance1 = constructor.newInstance();
//            LazyStaticInnerClassSingleton instance2 = LazyStaticInnerClassSingleton.getInstance();
//            System.out.println(instance1==instance2);

            //枚举类单例破坏
            Constructor<EnumSingleton> constructor = EnumSingleton.class.getDeclaredConstructor(String.class,int.class);
            constructor.setAccessible(true);//强吻
            EnumSingleton instance1=constructor.newInstance("jacky,",666);
            Object instance2 = EnumSingleton.getInstance();
            System.out.println(instance1==instance2);

        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
