package flyweightstype;

import java.util.HashMap;

public abstract class FlyWeight {

	public abstract void operation(String extrinsicState);
	public static void main(String[] args) {
		FlyWeightFactory fwf=new FlyWeightFactory();
		FlyWeight fw=fwf.getFlyWeight("helloworld");
		fw.operation("红色");
		fw.operation("黄色");
		fw.operation("绿色");
		
		FlyWeight fw1=fwf.getFlyWeight("helloworld");
		fw1.operation("红色");
		fw1.operation("黄色");
		fw1.operation("绿色");
		
		FlyWeight fw2=fwf.getFlyWeight("hello design");
		fw2.operation("红色");
		fw2.operation("黄色");
		fw2.operation("绿色");
		
		
	}
}
/*helloworld:红色
helloworld:黄色
helloworld:绿色
已经创建过了 key：：：helloworld
helloworld:红色
helloworld:黄色
helloworld:绿色
hello design:红色
hello design:黄色
hello design:绿色*/
 class ConcreteFlyWeight extends FlyWeight{

	 private String intrinsicState;
	 
	public ConcreteFlyWeight(String intrinsicState) {
		this.intrinsicState = intrinsicState;
	}

	@Override
	public void operation(String extrinsicState) {
System.out.println(intrinsicState+":"+extrinsicState);		
	}
	
}
  class UnsharedConcreteFlyWeight extends FlyWeight{

	@Override
	public void operation(String extrinsicState) {
		// TODO Auto-generated method stub
		
	}
	 
 }
  
  class FlyWeightFactory{
	  private HashMap flyHashMap=new HashMap();
	  public FlyWeight getFlyWeight(String key){
		  if(flyHashMap.containsKey(key)){
			  System.out.println("已经创建过了 key：：："+key);
			  return (FlyWeight)flyHashMap.get(key);
			  
		  }else {
			  FlyWeight fw=new ConcreteFlyWeight(key);
			  flyHashMap.put(key, fw);
			  return fw;
		  }
	  }
  }
