package c;

public interface Drivable {
	public void drive();//추상메서드는 abstract를 써야 하지만 인터페이스는 모든모두 추상이므로 생략가능
	public void run();//구현부가 없어서 객체생성 불가능,DriveImpl에서 상속받게 하고구현부 생성
}
