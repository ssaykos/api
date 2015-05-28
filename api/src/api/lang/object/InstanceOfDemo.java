package api.lang.object;
/*
 	 참조 변수가 참조하고 있는 인스턴스의 실제 타입을 알아보기 위해 instanceof 연산자를 이용한다.
 	 연산의 결과로 true와 false중 하나를 리턴한다
 */
public class InstanceOfDemo {
	public static void main(String[] args) {
		FireCar fireCar = new FireCar();
		Amblulance amblulance = new Amblulance();
		
		InstanceOfDemo test = new InstanceOfDemo();
		test.doWork(fireCar);
		test.doWork(amblulance);
		
	}
	public void doWork(Car c) {
		
		if( c instanceof FireCar){// 인스턴스보다 이퀄스를  더 많이 쓴다.
			/*
		 		소방차 Car 타입인지 확인 후 .. 맞다면 (FireCar)로 객체 캐스팅을 하는것//애매하면 아랫거 ㄱㄱ
		 		c가 소방차타입인지 엠뷸런스타입인지 확인후 맞는 속성으로 캐스팅
			 */
			FireCar f = (FireCar)c;
			f.driver();
			f.stop();
			f.shootWater();
			
		}else if (c instanceof Amblulance){
			/*
		 		소방차 Car 타입인지 확인 후 .. 맞다면 (Amblulance)로 객체 캐스팅을 하는것
			 */
			Amblulance  a= (Amblulance) c;
			a.driver();
			a.stop();
			a.siren();
		}
	}
}
class Car{
	String color;
	int door;
	void driver(){System.out.println("운전중...");}
	void stop(){System.out.println("스톱!!");}
}
class FireCar extends Car {
	void shootWater(){
		System.out.println("물뿌리는 중..");
	}
}
class Amblulance extends Car{
	void siren(){
		System.out.println("사이렌 울리는 중..");
	}
}