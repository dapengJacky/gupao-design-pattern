package gupao.flyweight.pool;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Vector;

/**
 * @author peng.chen12@hand-china.com
 * @description
 * @date 2020/3/8
 */
public class ConnectionPool {

    private Vector<Connection> pool;
    private String url = "jdbc:mysql://localhost:3306/srm";
    private String username = "root";
    private String password = "root";
    private String driverClass = "com.mysql.jdbc.Driver";
    private static int poolSize = 100;

    public Vector<Connection> getPool() {
        return pool;
    }

    public void setPool(Vector<Connection> pool) {
        this.pool = pool;
    }

    public ConnectionPool(){
        pool = new Vector<Connection>(poolSize);

        try {
            Class.forName(driverClass);
            for (int i=0;i<poolSize;i++){
                Connection conn = DriverManager.getConnection(url, username, password);
                pool.add(conn);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public synchronized Connection getConnection(){
        if(pool.size()>0){
            Connection conn = pool.get(0);
            pool.remove(conn);
            return conn;
        }
        return null;
    }

    public synchronized void release(Connection connection){
        pool.add(connection);
    }
}
