package ex07_jdbc.member;

import java.util.List;

public class J20210427_01_member {
	
	public static void main(String[] args) {
		// member 데이터 추가
		MemberDAO mdao = new MemberDAO(); //객체 생성
		while (true) {
			System.out.println("1.회원추가");
			System.out.println("2.회원수정");
			System.out.println("3.회원삭제");
			System.out.println("4.회원한명조회");
			System.out.println("5.회원전체조회");
			int no=1;
			if (no==5) { //전체조회
				List<MemberDTO> mlist = mdao.selectList();

			}else if (no==4) {//한건조회
				String userid = "java";
				MemberDTO mdto = mdao.selectOne(userid);
			}else if (no==1) {//추가
				String userid = "java";
				String passwd = "1111";
				int birthyear = 2006;
				MemberDTO mdto = new MemberDTO(userid, passwd, birthyear);
				int cnt = mdao.insert(mdto);
				if (cnt >0) {
					System.out.println("회원가입 완료");
				}else {
					System.out.println("회원가입 실패");
				}
				
			}else if (no==2) {//수정
				String userid = "java";
				String passwd = "1111";
				int birthyear = 2006;
				MemberDTO mdto = new MemberDTO(userid, passwd, birthyear);
			}else if (no==3) {//삭제
				
				
			}
		}
		
		

	}

}
