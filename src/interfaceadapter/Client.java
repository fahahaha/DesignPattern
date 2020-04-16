package interfaceadapter;

public class Client {

	public static void main(String[] args) {
		//利用匿名内部类的抽象类可以创建实例的方法
		AbsAdapter absAdapter=new AbsAdapter() {
			//只需要覆盖我们需要使用的方法
			@Override
			public void m1() {
				System.out.println("使用了m1");
			}
		};
		absAdapter.m1();
	}
}
