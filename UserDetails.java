package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class UserDetails {

	String id;
	String name, emailid, password, contact, address;
	String role;
	boolean status;
	Connection con;
	private Connection createConnection() throws ClassNotFoundException, SQLException{
		
		Class.forName("org.h2.Driver");
		 con = DriverManager.getConnection("jdbc:h2:tcp://localhost/~/Eswark", "sa", "");
		return con;
	}
	public void  showDetails() throws ClassNotFoundException, SQLException{
		createConnection();
		Statement st= con.createStatement();
		ResultSet rs = st.executeQuery("SELECT * FROM USERDETAILS ");
		while(rs.next()){
			System.out.println( "Id : "+rs.getString(1)+"  Name :"+rs.getString(6)+" password: "+rs.getString(7)+" Email: "+rs.getString(4)+" Phone:"+rs.getString(3)+" Address:"+rs.getString(2)+" Enable:"+rs.getBoolean(5)+" Role:"+rs.getString(8));
		}
		
	}
	public void storeData() throws SQLException, ClassNotFoundException{
		createConnection();
		PreparedStatement ps= con.prepareStatement("Insert into UserDetails values (?,?,?,?,?,?,?,?)");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter User id ");
		id=sc.next();
		System.out.println("Enter User Name");
		name=sc.next();
		System.out.println("Password");
		password =sc.next();
		System.out.println("Email:");
		emailid=sc.next();
		System.out.println("Phone Number");
		contact = sc.next();
		System.out.println("Address");
		address =sc.next();
		System.out.println("Enter Role");
		role= sc.next();
       boolean enable = true;
       ps.setString(1, id);
       ps.setString(2, address);
       ps.setString(3, contact);
       ps.setString(4, emailid);
       ps.setBoolean(5, enable);
       ps.setString(6, name);
       ps.setString(7, password);
       ps.setString(8, role);
       
		int x = ps.executeUpdate();
		if (x>0){
			System.out.println("Inserted into Table");
		}
		else{
			System.out.println(" Not Inserted into Table");
		}
		
		
	}
	public void deleteData() throws ClassNotFoundException, SQLException{
		createConnection();
		PreparedStatement ps= con.prepareStatement("Delete from UserDetails  where id=?");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter User id ");
		 String id=sc.next();
		
		ps.setString(1, id);
		int x= ps.executeUpdate();
		if (x>0){
			System.out.println("Deleted");
		}
		else{
			System.out.println(" not Deleted");
		}
	}

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		UserDetails u1= new UserDetails();
		u1.deleteData();
		//u1.storeData();
		u1.showDetails();

	}

}
