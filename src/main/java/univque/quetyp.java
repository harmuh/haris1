package univque;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class quetyp {
	public static void qutp() throws SQLException , ClassNotFoundException{
		Connection con = movie_har.connect();
	     String sql = "select ID ,QUES_TYPE ,IS_ACTIVE FROM QUES_TYPE";
	     PreparedStatement pst = con.prepareStatement(sql);
	     ResultSet rs = pst.executeQuery();
	     while(rs.next()){
	    		int id = rs.getInt("ID");
	            String qt = rs.getString("QUES_TYPE");
              int isact = rs.getInt("IS_ACTIVE");
              System.out.println("ID " + id + " Questiontype " + qt + " Isactive " +  isact);
                   
	}

}
}
