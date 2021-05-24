package ex10_interface;

import java.util.ArrayList;
import java.util.List;

interface ProductCorner{ //공산품코너
	void productNamePrint(String...s);
	public List<String> getProductItem(); 
	public void setProductItem(List<String> productItem);
}

interface MeatCornet{ //정육코너
	void meatNamePrint(String...s);
	public List<String> getMeatItem();
	public void setMeatItem(List<String> meatItem);
} 

interface  ClothCorner{ //의류코너
	void clothNamePrint(String...s);
}

class  HeadOffice{ //본사
	private String companyName ="국제 마트";
	private String registrationNumber = "888-88-88888";
	void companyInfoPrint() {
		System.out.println("★★★★★" + companyName + "★★★★★");
		System.out.println("[NO]" + registrationNumber);
	}
}

class Branch1 extends HeadOffice implements MeatCornet,ProductCorner{//지점1
	private String branchName="신림점";
	private List<String> meatItem; 
	private List<String> productItem; 
	
	//세터, 게터
	@Override
	public List<String> getProductItem() {
		// TODO 자동 생성된 메소드 스텁
		return null;
	}
	@Override
	public void setProductItem(List<String> productItem) {
		// TODO 자동 생성된 메소드 스텁
		this.productItem = productItem;
	}
	@Override
	public List<String> getMeatItem() {
		// TODO 자동 생성된 메소드 스텁
		return null;
	}
	@Override
	public void setMeatItem(List<String> meatItem) {
		// TODO 자동 생성된 메소드 스텁
		this.meatItem = meatItem;
		
	}  
	
	@Override
	public void productNamePrint(String...s) {
		System.out.println("[" + branchName +"] 공산품 코너");
		for(String item:s) {
			System.out.print(item + " ");
		}
		System.out.println();
	}
	@Override
	public void meatNamePrint(String...s) {
		System.out.println("[" + branchName +"] 정육점 코너");
		for(String item:s) {
			System.out.print(item + " ");
		}
		System.out.println();
	}
	
}

public class J20210506_01_mart {
	public static void main(String[] args) {
		Branch1 b1= new Branch1();
		b1.companyInfoPrint();
		System.out.println("--------------------");
		//공산품 코너: 가변인자
		b1.productNamePrint("생활용품","문구", "침구", "가전");
		//고기코너: 상품리스트 객체생성
		List<String> meatItem = new ArrayList<>();
		meatItem.add("소고기");
		b1.setMeatItem(meatItem);
		b1.meatNamePrint();
		
		
	}
}

