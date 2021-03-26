import java.sql.*;
import java.util.Scanner;  

class App{  
public static void main(String args[]){ 
	Scanner sc = new Scanner(System.in);
try{  
Class.forName("com.mysql.cj.jdbc.Driver");

System.out.println(" Enter User ID");
String id = sc.nextLine();

System.out.println( Enter User PASSWORD");
String password = sc.nextLine();

Connection con=DriverManager.getConnection(  
"jdbc:mysql://localhost:3306/first",id, password);  
 System.out.println("Connected with DataBase");


//stmt.execute("create table enployee(employeeid int(3), employeename varchar(10))");  // table is already created once
System.out.println("Table is created");

 
 PreparedStatement stmt=con.prepareStatement("insert into employee values(?,?)"); 
while(true)
{
	 System.out.println("Choose Your Option\n1.Insert into table\n2.Update table\n3.Delete row\n4.Read Table\n5.Exit ");
	 int n1 = sc.nextInt(); 
     if(n1 == 1 || n1 == 2 || n1 == 3 || n1 == 4)
     {
    	 
		switch(n1)
		{  
			case 1:
				System.out.println(" Enter employee ID");
				int ID = sc.nextInt();
				System.out.println(" Enter employee Name");
				String Name = sc.next();	
				stmt.setInt(1, ID);
				stmt.setString(2,Name);
				stmt.executeUpdate();
				System.out.println("Data inserted into table");
				break;
			
			case 2:
				System.out.println(" Enter employee ID");
				int ID1 = sc.nextInt();
				System.out.println(" Enter employee Name");
				String Name1 = sc.next();
				
				String update = "UPDATE employee SET employeename="+"'"+ Name1 +"'"+ " WHERE employeeid="+ ID1;
				System.out.println(update);
				stmt.executeUpdate(update);
				System.out.println("Data Updated");
				break;
				
			case 3:
				System.out.println(" Enter employee ID");
				int ID11 = sc.nextInt();
				String delete = "DELETE FROM employee " +"WHERE employeeid =" + ID11;
				stmt.executeUpdate(delete);
				System.out.println("Data Deleted");
				break;
				
			case 4:
				ResultSet rs=stmt.executeQuery("select * from employee");  
				while(rs.next())  
				System.out.println(rs.getInt(1)+"  "+rs.getString(2));  
				break;
		}
}
     else
     {
    	 break;
     }
}
}catch(Exception e){ System.out.println(e);}  
}  
}