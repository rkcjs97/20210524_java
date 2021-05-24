package ex_class;

public class Bank {
	//필드 은행명, 계좌번호,잔액
		private String bankname;
		private String bankno;
		private int balance;
	    String[] arr = new String[2];

	//생성자, 게터, 세터
	//오버로딩
		public Bank(String bankname, String bankno,int balance){
		this.bankname = bankname;
		this.bankno = bankno;
		this.balance = balance;
		}
		
		public Bank(String bankname, String bankno) {
		super();
		this.bankname = bankname;
		this.bankno = bankno;
	}
		
		void setBankname(String bankname) {
			this.bankname = bankname;
			
		}
		void setBankno(String bankno) {
			this.bankno = bankno;
		}
		
		void setBalance(int balance) {
			this.balance=balance;
		}

		String getBankname() {
			return bankname;
		}
		String getBankno() {
			return bankno;
		}
		int getBalance() {
			return balance;
		}
		void deposit(int a) {
			balance += a;
		}
		int withdraw(int a) {
			if(balance-a<0) {
				return -1;
			}
			balance -= a;
			return 0;
		}

		//어노테이션
		//오버라이딩: 부모클래스의 메소드를 재정의
		@Override
		public String toString() {
			return "Bank [bankname=" + bankname + ", bankno=" + bankno + ", balance=" + balance + "]";
		}
		
	}
