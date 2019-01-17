package lk.ijsc.dep.court.dao;

import lk.ijsc.dep.court.db.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class CrudUtil {
    public static PreparedStatement getPreparedStatment(String sql,Object... params) throws Exception{
        Connection connection = DBConnection.getInstance().getConnection();
        PreparedStatement pstm = connection.prepareStatement(sql);
        for (int i = 0; i <params.length ; i++) {
            pstm.setObject(i+1,params[i]);
        }
        return pstm;
    }

   public static boolean executeUpdate(String sql,Object...parms)throws Exception
   {
        return getPreparedStatment(sql,parms).executeUpdate()> 0;
   }

   public static ResultSet executeQuery(String sql, Object...params) throws Exception
   {
        return getPreparedStatment(sql, params).executeQuery();
   }
}
