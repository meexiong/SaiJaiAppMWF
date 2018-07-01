
package Conntroller;

import java.sql.Connection;
import java.sql.ResultSet;
import org.bytedeco.javacpp.opencv_ml;

public class GetMaxID {
    String MaxID;
    String id;
    String sql;
    public String autoMaxID(String table,String colID,String front){
        try {
            Connection c = ConnectDB.getConection();
            String query ="Select * from "+table+"";
            ResultSet rs1=c.createStatement().executeQuery(query);
            if(rs1.next()){
                sql="Select '"+front+"'+CONVERT(nchar(5),isnull(Max(SubString("+colID+",2,5)),0)+1) as AutoID from "+table+"";
                ResultSet rs=c.createStatement().executeQuery(sql);
                if(rs.next()){
                    MaxID=rs.getString("AutoID");
                }
                rs.close();
            }else{
                sql="Select '"+front+"'+CONVERT(nchar(5),isnull(Max(SubString("+colID+",2,5)),0)+1001) as AutoID from "+table+"";
                ResultSet rs=c.createStatement().executeQuery(sql);
                if(rs.next()){
                    MaxID=rs.getString("AutoID");
                }
                rs.close();
            }
            rs1.close();
            c.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return MaxID;
    }
    public static void main(String[] args) {
        GetMaxID g = new GetMaxID();
        System.out.println(g.autoMaxID("Tbl_Employees", "EmpID", "E"));
    }
}
