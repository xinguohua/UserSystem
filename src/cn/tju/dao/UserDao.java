package cn.tju.dao;

import cn.tju.entity.User;

import java.sql.*;
import java.util.ArrayList;

public class UserDao {

    String URL = "jdbc:mysql://localhost:3306/commandsystem";
    String USERNAME = "root";
    String PWD = "xgh961120";

    public ArrayList<User> queryAll() throws SQLException {
        Connection connection = null;
        Statement stmt = null;
        ResultSet rs = null;
        ArrayList<User> UserList = new ArrayList<>();
        // a.导入驱动，加载具体的驱动类
        try {
            Class.forName("com.mysql.jdbc.Driver");// 加载具体的驱动类
            // b.与数据库建立连接
            connection = DriverManager.getConnection(URL, USERNAME, PWD);
            // c.发送sql，执行查询全部
            String sql = "select * from users";
            stmt = connection.prepareStatement(sql);
            ///返回值是ResultSet
            rs = stmt.executeQuery(sql);
            while (rs.next()) {
                int userno = rs.getInt(1);
                String username = rs.getString(2);
                String password = rs.getString(3);
                String dept = rs.getString(4);
                String phone = rs.getString(5);
                String email = rs.getString(6);

                User user = new User(userno,username,password, dept,phone,email);
                UserList.add(user);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            //打开顺序，与关闭顺序相反
            if (rs != null)
                rs.close();
            if (stmt != null)
                stmt.close();
            if (connection != null)
                connection.close();
            return UserList;
        }
    }

    //根据学号 查询学生
    public User queryUserByUno(int uno) {//3
        User user = null;
        Connection connection = null ;
        PreparedStatement pstmt = null ;
        ResultSet rs = null ;
        try {
            Class.forName("com.mysql.jdbc.Driver") ;
            connection = DriverManager.getConnection( URL,USERNAME,PWD ) ;
            String sql = "select * from users where userno=? " ;
            pstmt = connection.prepareStatement( sql) ;
            pstmt.setInt(1, uno);
            rs = pstmt.executeQuery() ;
            if(rs.next()) {
                int userno =   rs.getInt("userno") ;
                String username =   rs.getString("username") ;
                String password =   rs.getString("password") ;
                String dept =   rs.getString("dept") ;
                String phone =   rs.getString("phone") ;
                String email =   rs.getString("email") ;

                user = new User(userno,username,password,dept,phone,email);
            }
            return user ;
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            return null ;
        } catch (SQLException e) {
            e.printStackTrace();
            return null ;
        }catch (Exception e) {
            e.printStackTrace();
            return null ;
        }
        finally {
            try {
                if(rs!=null)rs.close();
                if(pstmt!=null)pstmt.close();
                if(connection!=null)connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public boolean isExist(int uno) {//true:此人存在  false:不存在
        return queryUserByUno(uno)==null? false:true  ;
    }

    public void insert(User user) {// 增删改
        int userno=user.getUserno();
        String username=user.getUsername();
        String password=user.getPassword();
        String dept=user.getDept();
        String phone=user.getPhone();
        String email=user.getEmail();
        Connection connection = null;
        PreparedStatement  pstmt = null;
        try {
            // a.导入驱动，加载具体的驱动类
            Class.forName("com.mysql.jdbc.Driver");// 加载具体的驱动类
            // b.与数据库建立连接
            connection = DriverManager.getConnection(URL, USERNAME, PWD);
            //PreparedStatement
            String sql = "insert into users values(?,?,?,?,?,?)";
            pstmt = connection.prepareStatement(sql);//预编译
            pstmt.setInt(1, userno);
            pstmt.setString(2, username);
            pstmt.setString(3, password);
            pstmt.setString(4, dept);
            pstmt.setString(5,phone);
            pstmt.setString(6, email);

            int count =pstmt.executeUpdate() ;

            // d.处理结果
            if (count > 0) {
                System.out.println("操作成功！");
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch(Exception e) {
            e.printStackTrace();
        }
        finally {
            try {
                if(pstmt!=null) pstmt.close();// 对象.方法
                if(connection!=null)connection.close();
            }catch(SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public void delete(int userno) {// 增删改
        Connection connection = null;
        PreparedStatement  pstmt = null;
        try {
            // a.导入驱动，加载具体的驱动类
            Class.forName("com.mysql.jdbc.Driver");// 加载具体的驱动类
            // b.与数据库建立连接
            connection = DriverManager.getConnection(URL, USERNAME, PWD);
            //PreparedStatement
            String sql = "delete from users where userno=?";;
            pstmt = connection.prepareStatement(sql);//预编译
            pstmt.setInt(1, userno);


            int count =pstmt.executeUpdate() ;

            // d.处理结果
            if (count > 0) {
                System.out.println("操作成功！");
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch(Exception e) {
            e.printStackTrace();
        }
        finally {
            try {
                if(pstmt!=null) pstmt.close();// 对象.方法
                if(connection!=null)connection.close();
            }catch(SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public void update(int userno,User user) {// 增删改
        String username=user.getUsername();
        String password=user.getPassword();
        String dept=user.getDept();
        String phone=user.getPhone();
        String email=user.getEmail();

        Connection connection = null;
        PreparedStatement  pstmt = null;
        try {
            // a.导入驱动，加载具体的驱动类
            Class.forName("com.mysql.jdbc.Driver");// 加载具体的驱动类
            // b.与数据库建立连接
            connection = DriverManager.getConnection(URL, USERNAME, PWD);
            //PreparedStatement
            String sql = "update users set username=?,password=?,dept=?,phone=?,email=? where userno=?";
            pstmt = connection.prepareStatement(sql);//预编译

            pstmt.setString(1, username);
            pstmt.setString(2, password);
            pstmt.setString(3, dept);
            pstmt.setString(4,phone);
            pstmt.setString(5, email);
            pstmt.setInt(6, userno);

            int count =pstmt.executeUpdate() ;

            // d.处理结果
            if (count > 0) {
                System.out.println("操作成功！");
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch(Exception e) {
            e.printStackTrace();
        }
        finally {
            try {
                if(pstmt!=null) pstmt.close();// 对象.方法
                if(connection!=null)connection.close();
            }catch(SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) throws SQLException {
//        User user=new User(55,"bc","b","b","b","b@qq.com");
//        new UserDao().update(55,user);
//        System.out.println(user);
        boolean exist = new UserDao().isExist(100);
        System.out.println(exist);
    }

}

