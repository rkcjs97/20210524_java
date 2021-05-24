package ex13_thread;
//프로그램 : 소스를 컴파일해서 실행코드로 변환된 파일
//프로세스 : 실행파일이 cpu에 의해서 실행된 상태
//스레드 : 프로세스내에서 실행된느 세부 실행 단위
//멀티스레드 : 하나의 프로세스내에서 여러개의 스레드가 병행처리
//자바가 멀티스레드로 동작
class Thread1 extends Thread{
	
	@Override
	public void run() {
		for(int i = 0;i<10;i++) {
			System.out.println("thread1:"+i);
		}
		
	}
}
public class J20210527_01_thread {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁	
		Thread1 th1 = new Thread1();
		th1.start();
		
		for(int i = 0;i<10;i++) {
			System.out.println("main"+i);
		}
	}

}
