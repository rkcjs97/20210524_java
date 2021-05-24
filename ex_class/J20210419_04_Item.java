package ex_class;
//상품클래스Item
class Item {
//필드:itemcode, itemname, price
	private String itemcode;
	private String itemname;
	private int price = 1000;
//메소드
//1)판매금액 계산: 매개변수(판매수량), 리턴값(판매금액);
	int pay(int a) {
		return price*a;
	}
	
	void setItemcode(String itemcode) {
		this.itemcode=itemcode;
	}
	void setItemname(String itemcode) {
		this.itemname=itemname;
	}
	void setPrice(int price) {
		this.price=price;
	}
	
	//getter
	String getItemcode() {
		return itemcode;
	}
	String getItemname() {
		return itemname;
	}
	int getPrice() {
		return price;
	}
	
}
public class J20210419_04_Item {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		Item item = new Item();
		item.setItemcode("0001");
		item.setItemname("스프라이트 제로");
		item.setPrice(1000);
		System.out.println(item.getItemcode()+" "+item.pay(3));
		
		Item item2 = new Item();
		item2.setItemcode("0002");
		item2.setItemname("코카콜라 제로");
		item.setPrice(1500);
		System.out.println(item2.getItemcode() +" "+item2.pay(10));
		

	}

}
