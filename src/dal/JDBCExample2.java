package dal;
import java.util.Scanner;
import java.sql.*;
public class JDBCExample2 {
   private int rno;
   private String sname;
   private String branch;
   private int fees;
   static Statement st;
   static Connection conn;
   public static void connect() throws ClassNotFoundException,SQLException
   {
	   Class.forName("com.mysql.jdbc.Driver");
	   conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/schooldb","root","");
	   st = conn.createStatement();
   }
   
   public static int insert(int rno,String sname,String branch, int fees) throws SQLException
   {
	   int res=st.executeUpdate("insert into tbl_student(rno,sname,branch,fees) values('"+rno+"','"+sname+"','"+branch+"','"+fees+"')");
       return res;
       
   
   }
   public static int update(int rno,String sname,String branch, int fees) throws SQLException
   {
	   int res=st.executeUpdate("update tbl_student set sname='"+sname+"',branch='"+branch+"',fees='"+fees+"' where rno='"+rno+"'");
       return res;
   
   
   }
   
   
   public static int delete(int rno) throws SQLException
   {
	   int res=st.executeUpdate("delete from tbl_student where rno='"+rno+"'");
       return res;
   
   
   }
   
   public static 	ResultSet showdata() throws SQLException
   {	
	   ResultSet res = st.executeQuery("select * from tbl_student");
	   return res;
   }
   
   public static ResultSet login(String username,String pass) throws SQLException
   {	
	   ResultSet res = st.executeQuery("select * from tbl_admin where userid='"+username+"' and password='"+pass+"'");
	   return res;
   }
   
   public static ResultSet findData(int r) throws SQLException
   {
	   ResultSet res = st.executeQuery("select * from tbl_student where rno='"+r+"'");
	   return res;
   }
   public static void closeConn()  throws Exception
   {
	   conn.close();
   }
  
   
}
