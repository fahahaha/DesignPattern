package creationtype;
/*
 * 抽象工厂模式是工厂方法模式的升级版本，工厂方法模式只生产一个等级的产品，而抽象工厂模式可生产多个等级的产品。

 * 
 */
public class AbstractFactoryType {
	public static void main(String[] args) {
		Product2 a;
		AbstractFactory1 af;
		af=(AbstractFactory1) AbstractFatoryReadXml.getObject();
		a=af.newProduct2();
		a.show();
	}

}
//抽象产品，提供产品的接口
interface Product1{
	public void show();
}
//具体产品1，实现了抽象产品中的抽象方法
class ConcreteProduct11 implements Product1{

	@Override
	public void show() {
System.out.println("产品11显示了。。。。。");		
	}
	
}

//抽象产品，提供产品的接口
interface Product2{
	public void show();
}
//具体产品1，实现了抽象产品中的抽象方法
class ConcreteProduct21 implements Product2{
	
	@Override
	public void show() {
		System.out.println("产品21显示了。。。。。");		
	}
	
}
//具体产品2，实现了抽象产品中的抽象方法
class ConcreteProduct22 implements Product2{
	
	@Override
	public void show() {
		System.out.println("产品22显示了。。。。。");		
	}
	
}
interface AbstractFactory1{
	public Product1 newProduct1();
	public Product2 newProduct2();
	
}
class ConcreteFactory11 implements AbstractFactory1
{
    public Product1 newProduct1()
    {
        System.out.println("具体工厂 1 生成-->具体产品 11...");
        return new ConcreteProduct11();
    }
    public Product2 newProduct2()
    {
        System.out.println("具体工厂 1 生成-->具体产品 21...");
        return new ConcreteProduct21();
    }
}