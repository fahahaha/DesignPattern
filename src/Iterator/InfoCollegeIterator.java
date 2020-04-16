package Iterator;

import java.util.Iterator;
import java.util.List;

public class InfoCollegeIterator implements Iterator {


	//需要知道department是以怎么样的方式存储-》List
	List<Department> departments;
	int index=-1;//索引，表示遍历到list的第几个
	
	public InfoCollegeIterator(List<Department> departments) {
		this.departments = departments;
	}

	//判断list是否还有下一个元素
	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		if(index>=departments.size()-1){
			return false;
		}else{
			index++;
			return true;
		}
	}

	//返回下一个元素
	@Override
	public Object next() {
		// TODO Auto-generated method stub
		return departments.get(index);
	}
	//空实现
	public void remove(){
		
	}
}
