package adapter;

//被适配的类
public class Voltage220v {

	//输出220v的电压
	public int outPut220v(){
		int src=220;
		System.out.println("电压="+ src + "伏");
		return src;
	}
}
