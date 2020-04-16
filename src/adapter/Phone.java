package adapter;

public class Phone {

	//充电
	public void charging(Voltage5v voltage5v){
		if(voltage5v.outPut5v()==5){
			System.out.println("电压为5v ，可以充电。");
		} else if(voltage5v.outPut5v()>5){
			System.out.println("电压大于5v ，无法充电。");
		}
	}
}
