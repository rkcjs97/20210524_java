package ex07_jdbc.sale;

import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.Test;

class JunitTest {
	

	@Test
	void test() {
		
		SalesDAO sdao = new SalesDAO();
		List<Map<String, Object>> list = sdao.dayItemSaleList();
		//출력
		for(Map<String, Object> map:list) {
			System.out.println(map.get("saledate"));
			System.out.println(map.get("seq"));
			System.out.println(map.get("itemcode"));
			System.out.println(map.get("itemname"));
			System.out.println(map.get("qty"));
			System.out.println(map.get("amount"));
		}
	}

}
