package ex11_guest;

public class J20210506_01_main {

	public static void main(String[] args) {
		//1. 방명록 작성
		//2, 방명록 수정
		//3. 방명록 삭제
		//4. 방명록 조회
		//9. 종료
		GuestDAO gdao = null;
		GuestDTO gdto = null;
		int cnt = 0;
		new GuestDAOImpl();
//		new GuestDTO("홍길동","hong@gmail.com","1111","가입인사");
//		gdao.insert(gdto);
		
		gdao = new GuestDAOImpl();
		gdto = new GuestDTO(36,"이순신","lee@naver.com","2222","하이");
		cnt = gdao.update(gdto);
		
		gdao = new GuestDAOImpl();
		cnt = gdto.getSeq();
		System.out.println(cnt);
		

	}

}
