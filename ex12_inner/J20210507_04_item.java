package ex12_inner;
interface Item{
	
	void namePrint(String itemname);
}
//
////class ItemImpl implements Item{
////
////	@Override
////	public void namePrint(String itemname) {
////		// TODO 자동 생성된 메소드 스텁
////		System.out.println(itemname);
////	}
//	
//}
public class J20210507_04_item {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁			
		Item item = new Item() {
			@Override
			public void namePrint(String itemname) {
				System.out.println(itemname);
			}
		};
		
		item.namePrint("새우깡");

	}

}
