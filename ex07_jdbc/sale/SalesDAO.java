package ex07_jdbc.sale;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import ex07_jdbc.DBConn;

public class SalesDAO {
	//일일 상품 판매리스트
	List<Map<String, Object>> dayItemSaleList(){
		
		Map<String,Object> map;// 매출 한 건 데이터 저장
		
		List<Map<String,Object>> list = new ArrayList<>();
		
		//connetction 객체 생성
		Connection conn = DBConn.getConn();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		StringBuffer sb = new StringBuffer();
		sb.append("SELECT S.SALEDATE,S.SEQ,S.ITEMCODE,I.ITEMNAME,S.QTY,S.AMOUNT ");
		sb.append("FROM SALES S INNER JOIN ITEM I ON(S.ITEMCODE=I.ITEMCODE) ");
		sb.append("ORDER BY S.SALEDATE, S.SEQ ");
		//pstmt
		try {
			pstmt = conn.prepareStatement(sb.toString());
			rs = pstmt.executeQuery();
			while(rs.next()) {
				String saledate = rs.getString("saledate");
				int seq = rs.getInt("seq");
				String itemcode = rs.getString("itemcode");
				String itemname = rs.getString("itemname");
				int qty = rs.getInt("qty");
				int amount = rs.getInt("amount");
				//System.out.println(saledate + itemcode + itemname+ qty);
				map = new HashMap<String, Object>();
				map.put("saledate", saledate);
				map.put("seq", seq);
				map.put("itemcode", itemcode);
				map.put("itemname", itemname);
				map.put("qty", qty);
				map.put("amount", amount);
				list.add(map);
				
			}
		} catch (SQLException e) {
			// TODO 자동 생성된 catch 블록
			e.printStackTrace();
		}
		
		return list;
		
		
	}

}
