package api.lang.object;
/*
 	 ���� ������ �����ϰ� �ִ� �ν��Ͻ��� ���� Ÿ���� �˾ƺ��� ���� instanceof �����ڸ� �̿��Ѵ�.
 	 ������ ����� true�� false�� �ϳ��� �����Ѵ�
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
		
		if( c instanceof FireCar){// �ν��Ͻ����� ��������  �� ���� ����.
			/*
		 		�ҹ��� Car Ÿ������ Ȯ�� �� .. �´ٸ� (FireCar)�� ��ü ĳ������ �ϴ°�
			 */
			FireCar f = (FireCar)c;
			f.driver();
			f.stop();
			f.shootWater();
			
		}else if (c instanceof Amblulance){
			/*
		 		�ҹ��� Car Ÿ������ Ȯ�� �� .. �´ٸ� (Amblulance)�� ��ü ĳ������ �ϴ°�
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
	void driver(){System.out.println("������...");}
	void stop(){System.out.println("����!!");}
}
class FireCar extends Car {
	void shootWater(){
		System.out.println("���Ѹ��� ��..");
	}
}
class Amblulance extends Car{
	void siren(){
		System.out.println("���̷� �︮�� ��..");
	}
}