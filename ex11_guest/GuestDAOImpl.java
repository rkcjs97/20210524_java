package ex11_guest;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import ex07_jdbc.DBConn;

public class GuestDAOImpl implements GuestDAO{

	@Override
	public int insert(GuestDTO gdto) {
		// 추가
		int cnt = 0;
		Connection conn = DBConn.getConn();
		PreparedStatement pstmt = null;
		String sql = "INSERT INTO GUEST(SEQ,NAME,EMAIL,PASSWD,CONTENT)\r\n " + 
				"VALUES(GUEST_SEQ.NEXTVAL,?,?,?,?) ";
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1,gdto.getName());
			pstmt.setString(2, gdto.getEmail());
			pstmt.setString(3,gdto.getPasswd());
			pstmt.setString(4,gdto.getContent());
			cnt = pstmt.executeUpdate();
			System.out.println(cnt + "건 추가");
		} catch (SQLException e) {
			// TODO 자동 생성된 catch 블록
			e.printStackTrace();
		}finally {
			try {
				if (pstmt!=null)pstmt.close();
				if (conn !=null)conn.close();
			} catch (SQLException e) {
				// TODO 자동 생성된 catch 블록
				e.printStackTrace();
			}
		}
		return cnt;
	}

	@Override
	public int update(GuestDTO gdto) {
		// TODO 자동 생성된 메소드 스텁
		int cnt = 0;
		Connection conn = DBConn.getConn();
		PreparedStatement pstmt = null;
		String sql = "UPDATE GUEST\r\n " + 
				"SET NAME = ?,\r\n " + 
				"EMAIL = ?,\r\n " + 
				"PASSWD = ?,\r\n " + 
				"CONTENT = ? \r\n " + 
				"WHERE SEQ = ? ";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1,gdto.getName());
			pstmt.setString(2,gdto.getEmail());
			pstmt.setString(3,gdto.getPasswd());
			pstmt.setString(4,gdto.getContent());
			pstmt.setInt(5, gdto.getSeq());
			cnt = pstmt.executeUpdate();
			System.out.println(cnt + "회 변경");
		} catch (SQLException e) {
			// TODO 자동 생성된 catch 블록
			e.printStackTrace();
		}finally {
			try {
				if (pstmt!=null)pstmt.close();
				if (conn !=null)conn.close();
			} catch (SQLException e) {
				// TODO 자동 생성된 catch 블록
				e.printStackTrace();
			}
		}
		return cnt;
	}

	@Override
	public int delete(int seq) {
		int cnt = 0;
		Connection conn = DBConn.getConn();
		PreparedStatement pstmt = null;
		String sql = "DELETE \r\n" + 
				"FROM GUEST\r\n" + 
				"WHERE SEQ = ?";
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, seq);
			cnt = pstmt.executeUpdate();
			System.out.println(cnt + "건 삭제");
		} catch (SQLException e) {
			// TODO 자동 생성된 catch 블록
			e.printStackTrace();
		}finally {
			try {
				if (pstmt!=null)pstmt.close();
				if (conn !=null)conn.close();
			} catch (SQLException e) {
				// TODO 자동 생성된 catch 블록
				e.printStackTrace();
			}
		}
		return cnt;
	}

	@Override
	public GuestDTO selectOne(int seq) {
		// TODO 자동 생성된 메소드 스텁
		return null;
	}

	@Override
	public List<GuestDTO> selectList() {
		// TODO 자동 생성된 메소드 스텁
		return null;
	}
	
	
}
