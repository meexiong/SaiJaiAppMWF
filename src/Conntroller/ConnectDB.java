
package Conntroller;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectDB {
    public static Connection getConection(){
        try {
            String url ="jdbc:sqlserver://DESKTOP-DAAEP0D\\SQLEXPRESS; databaseName=DBSaiJai";
            String user="sa";
            String pw = "123";
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection c =DriverManager.getConnection(url,user,pw);
            return c;
        } catch (Exception t) {
            t.printStackTrace();
        }
        return null;
    }
}
