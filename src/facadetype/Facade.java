package facadetype;

public class Facade {

	
	private SubSystemA obj1=new SubSystemA();
			private SubSystemB obj2=new SubSystemB();
			private SubSystemC obj3=new SubSystemC();
			public void method() {
				obj1.methodA();
				obj2.methodB();
				obj3.methodC();
			}
			
			public static void main(String[] args) {
				Facade facad =new Facade();
				facad.method();
			}
}
class SubSystemA{
	public void methodA() {
		System.out.println("方法一");
	}
}
class SubSystemB{
	public void methodB() {
		System.out.println("方法二");
	}
}
class SubSystemC{
	public void methodC() {
		System.out.println("方法三");
	}
}
