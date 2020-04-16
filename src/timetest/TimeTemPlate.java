package timetest;



public class TimeTemPlate {

	public static void main(String[] args) {
	subTemplate sub=new subTemplate();
	sub.spendTime();
}
}



 abstract class Template {

	public void spendTime(){
		long start=System.currentTimeMillis();
		this.code();
		long end =System.currentTimeMillis();
		System.out.println("该代码运行时间是 ：" + (end-start)+"ms");
	}
	public abstract void code();
}
class subTemplate extends Template{

	@Override
	public void code() {
		for(int i=2;i<=1000;i++){
			boolean isFlag= true;
			for(int j=2 ; j<=Math.sqrt(i) ;j++){
				if(i % j == 0){
					isFlag=false;
					break;
				}
			}
			if(isFlag)
				System.out.println(i);

		}
	}
	
}
