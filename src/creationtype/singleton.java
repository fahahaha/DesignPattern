package creationtype;
/*
 * 			Singleton 模式通常有两种实现形式。
     	第 1 种：懒汉式单例
			该模式的特点是类加载时没有生成单例，只有当第一次调用 getlnstance 方法时才去创建这个单例。代码如下： 
 * 			注意：如果编写的是多线程程序，则不要删除上例代码中的关键字 volatile 和 synchronized，否则将存在线程非安全的问题。如果不删除这两个关键字就能保证线程安全，但是每次访问时都要同步，会影响性能，且消耗更多的资源，这是懒汉式单例的缺点。
		第 2 种：饿汉式单例
			该模式的特点是类一旦加载就创建一个单例，保证在调用 getInstance 方法之前单例已经存在了。 
 *  		饿汉式单例在类创建的同时就已经创建好一个静态的对象供系统使用，以后不再改变，所以是线程安全的，可以直接用于多线程而不会出现问题。 
 * 
 */
public class singleton {
	public static void main(String[] args) {
		
		HunrySingleton h1=HunrySingleton.getInstance();
		HunrySingleton h2=HunrySingleton.getInstance();
		System.out.println(h1==h2);
		
		LayzySingleton l1=LayzySingleton.getInstance();
		LayzySingleton l2=LayzySingleton.getInstance();
		System.out.println(l1==l2);
		
	}
}
//第 1 种：懒汉式单例
class LayzySingleton{
	
	private static volatile LayzySingleton instance=null;
 
	private LayzySingleton (){

 }
	public static synchronized LayzySingleton getInstance(){
		if(instance==null){
			instance=new LayzySingleton();
		}
		return instance;
	}
 
 
}
//第 2 种：饿汉式单例（第一选择）
class HunrySingleton{
	//3.要求此对象也必须声明为static，这样方法才能调用，final能保证只赋值一次，可不加
	private static final HunrySingleton instance=new HunrySingleton();
	//1.私有化类的构造器
	private HunrySingleton(){
		
	}
	//2.提供公共的静态方法，返回类的对象
	public static HunrySingleton getInstance(){
		return instance;
	}
}