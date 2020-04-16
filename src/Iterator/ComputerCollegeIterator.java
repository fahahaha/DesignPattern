package Iterator;

import java.util.Iterator;
//Iterator是内部提供的接口
public class ComputerCollegeIterator implements Iterator{
 
	 
	//需要知道department是以怎么样的方式存储-》数组
	Department[] departments;
	int position=0;//遍历的位置
	
	public ComputerCollegeIterator(Department[] departments) {
		this.departments = departments;
	}

	//判断是否还有下一个元素
	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		if(position>=departments.length|| departments[position]==null){
			return false;
		}else{
			return true;
		}
	}

	//返回下一个元素
	@Override
	public Object next() {
		// TODO Auto-generated method stub
		Department department=departments[position];
		position++;
		return department;
	}
	//空实现
	public void remove(){
		
	}
	

	

}
