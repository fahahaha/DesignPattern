package adapter;

//适配器类
public class VoltageAapter extends Voltage220v implements Voltage5v {

	@Override
	public int outPut5v() {
		int srcV=outPut220v();
		int dstV=srcV/44;//转成5伏
		return dstV;
	}

}
