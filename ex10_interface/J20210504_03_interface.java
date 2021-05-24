package ex10_interface;

import java.util.ArrayList;
import java.util.List;

//클래스는 다중상속 불가
//인터페이스: 구현부가 없다(추상메소드), 다중상속가능, 객체생성불가
interface Attack{
	String name="포켓몬 공격"; //public static final 생략가능
	void attack(); //public abstract 생략가능
	//default : 일반메소드
	default void gameTime() {
		System.out.println("24시간 공격 가능");
	}
}

interface Sound{
	String name = "포켓몬 소리";
	void sound();
}
//피카
class Pikachu implements Attack,Sound{
	@Override
	public void attack() {
		System.out.println("전기공격");
	}

	@Override
	public void sound() {
		System.out.println("피카피카");
	}
}
//꼬부기
class Squirtle implements Attack ,Sound{
	@Override
	public void attack() {
		System.out.println("물공격");
	}

	@Override
	public void sound() {
		System.out.println("꼬북꼬북");
	}
}
//게임
class GamePlay{
	void attack(Attack attack) {
		attack.attack();
	}
	void sound(Sound sound) {
		sound.sound();
	}
}

public class J20210504_03_interface {
	public static void main(String[] args) {
		System.out.println(Attack.name);
		Pikachu pika = new Pikachu();
		Attack attack = new Pikachu();
		Sound sound = new Pikachu();
		GamePlay gp = new GamePlay();
		pika.gameTime(); 
		gp.attack(pika);
		gp.sound(pika);
		

	}

}

