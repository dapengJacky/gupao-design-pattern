package gupao.proxy.dbroute;

/**
 * @author peng.chen12@hand-china.com
 * @description ThreadLocal单例
 * @date 2020/3/3
 */
public class DynamicDataSourceEntry {

    private final static String DB_SOURCE_DEFAULT = null;
    private final static ThreadLocal<String> local = new ThreadLocal<String>();

    private DynamicDataSourceEntry(){}

    //清空数据源
    public static void clear(){
        local.remove();
    }

    //还原当前切换的数据源
    public static void restore(){
        local.set(DB_SOURCE_DEFAULT);
    }

    //设置已知名字的数据源
    public static void set(String db){
        local.set(db);
    }

    //根据年份动态设置数据源
    public static void set(int year){
        local.set("DB_" + year);
    }

    public static String get(){
        return local.get();
    }
}
