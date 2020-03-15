package gupao.singleton.register;

/**
 * @author peng.chen12@hand-china.com
 * @description enum继承于Enum
 *
 * 优点：底层杜绝了反射破坏单例;代码优雅
 * 缺点：创建大量对象，浪费资源
 * @date 2020/2/28
 */
public enum  EnumSingleton {

    INSTANCE;//Enum类中会将INSTANCE放在map中

    private Object data;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public static EnumSingleton getInstance(){
        return INSTANCE;
    }
}
