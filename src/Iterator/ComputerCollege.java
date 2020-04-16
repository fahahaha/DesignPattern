package Iterator;

import java.util.Iterator;

public class ComputerCollege  implements College{

	Department[] departments;
	int numOfDepartment=0;//保存当前数组的对象个数
	
	public ComputerCollege(){
		departments=new Department[5];
		addDepartment("java", "java");
		addDepartment("php", "php");
		addDepartment("data", "data");
		addDepartment("python", "python");
	}
	
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "计算机学院";
	}

	@Override
	public void addDepartment(String name, String desc) {
		// TODO Auto-generated method stub
		Department department=new Department(name, desc);
		departments[numOfDepartment]=department;
		numOfDepartment++;
	}

	@Override
	public Iterator createIterator() {
		// TODO Auto-generated method stub
		return new  ComputerCollegeIterator(departments);
	}

}
