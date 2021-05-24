package ex11_guest;

import java.util.List;

public interface GuestDAO {
	
	int insert(GuestDTO gdto);
	
	int update(GuestDTO gdto);
	
	int delete(int seq);
	
	GuestDTO selectOne(int seq);
	
	//전체조회
	List<GuestDTO> selectList();
}
