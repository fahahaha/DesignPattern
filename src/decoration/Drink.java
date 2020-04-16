package decoration;
/**
 * 
 * @description
 *  
 *  星巴克咖啡加调料 结算 问题

单品咖啡是被装饰者coffee 调料是装饰者Decorator  两者都继承一个高层抽象类Drink

装饰者 是继承加组合的关系把 被装饰者 引入
 * @author whongf Email:214177702@qq.com
 * @version
 * @date 2020年3月7日下午4:20:11
 */
public abstract class Drink {
	
	public String des;
	private float price=0.0f;
	public String getDes() {
		return des;
	}
	public void setDes(String des) {
		this.des = des;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	//计算价格的抽象方法
	public abstract float cost();
}
//coffee类作为单品的共同点的集中点，是缓冲层
class Coffee extends Drink{

	@Override
	public float cost() {
		// TODO Auto-generated method stub
		return super.getPrice();
	}
	
}

//单品
class Espresso extends Coffee{

	public Espresso(){
		setDes(" 意大利咖啡");
		setPrice(6.0f);
	}
}
//单品
class LongBlack extends Coffee{

	public LongBlack(){
		setDes(" LongBlack");
		setPrice(5.0f);
	}
}
//单品
class ShortBlack extends Coffee{
	
	public ShortBlack(){
		setDes(" ShortBlack");
		setPrice(4.0f);
	}
}
