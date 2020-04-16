package Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class InfoCollege implements College{

	//list形式存放
	List<Department> departments;
	int numOfDepartment=0;//保存当前数组的对象个数
	
	public InfoCollege(){
		departments=new ArrayList<Department>();
		addDepartment("信息安全", "信息安全专业");
		addDepartment("网络安全", "网络安全专业");
		addDepartment("服务器安全", "服务器安全专业");
	}
	
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "信息工程学院";
	}

	@Override
	public void addDepartment(String name, String desc) {
		// TODO Auto-generated method stub
		Department department=new Department(name, desc);
		departments.add(department);
	}

	@Override
	public Iterator createIterator() {
		// TODO Auto-generated method stub
		return new  InfoCollegeIterator(departments);
	}
}
