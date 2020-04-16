package decoration;

public class Decorator extends Drink{

	private Drink obj;
	
	public Decorator(Drink obj){
		this.obj=obj;
	}
	
	public float cost(){
		//getprice为拿到调料自己的价格
		return super.getPrice()+obj.cost();
		
	}
	@Override
	public String getDes() {
		// TODO Auto-generated method stub
		// obj.getDes()输出被装饰者的信息
		return des + " " +getPrice()+ " && "+obj.getDes();
	}
}

//具体的Decorator 调味品
class Chocolate extends Decorator{

	public Chocolate(Drink obj) {
		super(obj);
		setDes("巧克力");
		setPrice(3.0f);
	}
	
}
//具体的Decorator 调味品
class Milk extends Decorator{
	
	public Milk(Drink obj) {
		super(obj);
		setDes("牛奶");
		setPrice(2.0f);
	}
	
}
//具体的Decorator 调味品
class Soy extends Decorator{
	
	public Soy(Drink obj) {
		super(obj);
		setDes("豆浆");
		setPrice(1.5f);
	}
	
}