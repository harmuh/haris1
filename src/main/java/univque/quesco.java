package univque;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Resultset;

public class quesco {
	public static void quesc() throws SQLException , ClassNotFoundException {
		Connection con = movie_har.connect();
		String sql = "INSERT INTO QUETXSC(ID,QUES_TXT,QT_ID,QUES_SCORE) VALUES(3,'CHIEF MINISTER OF TAMILNADU___ ',2,1)";
		PreparedStatement pst = con.prepareStatement(sql);
		int rows = pst.executeUpdate();
		ResultSet rs = pst.executeQuery();
		while(rs.next())
		{
			int id = rs.getInt("ID");
			String qutx = rs.getString("QUES_TXT");
			int qid = rs.getInt("QT_ID");
			int qusc = rs.getInt("QUES_SCORE");
		}
	}
		
}
		
	


