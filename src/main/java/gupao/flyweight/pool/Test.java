package gupao.flyweight.pool;

import java.sql.Connection;

/**
 * @author peng.chen12@hand-china.com
 * @description
 * @date 2020/3/8
 */
public class Test {


    public static void main(String[] args) {
        ConnectionPool pool = new ConnectionPool();
        System.out.println("刚创建时---连接池剩余连接数量"+pool.getPool().size());
        Connection connection = pool.getConnection();
        Connection connection2 = pool.getConnection();
        System.out.println(connection);
        System.out.println(connection2);
        System.out.println("获取后---连接池剩余连接数量"+pool.getPool().size());
        pool.release(connection);
        System.out.println("释放后---连接池剩余连接数量"+pool.getPool().size());

    }
}
