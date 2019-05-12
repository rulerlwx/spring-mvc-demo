package com.demo;

import org.junit.Test;

import java.sql.*;

/**
 * Created by lwx on 2019/5/11.
 */
public class JdbcTest {
    @Test
    public void testJdbc(){
        String driver="com.mysql.jdbc.Driver";   //获取mysql数据库的驱动类
        String url="jdbc:mysql://localhost:3306/test"; //连接数据库（kucun是数据库名）
        String name="root";//连接mysql的用户名
        String pwd="root";//连接mysql的密码
        try{
            Class.forName(driver);
            Connection conn= DriverManager.getConnection(url,name,pwd);//获取连接对象
            Statement statement = conn.createStatement();
            String sql = "select * from user";
            ResultSet rs = statement.executeQuery(sql);
            while(rs.next()) {
                System.out.println(rs.getString("id")+"");
            }
            conn.close();

        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
