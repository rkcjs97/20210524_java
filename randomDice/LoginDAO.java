package randomDice;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;

import ex07_jdbc.DBConn;

public class LoginDAO {
	
	public void join(LoginDTO ldto) {
		
		//회원가입
		Connection conn = DBConn.getConn();
		PreparedStatement pstmt = null;
		
		String sql = "INSERT INTO LOGIN VALUES(?,?) ";
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, ldto.getId());
			pstmt.setString(2, ldto.getPw());
			pstmt.executeUpdate();
			System.out.println("Join Completed");
		}catch(SQLIntegrityConstraintViolationException e){
			System.out.println("Duplicate ID");
			System.out.println("Join Failed");
		}catch (SQLException e) {
			// TODO 자동 생성된 catch 블록
			e.printStackTrace();
		
		}finally {
			try {
				if(pstmt != null) pstmt.close();
				if(pstmt != null) conn.close();
			
			} catch (SQLException e) {
				// TODO 자동 생성된 catch 블록
				e.printStackTrace();
			}
			
		}
		
		
	}
	LoginDTO login(String id) {
		LoginDTO ldto = null;
		Connection conn = DBConn.getConn();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "SELECT *\r\n " + 
				"FROM LOGIN\r\n " + 
				"WHERE ID = ? ";
		
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				String pw = rs.getString("pw");
				ldto = new LoginDTO(id,pw);
			}
		
		} catch (SQLException e) {
			// TODO 자동 생성된 catch 블록
			e.printStackTrace();
		}finally {
			try {
				if(rs != null)rs.close();
				if(pstmt != null)pstmt.close();
				if(conn != null)conn.close();
			} catch (SQLException e) {
				// TODO 자동 생성된 catch 블록
				e.printStackTrace();
			}
		}
		
		
		
		return ldto;
	}
		

}
