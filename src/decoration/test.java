package decoration;

public class test {

	public static void main(String[] args) {
		//装饰模式订单 2份巧克力+一份牛奶的LongBlack
		
		//1.点一份LongBlack
		Drink order=new LongBlack();
		System.out.println("费用1= " +order.cost());
		System.out.println("描述1= " + order.getDes());
		
		//2.再加入一份牛奶
		order =new Milk(order);
		System.out.println("加入一份牛奶 费用= " +order.cost());
		System.out.println("加入一份牛奶 描述= " + order.getDes());
		
		//3.再加入一份巧克力
		order =new Chocolate(order);
		System.out.println("加入一份牛奶 加入一份巧克力 费用= " +order.cost());
		System.out.println("加入一份牛奶 加入一份巧克力 描述= " + order.getDes());
		
		//4.再加入一份巧克力
		order =new Chocolate(order);
		System.out.println("加入一份牛奶 加入2份巧克力 费用= " +order.cost());
		System.out.println("加入一份牛奶 加入2份巧克力 描述= " + order.getDes());
		
		/*显示
		               费用1= 5.0
				描述1=  LongBlack
				
				加入一份牛奶 费用= 7.0
				加入一份牛奶 描述= 牛奶 2.0 &&  LongBlack
				
				加入一份牛奶 加入一份巧克力 费用= 10.0
				加入一份牛奶 加入一份巧克力 描述= 巧克力 3.0 && 牛奶 2.0 &&  LongBlack
				
				加入一份牛奶 加入2份巧克力 费用= 13.0
				加入一份牛奶 加入2份巧克力 描述= 巧克力 3.0 && 巧克力 3.0 && 牛奶 2.0 &&  LongBlack*/
		
	}
}
