package creationtype;
/*
 * 工厂方法（FactoryMethod）模式的定义：定义一个创建产品对象的工厂接口，
 * 将产品对象的实际创建工作推迟到具体子工厂类当中。这满足创建型模式中所要求的“创建与使用相分离”的特点。
 */
public class FatoryType {
	public static void main(String[] args) {
		Product a;
		AbstractFactory af;
		af=(AbstractFactory) FatoryReadXml.getObject();
		a=af.newProduct();
		a.show();
	}

}
//抽象产品，提供产品的接口
interface Product{
	public void show();
}
//具体产品1，实现了抽象产品中的抽象方法
class ConcreteProduct1 implements Product{

	@Override
	public void show() {
System.out.println("产品1显示了。。。。。");		
	}
	
}
//具体产品2，实现了抽象产品中的抽象方法
class ConcreteProduct2 implements Product{
	
	@Override
	public void show() {
		System.out.println("产品2显示了。。。。。");		
	}
	
}
//抽象工厂，提供厂品的接口
interface AbstractFactory{
	public Product newProduct();
}
//具体厂品1，实现了抽象厂品的抽象方法
class ConcreteFactory1 implements AbstractFactory{
	@Override
	public Product newProduct() {
		System.out.println("具体工厂1生成-->具体产品1");
		return new ConcreteProduct1();
	}
}

//具体厂品2，实现了抽象厂品的抽象方法
class ConcreteFactory2 implements AbstractFactory{
	@Override
	public Product newProduct() {
		System.out.println("具体工厂2生成-->具体产品2");
		return new ConcreteProduct2();
	}
}
