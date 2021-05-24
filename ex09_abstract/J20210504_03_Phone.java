package ex09_abstract;
interface Call{
	void call();
}
interface Photo{
	void photo();
}
interface Memo{
	void memo();
}
//전화, 사진찍기
class Phone implements Call, Photo{
	@Override
	public void photo() {
		System.out.println("512화소 사진찍기");
	}

	@Override
	public void call() {
		System.out.println("옛폰 전화걸기");
	}
}
//전화,사직찍기, 메모
class NewPhone implements Call, Photo, Memo{

	@Override
	public void memo() {
		System.out.println("메모기능");
	}

	@Override
	public void photo() {
		System.out.println("1024화소 사진찍기");
	}

	@Override
	public void call() {
		System.out.println("새폰 전화걸기");
		
	}
	
}
//폰사용
class PhoneUse{
	void call(Call p) {
		p.call();
	}
	void photo(Photo p) {
		p.photo();
	}
	void memo(Memo p) {
		p.memo();
	}
}

public class J20210504_03_Phone {

	public static void main(String[] args) {
		PhoneUse pu = new PhoneUse();
		Phone oldp = new Phone();
		NewPhone newp = new NewPhone();
		pu.call(oldp);
		pu.call(newp);
		pu.memo(newp);

	}

}
