package ex_class;

import java.util.Arrays;

//책 클래스
//필드: 책코드(String), 책명(String), 단가(int), 할인율(double) 
//생성자, 게터,세터, toString
//메소드:판매금액계산(매개변수:수량(int), 반환값:판매금액(int))
//dto
class Book{
	private String bookCode;
	private String bookName;
	private int price;
	private double discountRate;
	public Book() {
		super();
	}
	public Book(String bookCode, String bookName, int price, double discountRate) {
		super();
		this.bookCode = bookCode;
		this.bookName = bookName;
		this.price = price;
		this.discountRate = discountRate;
	}
	public String getBookCode() {
		return bookCode;
	}
	public void setBookCode(String bookCode) {
		this.bookCode = bookCode;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public double getDiscountRate() {
		return discountRate;
	}
	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}
	@Override
	public String toString() {
		return "Book [bookCode=" + bookCode + ", bookName=" + bookName + ", price=" + price + ", discountRate="
				+ discountRate + "]";
	}

}

//책 관리 클래스
class Manager{
	//판매금액 합계
	//b001:0, b002:1
	private int[] tot = new int[10];
	int[] getTot() {
		return tot;
	}
	
	//판매금액 계산
	int saleCal(Book book ,int qty, int index) {
//		System.out.println(book);
//		System.out.println(qty);
		String bookcode = book.getBookCode();
		int price = book.getPrice();
		double discoutRate = book.getDiscountRate();	
		int totPrice = (int)(price - price*discoutRate) * qty;
		tot[index] += totPrice; //합계 누적
		return totPrice;
	}
	
}

public class J20210421_01_Book {
	public static void main(String[] args) {
		Book[] barr = new Book[10];

		barr[0] = new Book();
		barr[0].setBookCode("b001");
		barr[0].setBookName("자바프로그래밍");
		barr[0].setPrice(30000);
		barr[0].setDiscountRate(0.2);
		//System.out.println(b1);
		
		barr[1] = new Book("b002", "파이쎤프로그램", 18000, 0.15);
		
		Manager mg = new Manager();

		System.out.println("책코드   책명              판매금액");
		System.out.println("------------------------------");
		System.out.printf("%-8s %-10s %8d\n",  barr[0].getBookCode(), barr[0].getBookName(), mg.saleCal(barr[0], 5, 0));
		System.out.printf("%-8s %-10s %8d\n",  barr[0].getBookCode(), barr[0].getBookName(), mg.saleCal(barr[0], 3, 0));
		System.out.printf("%-8s %-10s %8d\n",  barr[1].getBookCode(), barr[1].getBookName(), mg.saleCal(barr[1], 2, 1));
		System.out.println("------------------------------");
		System.out.println(Arrays.toString(mg.getTot()));
		
		
		

	}

}
