package adapter;

public class Client {

	//类适配器模式
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Phone phone=new Phone();
		phone.charging(new VoltageAapter());
		System.out.println();
	}

}
