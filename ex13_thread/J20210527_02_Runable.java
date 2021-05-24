package ex13_thread;
//스레드 2
class Thread2 implements Runnable{

	@Override
	public void run() {
		// TODO 자동 생성된 메소드 스텁
		for(int i=0; i<10;i++)
			System.out.println("runnable 스레드" + i);
	}
	
	
}
public class J20210527_02_Runable {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		Thread2 th2 = new Thread2();	
		Thread th = new Thread(th2);
		th.start();
		

	}

}
