package univque;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class movie_har {

	public static Connection connect() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/question";
		String username = "root";
		String password = "root";
		Connection con = DriverManager.getConnection(url, username, password);
		System.out.println(con);
		return (con);
	}

	}


