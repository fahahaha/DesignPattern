package Iterator;

import java.util.Iterator;
import java.util.List;

public class OutPutImp {

	//拿到学院集合
	List<College> collegeList;

	public OutPutImp(List<College> collegeList) {
		this.collegeList = collegeList;
	}
	
	//遍历所有学院
	public void printCollege(){
		//取出collegeList 中 所有的学院，java的list已经实现了iterator这个接口
		Iterator<College> iterator =collegeList.iterator();
		while(iterator.hasNext()){
			College college=iterator.next();
			System.out.println("==="+college.getName()+"====");
			printDepartment(college.createIterator());
		}
	}
	
	//输出 学院输出系
	public void printDepartment(Iterator iterator){
		while(iterator.hasNext()){
			Department d=(Department) iterator.next();
			System.out.println(d.getName());
		}
	}
}
